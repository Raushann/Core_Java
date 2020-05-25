package com.String.MyString;

import java.util.Scanner;

public class RemoveVowelsWithoutUsingLib {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The Sentence");
		String sentence=sc.nextLine();
		
		String output="";
		int length=sentence.length();
		for (int i = 0; i < length; i++) {
			if ("AEIOUaeiou".indexOf(sentence.charAt(i))==-1) {
			
				output= output + sentence.charAt(i);
			}
		}
		System.out.println("Output is : "+output);
	}

}
