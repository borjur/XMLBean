package com.boris.company;

public class Student {
	
	private String name;
	private int age;
	private boolean graduated;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGraduated() {
		return graduated;
	}
	public void setGraduated(boolean graduated) {
		this.graduated = graduated;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", graduated="
				+ graduated + "]";
	}
	
	

}
