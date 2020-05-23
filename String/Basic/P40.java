package com.String.Basic;
//regionMatches()
public class P40 {
	public static void main(String[] args) {
		String s1="Website is www.qspiders.com";
		String s2="info@qspiders.com is id to send Email";
		
		boolean b1=s1.regionMatches(2, s2, 5, 10);
		/*
		 * 2=index of s1
		 * s2=another String
		 * 5=2nd s2 index
		 * 10=upto
		 */
		System.out.println(b1);
		
		boolean b2=s1.regionMatches(15, s2, 5,9);
		System.out.println(b2);//true
		
		boolean b3=s1.regionMatches(15, s2, 5, 12);
		System.out.println(b3);//true
		
		boolean b4=s1.regionMatches(15, s2, 5, 13);
		System.out.println(b4);//false
		
		String s3="INFO@QSPIDERS.COM is id to send Email";
		
		boolean b5=s1.regionMatches(15, s3, 5, 12);
		System.out.println(b5);//false
		
		boolean b6=s1.regionMatches(false,15, s3, 5, 12);
		System.out.println(b6);//false (it will be considered as case sensitive)
		
		boolean b7=s1.regionMatches(true,15, s3, 5, 12);
		System.out.println(b7);//true (it will ignore case sensitive)
		
		
		
		
	}

}
