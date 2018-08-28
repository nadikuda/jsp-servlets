package com.cg.bean;

public class CustomerBean {

	private String name;
	private String city;
	private String mobile;
	
	public CustomerBean() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public CustomerBean(String name, String city, String mobile) {
		super();
		this.name = name;
		this.city = city;
		this.mobile = mobile;
	}
	
}
