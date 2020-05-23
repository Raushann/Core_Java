package com.String.Basic;
//endsWith()
public class P18 {
	public static void main(String[] args) {
		String s="Hi, Welcome to Qspiders";

		System.out.println(s.endsWith("Hi"));//false

		System.out.println(s.endsWith("Welcome"));//false

		System.out.println("**************");

		System.out.println(s.startsWith(""));//true
		
		System.out.println(s.endsWith(""));//true
		
		
	}

}
