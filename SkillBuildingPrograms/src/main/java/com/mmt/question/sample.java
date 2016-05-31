package com.mmt.question;

public class sample {

	public static void main(String[] args) {
		long f = 12345L;
		System.out.println(f/100);
		int len = new String(""+f).length()-1;
		int j =10;
		for(int i=0; i<= len; i++)
		{
			long g = f%j;
			f = f/j;
			System.out.println(g+"\t"+j+"\t"+f);
		}
	}
}
