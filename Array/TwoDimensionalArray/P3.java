package com.Array.TwoDimensionalArray;

public class P3 {

	public static void main(String[] args) {
		int arr[][]=null;
		
		//Size one is mandatory
		
		//arr=new int[][];//error 
		
		//arr=new int[][3];//error
		
		arr=new int [3][];
		System.out.println("Length is : "+arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);//null
		}
		
	}
}
