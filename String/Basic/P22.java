package com.String.Basic;

public class P22 {
	public static void main(String[] args) {
		String s="Welcome to Qspiders, java Learning center, java world";
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("java",22));
		System.out.println(s.indexOf("java",43));
		System.out.println(s.indexOf("java",44));//-1
	}

}
