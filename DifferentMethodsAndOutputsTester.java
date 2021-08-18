package com.syntax.class13;

public class DifferentMethodsAndOutputsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DifferentMethodsAndOutputs method = new DifferentMethodsAndOutputs();
		
		String name=method.method1();
		System.out.println(name);
		System.out.println("-------------");
		
		method.method2("Nailya"); //String name=method.method2("Nailya");
		System.out.println(name);
		System.out.println("-------------");
		
		method.method3();
		System.out.println("-------------");
		
		method.method4("Nailya");
		System.out.println("-------------");
		
		System.out.println(method.method5("Daulet")); //no output,
 
	}

}
