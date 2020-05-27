package com.Array.MyArray;

public class RetrieveEvenNumberInArray {
	public static void main(String[] args) {
		int arr[]=new int[10];
		int addNumber=0;
		for (int i = 0; i < arr.length; addNumber++) {
			arr[i++]=addNumber;	
		}
		
		//retrieving from array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.println("Even Number in the given array is :"+arr[i]);
			}
			
		}
		
	}

}
