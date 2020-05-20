package com.Array.OneDimensionalArray;

public class P16 {


	public static void show(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		show(new int[] {10,20,30,40,50});
	
		//	show(new int[5] {10,20,30,40,50});//CTE
		//we cant initialize size for anonymous array
		
		
	}

}
