package com.String.Basic;
//equals and equalsIgnoreCase
public class P8 {
	public static void main(String[] args) {
		String s1=new String("RAUSHAN");
		String s2=new String("RAUSHAN");
		String s3=new String("raushan");
		
		System.out.println(s1+"\t"+s2+"\t"+s3);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println("---------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
	}

}
