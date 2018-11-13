package com.ps.grpc.server;

import java.util.ArrayList;

import com.ps.grpc.messages.Message;

public class Employees extends ArrayList<Message.Employee>{
	private static Employees employees;
	
	public static Employees getInstance() {
		if (employees == null) {
			employees = new Employees();
		}
		return employees;
	}
	private Employees() {
		this.add(Message.Employee.newBuilder()
				.setId(1)
				.setBadgeNumber(2080)
				.setFirstName("Edgar")
				.setLastName("Mercado")
				.setVacationAccrualRate(2)
				.setVacationAccrued(30)
				.build()
				);
		this.add(Message.Employee.newBuilder()
				.setId(1)
				.setBadgeNumber(1)
				.setFirstName("Carlos")
				.setLastName("Mercado")
				.setVacationAccrualRate(2)
				.setVacationAccrued(30)
				.build()
				);
		this.add(Message.Employee.newBuilder()
				.setId(1)
				.setBadgeNumber(2)
				.setFirstName("Tumbotle")
				.setLastName("Soto")
				.setVacationAccrualRate(2)
				.setVacationAccrued(30)
				.build()
				);
	}

}
