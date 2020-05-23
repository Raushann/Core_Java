package com.String.Basic;
//replace()
public class P19 {
	public static void main(String[] args) {
		String s="Hi,Welcome to Qspiders(Java Learning Class),Java World";
		System.out.println(s);
		System.out.println("***************************");
		
		String s1=s.replace('Q', 'J');//multiple occurance
		System.out.println(s1);
		System.out.println("***************************");
		
		String s2=s.replaceFirst("Java", "Core Java");//only first occurance
		System.out.println(s2);
		System.out.println("***************************");
		
		String s3=s.replaceAll("Java", "J2EE");//All occurance
		System.out.println(s3);
		System.out.println("***************************");
		
		System.out.println(s);
		
		
	}

}
