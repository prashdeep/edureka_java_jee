package com.edureka.java_jee_module5;

class EmployeeOnboarding {
	private long emp_id;
	private String address;
	private String empName;

	public void onboardEmployee(long id, String name, String address) {
		this.emp_id = id;
		this.empName = name;
		this.address = address;
		System.out.println("Onboarding the Employee");
		BackgroundVerification verify = new BackgroundVerification();
		if (verify.verifyEmoloyee(id)){
			System.out.println("Onboard the employye");
		}else{
			System.out.println("Reject the employee..");
		}
	}
	
	public String getAddress(){
		return this.getAddress();
	}

	class BackgroundVerification {
		
		private boolean verifyEmoloyee(long empId){
			System.out.println("Verifying the employee name .. " +empName);
			System.out.println("Verfying the employee address "+address);
			return true;
		}

	}

}

public class TestEmployeeOnboarding{
	public static void main(String[] args) {
		EmployeeOnboarding eboaring  = new EmployeeOnboarding();
		eboaring.onboardEmployee(2345, "Pradeep", "Bangalore");
	}
}
