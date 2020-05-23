package com.String.Basic;
//matches() ,uppercase, lowercase, numeric, alphanumeric
public class P37 {
	public static void main(String[] args) {
		String exp="[A-Za-z0-9]*";
		System.out.println("Raushan123".matches(exp));
		System.out.println("raushan".matches(exp));
		System.out.println("RAUSHAN".matches(exp));
		System.out.println("123".matches(exp));
		System.out.println("123Raushan".matches(exp));
		
	}

}
