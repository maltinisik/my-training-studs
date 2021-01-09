package com.metalt.unit1;

public class Greeter {

	public void greet(Greeting g) {
       g.perform();
	}
	
	public static void main(String[] args) {

		Greeter g = new Greeter(); 
	    g.greet(new HelloWorldGreeting());
	    
	    Greeting lamdaGreeting = () -> System.out.println("Hello world!");

	}
}
