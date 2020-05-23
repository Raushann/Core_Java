package com.String.Basic;
//charAt()
public class P27 {

	public static void main(String[] args) {
		String s="Qspiders Bangalore";
		int len=s.length();
		
		System.out.println(s);
		
		System.out.println(s.charAt(0));
		
		System.out.println(s.charAt(3));
		
		System.out.println("************");
		for (int i = 0; i < len; i++) {
			System.out.println(i+"\t"+s.charAt(i));
		}
		
	}
}
