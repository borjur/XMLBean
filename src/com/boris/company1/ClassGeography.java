package com.boris.company1;

public class ClassGeography implements Geography{

	private History history;
	
	public String whatCountryIsit(){
		
		Long cityOne = this.history.findCity("Murray");
		Long cityTwo = this.history.findCity("Sandy");
		return String.valueOf(cityOne/cityTwo);
		
		
		
	}

	public void setHistory(History history) {
		this.history = history;
	}
	
	
	
}
