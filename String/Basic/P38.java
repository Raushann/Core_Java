package com.String.Basic;

public class P38 {
	public static void main(String[] args) {
		String exp="[A-Za-z][A-Za-z0-9]*";//checking character first
		System.out.println("RAU123".matches(exp));
		System.out.println("raushan".matches(exp));
		System.out.println("RAUSHAN".matches(exp));
		System.out.println("123".matches(exp));
		System.out.println("123Raushan".matches(exp));
	}

}
