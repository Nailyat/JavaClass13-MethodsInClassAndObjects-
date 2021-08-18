package com.syntax.class13;

public class MethodReturnTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodReturn method = new MethodReturn();
		double results=method.getMax(12, 155); //155
		
		System.out.println("------------");
		System.out.println(method.getMin(12, 155)); //12
		
		System.out.println("-----Example w/o return-------");
		method.getMaxWithOutReturn(23, 159); //159

	}

}
