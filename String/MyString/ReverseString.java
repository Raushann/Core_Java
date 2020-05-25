package com.String.MyString;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The String ");
		
		String str=s.nextLine();
		
		System.out.println("Enetred String is : "+str);
		System.out.println("***************************");
		
		char [] ch=str.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		String str1[]=str.split(" ");
	    for (int i =  str1.length-1; i >= 0; i--) {
			System.out.print(str1[i]+" ");
		}
	    System.out.println();
	    
	    for (int i = 0; i < str1.length; i++) {
			char [] ch1=str1[i].toCharArray();
			for (int j = ch1.length-1; j >=0; j--) {
				System.out.print(ch1[j]);	
			}
			System.out.print(" ");
			
		}
	   
		
		
		
		
	}

}
