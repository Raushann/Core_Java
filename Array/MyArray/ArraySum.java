package com.Array.MyArray;

import java.util.stream.IntStream;

public class ArraySum {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};

		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum + arr[i];
		}
		System.out.println(sum);


		//by using foreach loop
		int Sum=0;
		for (int i : arr) {
			Sum=Sum+i;
		}
		System.out.println(Sum);


		//using Stream

		int sum1 = IntStream.of(arr).reduce( 0,(a, b) -> a + b);
		System.out.println("The sum of array is " + sum1);

		System.out.println("Another way to find summation :" + IntStream.of(arr).sum());



	}
}
