package com.String.MyString;

import java.util.Scanner;

public class CountLetters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The Sentence");
		String sentence=sc.nextLine();
		
		int length=sentence.length();
		System.out.println("Total number of characters including Spaces is :"+length);
		
		String [] words=sentence.split(" ");
		int totalwords=words.length;
		System.out.println("total number of words are :"+totalwords);
		
		char[] ch=sentence.toCharArray();
		int count=0;
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]==' ') {
				count++;
			}
		}
		System.out.println("Total Spaces are : "+count);
		
		System.out.println("Total number of characters Excluding Spaces is :"+(length-count));
		
	}

}
