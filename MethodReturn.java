package com.syntax.class13;

public class MethodReturn {
	
	double getMax(double num1, double num2) {
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	double getMin(double num1, double num2) {
		if(num1<num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	// void method (w/o return)
	void getMaxWithOutReturn(double num1, double num2) {
		if(num1<num2) {
			System.out.print(num1);
		}else {
			System.out.print(num2);
		}
	
	}

}
