package com.String.Basic;
//matches() only one character
public class P35 {
	public static void main(String[] args) {
		String exp="[A-Z]";//only one character matches
		
		System.out.println("H".matches(exp));//true
		System.out.println("K".matches(exp));//true
		System.out.println("k".matches(exp));//false
		System.out.println("HI".matches(exp));//false, two characters matching
		
		
	}

}
