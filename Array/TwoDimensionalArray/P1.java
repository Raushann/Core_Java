package com.Array.TwoDimensionalArray;
/*
 * Single Dimensional array( Collection Of Actual values)
 * Two Dimensional array (Collection of Single Dimensional Arrays)
 * Three Dimensional array(Collection of Two Dimensional Arrays)
 * 
 * 
 * 
 * Syntax(2D-array):-
 * [modifiers] <data-types> < ref-var-name > [] [] =new <data-types>[<size1>[<size2>];
 * 
 *  [modifiers] <data-types>  [] [] < ref-var-name > =new <data-types>[<size1>[<size2>];
 * 
 * Note:-
 * -> Size1 is mandatory, size2 will be optional.
 */
public class P1 {

	public static void main(String[] args) {
		int arr[] []=null;
		arr=new int[3][2];

		System.out.println("Length : "+arr.length);//3
		System.out.println("Length : "+arr[0].length);//2
		System.out.println("Length : "+arr[1].length);//2
		System.out.println("Length : "+arr[2].length);//2
	}
}
