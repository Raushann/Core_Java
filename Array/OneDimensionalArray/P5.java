package com.Array.OneDimensionalArray;

public class P5 {
	
	public static void main(String[] args) {
		String arr[];
		arr=new String[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);//default value will be printed
		}
		System.out.println("---------");
		
		arr[0]="Raushan";
		arr[1]="Rahul";
		arr[2]="Qspiders";
		arr[3]="Jspiders";
		arr[4]="Pyspiders";
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}		
		
	}

}
