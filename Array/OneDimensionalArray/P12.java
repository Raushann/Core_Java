package com.Array.OneDimensionalArray;

//array declaration, construction and initialization in one statement.
/*
 * Syntax:-
 * <data-types > <ref-variable>[]={<val1>,<val2>,<val3>,...<valN>};
 * 
 */
public class P12 {
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		System.out.println("Length of arr is : "+arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String names[] = {"Raushan", "Kumar", "Singh"};
		System.out.println("Length of names array is : "+names.length);
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
	}

}
