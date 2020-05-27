package com.Array.MyArray;

public class CountOddAndEvenNumber {
	public static void main(String[] args) {
		int arr[]=new int[10];
		int addNumber=0;
		for (int i = 0; i < arr.length; addNumber++) {
			arr[i++]=addNumber;	
		}
		
		int countEven=0;
		int countOdd=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
			countEven++;	
			}
			else {
				countOdd++;
			}
			
		}
		System.out.println("Total Even Number in the given array is :"+countEven);
		System.out.println("Total Odd Number in the given array is :"+countOdd);
		
	}

}
