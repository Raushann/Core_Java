package com.String.Basic;
//hashCCode()
public class P39 {
	public static void main(String[] args) {
		String s1="Raushan";
		String s2=new String("Raushan");
		
		System.out.println(s1.hashCode());//same hashcode
		System.out.println(s2.hashCode());//same hashcode
		
		System.out.println(s1==s2);//false

	}

}
