package com.String.Basic;

public class P33 {
public static void main(String[] args) {
	String s="JSpiders, java learning center ,No.1 in java training and placement";
	System.out.println(s);
	String result[]=s.split("java",1);//it will stop splitting on 1st occurance
	System.out.println(result.length);
	
	for (int i = 0; i < result.length; i++) {
		String s1=result[i];
		System.out.println(i+"\t"+s1);
	}
	
	String result1[]=s.split("java",2);//it will stop splitting on 1st occurance
	System.out.println(result1.length);
	
	for (int i = 0; i < result1.length; i++) {
		String s2=result1[i];
		System.out.println(i+"\t"+s2);
		
	}
	
	
	
	
}
}
