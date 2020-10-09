package com.edureka.java_j2ee.module8.inheritance.subclass;

public class Contract_Employee extends Employee {
	@Override
	public String toString() {
		return "Contract_Employee [pay_per_hour=" + pay_per_hour + ", contract_duration=" + contract_duration + "]";
	}

	private float pay_per_hour;
	private String contract_duration;

	public float getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(float payPerHour) {
		pay_per_hour = payPerHour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contractDuration) {
		contract_duration = contractDuration;
	}

}
