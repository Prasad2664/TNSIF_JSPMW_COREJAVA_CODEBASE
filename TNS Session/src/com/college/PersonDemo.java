package com.college;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

		
		//Scanner class
		//Scanner object to accept user inputs
		Scanner ob=new Scanner(System.in);
		
		
		System.out.println("Enter Person Name:");
		String name=ob.next();
		System.out.println("Enter age ");
		int age=ob.nextInt();
		System.out.println("Enter gender");
		String gender=ob.next();
		
		System.out.println("Enter Income ");
		int income=ob.nextInt();
				
				
		//Person class object and intialize values using set method
		day4_taxdata person=new day4_taxdata();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		
		//display person details using toString() method
		System.out.println(person);
		
		day4_taxcalculate calc=new day4_taxcalculate();
		calc.CalculateTax(person); //taxz calculate 
		System.out.println("After Calculation of tax : ");
		
		System.out.println(person);
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
	}

}
