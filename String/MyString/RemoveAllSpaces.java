package com.String.MyString;

import java.util.Scanner;

public class RemoveAllSpaces {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The Sentence");
		String sentence=sc.nextLine();
		
		String output=sentence.replaceAll("[ ]", "");
		System.out.println("Output is : "+output);
	}

}
