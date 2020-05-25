package com.String.MyString;

import java.util.Scanner;

public class WordContainingTwoConsecutiveVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String sentence=sc.nextLine();
		//System.out.println(sentence);
		

		String [] words=sentence.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			
			char [] ch=words[i].toCharArray();
			boolean isConsecutiveVowelPresent = false;
			for (int j = 0; j < ch.length-1; j++) {
				if (ch[j]=='a' || ch[j]=='e' || ch[j]=='i' || ch[j]=='o' || ch[j]=='u' || 
						ch[j]=='A' ||ch[j]=='E' || ch[j]=='I' || ch[j]=='O' || ch[j]=='U' ) {
					
					
					if (ch[j+1]=='a' || ch[j+1]=='e' || ch[j+1]=='i' || ch[j+1]=='o' || ch[j+1]=='u' || 
							ch[j+1]=='A' ||ch[j+1]=='E' || ch[j+1]=='I' || ch[j+1]=='O' || ch[j+1]=='U' ) {
						isConsecutiveVowelPresent=true;
						break;
					}
				}

			}

			if(isConsecutiveVowelPresent) {
				System.out.print(words[i]+" ");
			} 
		}
		
		
	}


}
