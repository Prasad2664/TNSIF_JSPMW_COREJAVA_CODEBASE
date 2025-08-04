package com.college;

public class day2 {
	public static void main(String[] args) {
		
		//widning // implicit type casting
		
		// byte to int
		byte b=10;
		int l=b;
		System.out.println(l);
		
		//float to double
		float f=22.41f;
		double d=f;
		System.out.println(d);
		
		//char to int 
		char ch='A';
		int i=ch;
		System.out.println(i);
		
		
		// narrowing // explicate type casting
		
		//double to long
		double f1=10.52f;
		long ll=(long)f1;
		System.out.println(ll);
		
		
		// int to byte             // range is -128 to 127
		int i2=130;               //130-128=2
		byte b1=(byte)i2;         //-128+2=-126
		System.out.println(b1);   //  ans=-126
	}
}
