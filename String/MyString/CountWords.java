package com.String.MyString;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The Sentence");
		String sentence=sc.nextLine();
		
		String [] words=sentence.split(" ");
		int totalwords=words.length;
		
		for (int i = 0; i < totalwords; i++) {
			System.out.println(i+"\t"+words[i]);
		}
		System.out.println("*******************************");
		System.out.println("Total words are : "+totalwords);
	}

}
