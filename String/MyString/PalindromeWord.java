package com.String.MyString;

import java.util.Scanner;

public class PalindromeWord {
	public static void main(String args[]){

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string ");

		String word= s.nextLine();
		String reverse = "";
		int length = word.length();
		for(int i = length - 1; i >= 0; i--)	{
			reverse = reverse + word.charAt(i);
		}

		if(word.equalsIgnoreCase(reverse)) {
			System.out.println("Given string is palindrome."); 
		}
		else {
			System.out.println("Given String is not palindrome.");
		}

	}
}
