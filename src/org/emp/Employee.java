package org.emp;

public class Employee {

	public void empId() {
		System.out.println("IdCard");
	}
	public void empName() {
		System.out.println("Suriya");
	}
	public void empDob() {
		System.out.println("23.07.1975");
	}
	public void empPhone() {
		System.out.println("9841891000");
	}
	public void empEmail() {
		System.out.println("info@agaram.in.");
	}
	public void empAddress() {
		System.out.println("Chennai");
	}
	public static void main(String[]args) {
		Employee e=new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
}
