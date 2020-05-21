package com.Array.TwoDimensionalArray;

public class P6 {
	public static void main(String[] args) {
		int arr[][]=null;

		arr=new int[][] { {10,20,30}, {40,50,60} , {70,80,90} , {10} };

		for (int[] a : arr) {

			for (int b : a) {
				System.out.print("\t"+b);
			}
			System.out.println();

		}


	}

}
