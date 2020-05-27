package com.Array.MyArray;

public class ArrayElementsInsert {
	public static void main(String[] args) {
		int arr[] =new int[10];
		int value=0;
        for (int i = 0; i < arr.length; value++) {//adding the value into array
			arr[i++]=value;
		}
        
        for (int i = 0; i < arr.length; i++) {// retreiving value from array
			System.out.println(arr[i]);
		}
	}

}
