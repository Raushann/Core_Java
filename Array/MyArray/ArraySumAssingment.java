package com.Array.MyArray;
/*
 * Write a  Program to find minimum elements in array which has sum equals to given value.
 * Input:-
 *     Array of Integers.
 *     Required Sum.
 * Output:-
 *     Elements From array which makes sum equals to given value.
 *     
 *     Ex:-
 *     
 *     input Array: [10, 0, -1, 20, 25, 30 ]
 *     
 *     Required Sum : 45
 *     Output : [20, 25 ]
 *     
 *     Required Sum : 59
 *     Output : [10, -1, 20, 30 ]
 *     
 *     Required Sum : 60
 *     Output : [10, 20, 30 ]
 */
import java.util.Scanner;

public class ArraySumAssingment {

	public static void requiredSum(int[] A, int newSum, int index, int sum,int[] output) {

		if (newSum == sum) {
			System.out.print("Output: [");
			for (int i = 0; i < output.length; i++) {

				if (output[i] == 1) {

					if(A[i]!=0) {
						System.out.print("  " + A[i]);	
					}	
				}
			}
			System.out.print(" ]\n");
			System.exit(1);
		}
		else if (index == A.length) 
		{
			return;
		} 
		else 
		{
			output[index] = 1;
			newSum += A[index];
			requiredSum(A, newSum, index + 1, sum, output);

			newSum -= A[index];  
			output[index] = 0;
			requiredSum(A, newSum, index + 1, sum, output);
		}
		return;
	}


	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter total Number of integers you have to insert : ");
		
		int totalInteger=sc.nextInt();
		
		int [] input=new int[totalInteger];

		int length=input.length;

		System.out.println("Ok Now , Enter "+totalInteger+" elements in that Array : ");
		
		for(int i=0;i<length;i++)
		{
			input[i]=sc.nextInt();
		}
		System.out.println("Enter required sum : ");

		int sum=sc.nextInt();

		int[] output = new int[length];

		requiredSum(input, 0, 0, sum, output);
	}
}
