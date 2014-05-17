package com.boris.company3;

//Autowiring
public class Animal {
	
	private Cat cat1;
	private Cat cat2;
	private Dog dog;
	
	public Animal(){
			System.out.println(" Animal() ");
	}
	
	

	public void setCat1(Cat cat1) {
		System.out.println(" setCat1(Cat cat1) ");
		this.cat1 = cat1;
	}



	public void setCat2(Cat cat2) {
		System.out.println(" setCat2(Cat cat2) ");
		this.cat2 = cat2;
	}



	public void setDog(Dog dog) {
		System.out.println(" setDog(Dog dog) ");
		this.dog = dog;
	}

	public void setDogDep(Dog dog) {
		System.out.println("setDogDep(Dog dog) ");
		this.dog = dog;
	}


	@Override
	public String toString() {
		return "Animal [cat1=" + cat1 + ", cat2=" + cat2 + ", dog=" + dog + "]";
	}

	
}
