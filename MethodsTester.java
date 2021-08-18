package com.syntax.class13;

public class MethodsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsWithParameters method = new MethodsWithParameters();
		method.RepeatWords(3, "Syntax");
		System.out.println();
		System.out.println("----------------");
		method.RepeatWords(7, "Syntax");
		System.out.println();
		
		System.out.println("----------------");
		method.isItRaining(false); //Let's go for a walk
		method.isItRaining(true); //Please don't forget an umbrella

		System.out.println("----------------");
		int sum=method.add(11, 22); //33
		System.out.println(sum);
	}

}
