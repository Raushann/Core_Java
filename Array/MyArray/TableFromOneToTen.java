package com.Array.MyArray;
//print Counting from 1 to 10 using array
public class TableFromOneToTen {
	public static void main(String[] args) {
		int arr[][] = new int[10][10];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (i+1)*(j+1);
				//if u want to print 10 to 20 
				//arr[i][j]= (i+1)*(j+10);
			}
		}

		//retrieving elements
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
