package com.company;

public class Ford extends Car {

	public Ford(){
		
		super.name = "Ford";
	}

	@Override
	void run() {
		System.out.println("moving");
		
	}

	@Override
	void fuel() {
		System.out.println("fill up gas");
		
	}

	@Override
	void crash() {
		System.out.println("Bogrhyegffyfegy");
		
	}
	
	

}
