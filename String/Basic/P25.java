package com.String.Basic;
//substring()
public class P25 {
	public static void main(String[] args) {
	String s="Qspiders Bangalore";
	int len=s.length();
	System.out.println(s.substring(9,len));//Bangalore
	System.out.println(s.substring(9,len-1));//Bangalor
	System.out.println(s.substring(9,len-3));//Bangal
	}

}
