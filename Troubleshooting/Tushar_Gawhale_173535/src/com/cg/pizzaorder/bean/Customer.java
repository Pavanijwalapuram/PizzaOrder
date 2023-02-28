package com.cg.pizzaorder.bean;

public class Customer {

	// declare fields
	private int customerId;
	private String custName;
	private String address;
	private String phone;

	public Customer(int customerId, String address, String custName, String phone) {
		super();
		this.customerId = customerId;
		this.custName = custName;
		this.address = address;
		this.phone = phone;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getters and setters
	public int getCustomerId() {
		return customerId;
	}

	public  void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
