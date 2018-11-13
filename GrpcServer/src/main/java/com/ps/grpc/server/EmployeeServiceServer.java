package com.ps.grpc.server;

import java.io.File;
import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptor;
import io.grpc.ServerInterceptors;
import io.grpc.ServerServiceDefinition;

public class EmployeeServiceServer {
	public static void main(String[] args) {
		try {
		EmployeeServiceServer employServiceServer = new EmployeeServiceServer();
		employServiceServer.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Server server;
	
	private void start() throws Exception {
		final int port = 9000;
		
		File cert = new File("D:\\data\\grpc-test\\certs\\cert.pem");
		File key = new File("D:\\data\\grpc-test\\certs\\key.pem");
		
		EmployeeService employeeService = new EmployeeService();
		ServerServiceDefinition servideDef = 
				ServerInterceptors.interceptForward(employeeService, new HeaderServerIncerceptor());
		
		server = ServerBuilder.forPort(port)
				.useTransportSecurity(cert, key)
				.addService(servideDef)
				.build()
				.start();
		System.out.println("Listening on port "+ port);
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("Shutting down server");
				EmployeeServiceServer.this.stop();
			}
		});
		server.awaitTermination();
	}
	private void stop() {
		if (server !=null) {
			server.shutdown();
		}
	}
}
