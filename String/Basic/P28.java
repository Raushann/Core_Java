package com.String.Basic;
//toCharArray()
public class P28 {
	public static void main(String[] args) {
      String s="Qspiders Bangalore";
      char[] arr=s.toCharArray();
      
      System.out.println("char Array !.....");
      
      for (int i = 0; i < arr.length; i++) {
		char ch=arr[i];
		System.out.println(i+"\t"+ch);
	}
	}
}
