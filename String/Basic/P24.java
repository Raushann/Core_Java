package com.String.Basic;

public class P24 {
	public static void main(String[] args) {
		String s="Welcome to Qspiders, java learning center, no 1 in java traning and placement";
		System.out.println(s);
		
		System.out.println(s.lastIndexOf("java"));//51
		System.out.println(s.lastIndexOf("java",20));//-1
		System.out.println(s.lastIndexOf("java",50));//21
		
		System.out.println(s.indexOf("java"));//21
		
	}

}
