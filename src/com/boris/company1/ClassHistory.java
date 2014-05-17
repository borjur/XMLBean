package com.boris.company1;

import java.util.HashMap;
import java.util.Map;

public class ClassHistory implements History{

	private Map<String,Long> cityVal = new HashMap<String,Long>();
	
	
	
	public ClassHistory() {
		
		this.cityVal.put("Murray",  (long) 11111);
		this.cityVal.put("Sandy",  (long) 22222);
	}


   // its like a getter method
	@Override
	public Long findCity(String city) {
		// TODO Auto-generated method stub
		return this.cityVal.get(city);
	}

}
