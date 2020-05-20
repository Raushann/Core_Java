package com.Array.OneDimensionalArray;

//Array Initialization


public class P4 {

	public static void main(String[] args) {
		int arr[];
		arr=new int[10];
		
		//you can initialize array elements with your own value by using index representation
		
		System.out.println(arr[0]);//default value will be printed
		System.out.println(arr[1]);//default value will be printed
		System.out.println(arr[3]);//default value will be printed
		System.out.println(arr[4]);//default value will be printed
		System.out.println(arr[5]);//default value will be printed
		System.out.println(arr[6]);//default value will be printed
		System.out.println(arr[7]);//default value will be printed
		System.out.println(arr[8]);//default value will be printed
		System.out.println(arr[9]);//default value will be printed
		
		//System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		arr[5]=6;
		arr[6]=7;
		arr[7]=8;
		arr[8]=9;
		arr[9]=10;
		
		//you can Retrieve array elements  by using index representation
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);//assigned value will be printed
		}
		

		
		
	}
}
