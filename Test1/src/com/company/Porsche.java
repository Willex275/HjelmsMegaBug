package com.company;

public class Porsche extends Car {
	
	public Porsche() {
		
		super.name = "Porsche";
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
