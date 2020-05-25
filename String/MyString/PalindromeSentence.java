package com.String.MyString;
// input a b  c  b a output is palindrome
import java.util.Scanner;

public class PalindromeSentence {
	public static void main(String args[]){

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string ");

		String sentence= s.nextLine();
		sentence.replaceAll("[ ]", "");
		System.out.println(sentence);
		String reverse = "";
		int length = sentence.length();
		for(int i = length - 1; i >= 0; i--)	{
			reverse = reverse + sentence.charAt(i);
		}

		if(sentence.equalsIgnoreCase(reverse)) {
			System.out.println("Given string is palindrome."); 
		}
		else {
			System.out.println("Given String is not palindrome.");
		}
	}
	
	
}
