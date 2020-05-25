package com.String.MyString;

import java.util.Scanner;

public class OccuranceOfEachChar {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in );

		System.out.println("Enter a string:");

		String s=sc.nextLine();

		s=s.replaceAll(" ","");

		String temp="";

		for(int i=0;i<s.length();i++){

			if(!temp.toLowerCase().contains(s.charAt(i)+"")){

				temp+=s.charAt(i)+"";

			}

		}

		int count=0;

		for(int i=0;i<temp.length();i++){

			for(int j=0;j<s.length();j++)

			{

				if((temp.charAt(i))==(s.charAt(j)))

				{

					count++;

				}

			}

			System.out.println("occerance of "+temp.charAt(i)+" is "+count);

			count=0;

		}

	}

}
