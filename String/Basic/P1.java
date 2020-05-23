package com.String.Basic;

public class P1 {
	public static void main(String[] args) {
		String s1="Raushan";
		
		String s2=new String("Raushan");
		
		String s3=s2.intern();
		
		System.out.println(s1==s2);//ref comparison
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		
		System.out.println("***************");
		
		String s4="OK".intern();
		String s5="OK";
		
		System.out.println(s4==s5);
		
		System.out.println("************");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

}
