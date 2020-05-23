package com.String.Basic;
//valueOf
public class P10 {
	public static void main(String[] args) {
		int a=100;
	//	String s=a;//CTE
	//	String s1=(String)a;CTE
		
		String s2=String.valueOf(a);
		String s3=String.valueOf(true);
		System.out.println(s2+"\t"+s3);
				
	}

}
