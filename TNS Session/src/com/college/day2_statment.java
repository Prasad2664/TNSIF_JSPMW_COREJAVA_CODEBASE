package com.college;

public class day2_statment {
public static void main(String[] args) {
		
//		// if statment
//		int x=20;
//		if(x>=18) {
//			System.out.println("Eligible for voting");
//		}
		
		
		
		
		// else statment
//		int x=12;
//		if(x>=18) {
//			System.out.println("Eligible for voting");
//		}
//		else {
//			System.out.println("You are not eligible for voting");
//		}
		
		
		
		
		//multiple condition
		
//		int x=12,y=20;
//		int a=10;
//		int b=11;
//		
//		if(x>=y) {
//			System.out.println("True");
//		}
//		else {
//			System.out.println("False");
//		}
//		
		//a=10, b=11
//		if(!(a<b) || (a==b)) {
//			System.out.println("condition True");
//		}
//		else {
//			System.out.println("condition False");
//		}
//		
		
		
		// Nested statment
		
//		int a=10,b=20,c=5;
//		System.out.println("Largest Number is");
//		
//		if(a>b) {
//			if(a>c) {
//				System.out.println("a is greater");
//			}
//			else {
//				System.out.println("c is greater");
//			}
//		}
//		else {
//			if(c>b) {
//				System.out.println("c is greater");
//			}
//			else {
//				System.out.println("b is greater");
//			}
//		}
		
		
		
	     //homework nested statment for username and passward
		
		String username="prasad2664";
		String passward="prasad@2664";
		
		if(username=="prasad2664") {
			if(passward=="prasad@2664") {
				System.out.println("Login is Successfully");
			}
			else {
				System.out.println("you entered the wrong passward");
			}
		}
		else {
			 if (!(passward=="prasad@2664")) {
	                System.out.println("Username and password both are wrong");
	            } else {
	                System.out.println("You entered the wrong username");
	            }
		}
		
		
		
		
		
		
	}
}
