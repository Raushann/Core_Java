package com.String.MyString;

import java.util.Scanner;

public class DeleteWordFromSenetence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The Sentence");
		String sentence=sc.nextLine();
		
		System.out.println("Enter the word to Delete From the Sentence");
		String word=sc.nextLine();
		
		sentence=sentence.replaceAll(word, " ");
		
		System.out.println("OutPut Sentence is : "+sentence);
	}

}
