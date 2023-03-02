package com.example.demo;

public class Employee
{
      private int pincode;
      private String employeeName;
      private String address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int pincode, String employeeName, String address) {
		super();
		this.pincode = pincode;
		this.employeeName = employeeName;
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
   
}
