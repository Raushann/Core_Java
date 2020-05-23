package com.String.Basic;
//CompareTo()
public class P9 {
	public static void main(String[] args) {
		System.out.println("ABC".compareTo("ABC"));
		System.out.println("ABC".compareTo("ADD"));
		System.out.println("ABC".compareTo("ABCDEF"));
		System.out.println("ABCDEF".compareTo("ABC"));
		System.out.println("ABC".compareTo("DEF"));
		System.out.println("ABC".compareTo("XYZ"));
		System.out.println("ABC".compareTo("abc"));
		System.out.println("ABC".compareToIgnoreCase("abc"));
	}

}
