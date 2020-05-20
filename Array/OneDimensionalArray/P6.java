package com.Array.OneDimensionalArray;
//length variable

public class P6 {
	public static void main(String[] args) {
		byte b=5;
		int arr1[]=new int[b];

		short s=4;
		int arr2[]=new int [s];

		System.out.println("Length of arr1 is  : "+arr1.length);
		System.out.println("Length of arr2 is  : "+arr2.length);

		char c='A';
		int arr3[]=new int [c];
		System.out.println("Length of arr3 is  : "+arr3.length);

		int arr4[]=new int[10];
		System.out.println("Length of arr4 is  : "+arr4.length);

		int arr5[]=new int[10 + 20 / 5];
		System.out.println("Length of arr5 is  : "+arr5.length);

		double d=123.45;
		int arr6[]=new int [(int)d];
		System.out.println("Length of arr6 is  : "+arr6.length);
		

		//size of an array can be zero but it can never be negative
		int arr7[]=new int [0];
		System.out.println("Length of arr7 is  : "+arr7.length);

	}

}
