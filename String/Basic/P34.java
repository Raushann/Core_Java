package com.String.Basic;

public class P34 {
	public static void main(String[] args) {
		String s="JSpiders, java learning center ,No.1 in java training and placement";
		String res[]=s.split("java",0);//works like normal splitting

		System.out.println(res.length);

		for (int i = 0; i < res.length; i++) {
			String s1=res[i];
			System.out.println(i+"\t"+s1);
		}

		String res1[]=s.split("java",5);//works like normal splitting(4 parts split)

		System.out.println(res1.length);

		for (int i = 0; i < res.length; i++) {
			String s2=res[i];
			System.out.println(i+"\t"+s2);
		}

	}

}
