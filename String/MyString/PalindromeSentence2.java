package com.String.MyString;

import java.util.Scanner;

public class PalindromeSentence2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string ");

		String sentence= s.nextLine();
		
		String [] words=sentence.split("\\s+");
		int length=words.length;
		
		boolean isPalindrome=false;
		
		for (int i = 0 ,j=length-1 ; i < words.length && j>=0; i++ , j--) {
				if (words[i].equalsIgnoreCase(words[j])) {
					isPalindrome=true;
				}
				else {
					isPalindrome=false;
				}
		}	
		//System.out.println(isPalindrome ? "palindrome" : "not a palindrome");
		if (isPalindrome) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is Not Palindrome");
		}
		

	}
}
