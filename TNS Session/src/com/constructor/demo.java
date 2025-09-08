package com.constructor;

import java.util.Scanner;

public class demo {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name, city;
		int id;
		System.out.println("Enter customer id :");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer name: ");
		name=sc.nextLine();
		
		System.out.println("Enter Customer City :");
		city=sc.nextLine();
		
		System.out.println(" ");
		
		
		customer c1=new customer(); //default
		c1.setCustomerCity(city);
		c1.setCustomerId(id);
		c1.setCustomername(name);
		System.out.println(c1);
		
		System.out.println("Enter customer id :");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer name: ");
		name=sc.nextLine();
		
		System.out.println("Enter Customer City :");
		city=sc.nextLine();
		
		System.out.println(" ");
		
		customer c2=new customer(name, id, city);
		System.out.println(c2);
		
		

	}

}
