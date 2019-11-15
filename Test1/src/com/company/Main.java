package com.company;

public class Main {

	public static void main(String[] args) {
		
		Car[] cars = {new Volvo(), new Ford(), new BMW(), new Porsche() };
		for(Car function : cars) {
			System.out.println(function.name);
			function.crash();
			function.fuel();
			function.run();
			
			System.out.println();
		}
		
		
		
	}
}
		
	


