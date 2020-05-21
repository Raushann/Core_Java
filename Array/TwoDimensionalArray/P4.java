package com.Array.TwoDimensionalArray;

public class P4 {
	public static void main(String[] args) {
     
		int arr[][]=null;
		arr=new int[3][];
		
		int temp[]= {10,20,30,40,50};
		
		System.out.println("Length of arr is : "+arr.length);
		
	    arr[0]=new int[4];//default value{0,0,0,0}
	    
	    arr[1]=new int[] {10,20,30};
	    
	    arr[2]=temp;
	    
	    for (int i[] : arr) {
			
	    	for (int j : i) {
	    		System.out.print("\t"+j);
			
			}
	    	System.out.println();
		}
	    
		
		
	}
}
