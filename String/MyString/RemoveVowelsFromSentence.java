package com.String.MyString;

import java.util.Scanner;

public class RemoveVowelsFromSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The Sentence");
		String sentence=sc.nextLine();
		
		//removing vowels
		
		String output=sentence.replaceAll("[AEIOUaeiou]", " ");
		System.out.println("Output is  : "+output);
	}
}

