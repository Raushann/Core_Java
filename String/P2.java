package com.String;

public class P2 {
	public static void main(String[] args) {

		String s1="Raushan";

		String s2=new String("Raushan");

		String s3=new String("Raushan");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);	
	}

}
