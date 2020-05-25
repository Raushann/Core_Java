package com.String.MyString;

import java.util.Scanner;

public class PalindromeWordInString {
	public static void main(String args[]){

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string ");

		String sentence= s.nextLine();
		String words []=sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			if(isPalindrome(words[i])) {
				System.out.println(words[i] +" is Palindrome");
			}
		}
	}
	
	public static boolean isPalindrome (String word) {
		String reverse = "";
		int length = word.length();
		for(int i = length - 1; i >= 0; i--)	{
			reverse = reverse + word.charAt(i);
		}
		if(word.equalsIgnoreCase(reverse)) {
			return true;
		}
		else {
			return false;
		}
	}
}
