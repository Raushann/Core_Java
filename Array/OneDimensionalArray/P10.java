package com.Array.OneDimensionalArray;

/*whenever we declare array with final then 
only address is fixed index value can be changed */

public class P10 {
	public static void main(String[] args) {
		final int arr[]=new int[2];
		System.out.println("Length of arr is : "+arr.length);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println("-----------------");
		
		arr[0]=99;
		arr[1]=100;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		
		//arr=new int [10];
		//arr=null
	}
	

}
