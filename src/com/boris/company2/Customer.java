package com.boris.company2;

//inheritance
public class Customer {
	
	private String name;
	private int age;
	
	//setters only
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
