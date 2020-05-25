package com.String.MyString;

import java.util.Scanner;

public class DuplicateWords {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String sentence=s.nextLine();
		
		String[] words=sentence.split(" ");

		for (int i = 0; i < words.length; i++) {
			String temp = words[i];
			int count = 0;
			boolean isOld = false;
			for (int j = 0; j < words.length; j++) {
				if(temp.equalsIgnoreCase(words[j])) {
					count++;
				}
			}
			for(int k=0;k<i; k++) { 
				if(words[i].equalsIgnoreCase(words[k])) {
					isOld =true; break; 
				} 
			}
			if(count>1 && !isOld) {
				System.out.println(words[i] +"\toccurance\t"+count );
			}
		}
		
	}

}
