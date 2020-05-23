package com.String.Basic;

public class P26 {
	public static void main(String[] args) {
           String s="Qspiders";
           int len=s.length();
           System.out.println(len);
           
           System.out.println(s.substring(0,9));
          //java.lang.StringIndexOutOfBoundsException: String index out of range 
	}
}
