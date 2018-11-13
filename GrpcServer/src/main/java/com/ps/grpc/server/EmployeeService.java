package com.ps.grpc.server;

import com.ps.grpc.messages.EmployeeServiceGrpc;
import com.ps.grpc.messages.Message;
import com.ps.grpc.messages.Message.EmployeeRequest;
import com.ps.grpc.messages.Message.EmployeeResponse;
import com.ps.grpc.messages.Message.GetAllRequest;
import com.ps.grpc.messages.Message.GetByBadgeNumberRequest;

import io.grpc.stub.StreamObserver;

public class EmployeeService extends EmployeeServiceGrpc.EmployeeServiceImplBase {
	@Override
	public void getByBadgeNumber(GetByBadgeNumberRequest request, 
			StreamObserver<EmployeeResponse> responseObserver) {
		for (Message.Employee e : Employees.getInstance()) {
			if (e.getBadgeNumber()==request.getBadgeNumber()) {
				Message.EmployeeResponse response = Message.EmployeeResponse.newBuilder()
				.setEmployee(e)
				.build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
				return;
			}
		}
		responseObserver.onError(new Exception("Employee not found "+request.getBadgeNumber()));
	}
	
	@Override
	public void getAll(GetAllRequest request, 
			StreamObserver<EmployeeResponse> responseObserver) {
		for (Message.Employee e : Employees.getInstance()) {
			Message.EmployeeResponse response = Message.EmployeeResponse.newBuilder()
					.setEmployee(e)
					.build();
			responseObserver.onNext(response);
		}
		responseObserver.onCompleted();
	}
	
	@Override
	public StreamObserver<EmployeeRequest> saveAll(StreamObserver<EmployeeResponse> responseObserver) {
		return new StreamObserver<Message.EmployeeRequest>() {

			@Override
			public void onNext(EmployeeRequest value) {
				Employees.getInstance().add(value.getEmployee());
				responseObserver.onNext(
						Message.EmployeeResponse.newBuilder()
						.setEmployee(value.getEmployee())
						.build()
						);
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				for (Message.Employee e : Employees.getInstance()) {
					System.out.println(e);
				}
				responseObserver.onCompleted();
				
			}
			
		};
	}
	

}
