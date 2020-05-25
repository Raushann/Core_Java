package com.String.MyString;

import java.util.Scanner;

public class WordContainingOnlyOneVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String sentence=sc.nextLine();
		System.out.println(sentence);
		int countVowel;
		
		String [] words=sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			countVowel=0;
			char [] ch=words[i].toCharArray();
			boolean isVowelPresent = false;
			for (int j = 0; j < ch.length; j++) {
				if (ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u' || 
				    ch[j]=='A' ||ch[j]=='E' || ch[j]=='I' || ch[j]=='O' || ch[j]=='U' ) {
					isVowelPresent=true;
					countVowel++;
					//break;
				}
				
			}
			
			if(isVowelPresent && countVowel == 1) {
				System.out.print(words[i]+" ");
			}
		}
	}


}
