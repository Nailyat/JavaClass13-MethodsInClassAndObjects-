package com.syntax.class13;

public class DifferentMethodsAndOutputs {
	
	String method1() { //brackets are empty, because information in quotation
		return "Nailya"; //only one return in one method (w/o if condition)
	}
	
	String method2(String name) { //we can put information in brackets and output it 
		return name;
	}
	
	void method3() { //output w/o syso and brackets are empty, because information in quotation in syso
		System.out.println("Nailya");
	}
	
	void method4(String name) { //we can put information in brackets and output it w/o syso
		System.out.println(name);
	}
	
	String method5(String name) { //if we put some other information in brackets, there is no output
		return "Nailya";
	}

	
}
