package com.syntax.class13;

public class GreetingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Line in the main method");
		ClassAndObjectGreeting GreetingTester=new ClassAndObjectGreeting();
		GreetingTester.sayHello();
		System.out.println("Line after the method call");
		GreetingTester.printNumber(10); //10
		GreetingTester.sayHelloManyTimes(5); //5 times "Hello Batch 10!"
	}

}
