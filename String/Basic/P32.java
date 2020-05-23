package com.String.Basic;
//split()
public class P32 {
	public static void main(String[] args) {
		String s="Welcome to Qspiders Worlds Best Institute for testing and training";
		
		String result[]=s.split(" ");
		System.out.println(result.length);
		
		for (int i = 0; i < result.length; i++) {
			String s1=result[i];
			System.out.println(i+"\t"+s1);
		}
	}

}
