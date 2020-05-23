package com.String.Basic;
//matches() more characters
public class P36 {
public static void main(String[] args) {
	String exp="[A-Z]*";
	System.out.println("H".matches(exp));//true
	System.out.println("RAUSHAN".matches(exp));//true
	System.out.println("KUMAR".matches(exp));//true
	System.out.println("QSPIDERS".matches(exp));//true
	
	System.out.println("Qspiders".matches(exp));//false
	
}
}
