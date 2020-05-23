package com.String.Basic;

public class P31 {
	public static void main(String[] args) {
		char [] ch= {'Q','s','p','i','d','e','r','s'};
		byte [] b= {65,66,67,68,69,70};
		
		String s=new String(ch,3,5);
		/*
		 * 3=from 3rd index
		 * 5=count of elements
		 */
		String s1=new String(b,0,5);
		
		System.out.println("s : "+s);
		System.out.println("b : "+s1);
		
		
	}

}
