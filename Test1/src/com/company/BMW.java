package com.company;

public class BMW extends Car{
	
	public BMW() {
		super.name = "BMW";
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
