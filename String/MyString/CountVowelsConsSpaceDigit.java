package com.String.MyString;

import java.util.Scanner;

public class CountVowelsConsSpaceDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The Sentence");
		String sentence=sc.nextLine();
		int vowels=0;
		int consonants=0;
		int digits=0;
		int spaces=0;
		int specialcharacter=0;
		
		
		sentence=sentence.toLowerCase();
		
		for (int i = 0; i < sentence.length(); i++) {
			char ch=sentence.charAt(i);
			if (ch=='a' || ch=='e' || ch== 'i'|| ch== 'o' || ch=='u') {
				vowels++;
			}
			
			else if ((ch >= 'a' && ch <= 'z')) {
				consonants++;
			}
			else if(ch >='0' && ch <='9') {
				digits++;
			}
			else if(ch== ' ') {
				spaces++;
			}
			else {
				specialcharacter++;
			}
			
		}
		System.out.println("Total Vowels :"+vowels);
		System.out.println("Total Consonant :"+consonants);
		System.out.println("Total Digits :"+digits);
		System.out.println("Total Spaces :"+spaces);
		System.out.println("Total Special Characters :"+specialcharacter);
		
	}
}
