package com.ps.grpc.client;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.ps.grpc.messages.EmployeeServiceGrpc;
import com.ps.grpc.messages.EmployeeServiceGrpc.EmployeeServiceBlockingStub;
import com.ps.grpc.messages.EmployeeServiceGrpc.EmployeeServiceStub;
import com.ps.grpc.messages.Message;
import com.ps.grpc.messages.Message.EmployeeResponse;

import io.grpc.Channel;
import io.grpc.ClientInterceptors;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;

public class EmployeeServiceClient {
 public static void main(String[] args) throws Exception {
	ManagedChannel channel = 
			NettyChannelBuilder.forAddress("localhost", 9000)
			.sslContext(GrpcSslContexts.forClient()
					.trustManager(new File("D:\\\\data\\\\grpc-test\\\\certs\\\\cert.pem")).build())
			.build();
	EmployeeServiceGrpc.EmployeeServiceBlockingStub blockingClient =
			EmployeeServiceGrpc.newBlockingStub(channel);
	
	EmployeeServiceGrpc.EmployeeServiceStub nonBlockingClient =
			EmployeeServiceGrpc.newStub(channel);
	
	switch (Integer.parseInt(args[0])) {
	case 1:
			sendMetadata(blockingClient);
		break;
	case 2:
			getByBadgeNumber(blockingClient);
		break;
	case 3:
			getAll(blockingClient);
		break;
	case 4:
			saveAll(nonBlockingClient);
		break;
	default:
		break;
	}
	
	Thread.sleep(5000);
	channel.shutdown();
	channel.awaitTermination(1, TimeUnit.SECONDS);
 }

private static void saveAll(EmployeeServiceStub nonBlockingClient) {
	System.out.println("Saving all");
	List<Message.Employee> employees = new ArrayList<Message.Employee>();
	employees.add(Message.Employee.newBuilder()
			.setBadgeNumber(10)
			.setFirstName("Wanda")
			.setLastName("MErcad")
			.setVacationAccrualRate(1.2f)
			.build());
	employees.add(Message.Employee.newBuilder()
			.setBadgeNumber(20)
			.setFirstName("fsdf")
			.setLastName("sfsdf")
			.setVacationAccrualRate(1.2f)
			.build());
	
	StreamObserver<Message.EmployeeRequest> stream = 
			nonBlockingClient.saveAll(new StreamObserver<Message.EmployeeResponse>() {

				@Override
				public void onNext(EmployeeResponse value) {
					System.out.println(value.getEmployee());
					
				}

				@Override
				public void onError(Throwable t) {
					System.out.println(t);
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					
				}
			});
	
	for (Message.Employee e : employees) {
		Message.EmployeeRequest request = Message.EmployeeRequest.newBuilder()
				.setEmployee(e)
				.build();
		stream.onNext(request);
	}
	stream.onCompleted();
}

private static void getAll(EmployeeServiceBlockingStub client) {
	Iterator<Message.EmployeeResponse> iterator =
	client.getAll(Message.GetAllRequest.newBuilder().build());
	while (iterator.hasNext()) {
		System.out.println(iterator.next().getEmployee());
	}
}

private static void getByBadgeNumber(EmployeeServiceBlockingStub blockingClient) {
	Message.EmployeeResponse response = 
			blockingClient.getByBadgeNumber(
					Message.GetByBadgeNumberRequest.newBuilder()
					.setBadgeNumber(2080)
					.build());
	System.out.println(response.getEmployee());
	
}

private static void sendMetadata(
		EmployeeServiceBlockingStub blockingClient) {
	Metadata md = new Metadata();
	md.put(Metadata.Key.of("username", Metadata.ASCII_STRING_MARSHALLER),
			"edgar");
	md.put(Metadata.Key.of("password", Metadata.ASCII_STRING_MARSHALLER),
			"secret");
	Channel ch = ClientInterceptors.intercept(blockingClient.getChannel(), 
			MetadataUtils.newAttachHeadersInterceptor(md));
	blockingClient.withChannel(ch).getByBadgeNumber(Message.GetByBadgeNumberRequest.newBuilder().build());
}
 
}
