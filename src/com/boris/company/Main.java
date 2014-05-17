package com.boris.company;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.boris.company1.Geography;

;
public class Main {
	
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource(
		        "context.xml"));
		
		Student simple = (Student) factory.getBean("student");
		System.out.println(simple);
		
		// -------------------------------1------------------------
		System.out.println();
		Geography geo = (Geography) factory.getBean("geography");
		System.out.println("The city is " + geo.whatCountryIsit());
		
		// -------------------------------2------------------------
		System.out.println();
		 System.out.println(factory.getBean("bean1"));
		    System.out.println(factory.getBean("bean2"));
		    
		 // -------------------------------3 animal------------------------
		    System.out.println();
		    System.out.println("byName:");
		    System.out.println(factory.getBean("byName"));
		    System.out.println("byType:");
		    System.out.println(factory.getBean("byType"));
		    System.out.println("constructor:");
		    System.out.println(factory.getBean("constructor"));

		    System.out.println("autodetect:");
		    System.out.println(factory.getBean("autodetect"));
		  
		 // -------------------------------3 anotated animal------------------------  
		    System.out.println();
		    System.out.println("annotatedTarget:");
		    System.out.println(factory.getBean("annotatedTarget"));
	}

}
