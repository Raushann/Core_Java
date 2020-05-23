package com.String.Basic;
//trim()
public class P15 {
public static void main(String[] args) {
	String s="RAUSHAN";
	String s1=s.trim();
	System.out.println(s+"\t"+s1);
	
	String s2=" RAUSHAN";
	String s3=s2.trim();
	System.out.println(s2==s3);
	System.out.println(s2+"\t"+s2.length());
	System.out.println(s3+"\t"+s3.length());
	
	
}
}
