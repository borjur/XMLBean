package com.boris.company3;

import org.springframework.beans.factory.annotation.Autowired;

public class AnnotadedAnimal {
	@Autowired
	private Cat cat1;
	@Autowired
	private Cat cat2;
	@Autowired
	private Dog dog;
	
	
	
	public Cat getCat1() {
		return cat1;
	}



	public void setCat1(Cat cat1) {
		this.cat1 = cat1;
	}



	public Cat getCat2() {
		return cat2;
	}



	public void setCat2(Cat cat2) {
		this.cat2 = cat2;
	}



	public Dog getDog() {
		return dog;
	}



	public void setDog(Dog dog) {
		this.dog = dog;
	}



	@Override
	public String toString() {
		return "AnnotadedAnimal [cat1=" + cat1 + ", cat2=" + cat2 + ", dog="
				+ dog + "]";
	}
	
	

}
