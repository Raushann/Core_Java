package com.Array.OneDimensionalArray;
//Enhanced For Statement
/*
 * it is also known as for-each loop.
 * it is mainly used to access the elements from collection/array sequentially.
 * 
 * Syntax:-
 * for{ < data-types> var-name : array/collection }{
 * statements(block)
 * }
 * 
 * 
 * Note:-
 * it can`t be used for reverse traversal.
 * it can`t be used for accessing the index of elements.
 * it can`t be used to access the data alternatively like 1st,3rd,5th etc.
 * 
 */
public class P17 {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		for (int i : arr) {
			System.out.println(i);

		}
	}

}
