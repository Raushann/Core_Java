package com.String.Basic;
//byte array ,getBytes()
public class P29 {
	public static void main(String[] args) {
		String s="Qspiders Bangalore";
		byte [] arr=s.getBytes();
		System.out.println("byte aray !.......");
		
		for (int i = 0; i < arr.length; i++) {
			byte b=arr[i];
			System.out.println(i+"\t"+b);
		}
	}

}
