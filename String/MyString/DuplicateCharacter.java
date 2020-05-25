package com.String.MyString;

import java.util.Scanner;

public class DuplicateCharacter {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String sentence=s.nextLine();
		
		char[] ch=sentence.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char temp = ch[i];
			int count = 0;
			boolean isOld = false;
			for (int j = 0; j < ch.length-1; j++) {
				if(temp == ch[j]) {
					count++;
				}
			}
			
			for(int k=0;k<i; k++) {
				if(ch[i] == ch[k]) {
					isOld =true;
					break;
				}
			}
			if(count>1 && !isOld) {
				System.out.println(ch[i] +"\toccurance\t"+count );
			}
		}
		
	}

}
