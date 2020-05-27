package com.Array.MyArray;

public class AddOddValueAtOddIndex {
	public static void main(String[] args) {
		int arr[]=new int[10];
		int addNumber=0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2!=0) {
				arr[i]=i;	
			}
		}
		
		//retrieving elements
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
