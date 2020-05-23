package com.String.Basic;

public class P4 {
	public static void main(String[] args) {
		String s1="Raushan123";
		final String s2="Raushan";
		final int ab=123;
		String s3=s2+ab;
		String s4="Raushan"+123;
		
		
		System.out.println(s1+"\t"+s3+"\t"+s4);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
	}

}
