package com.HierarchicalInheritanceDemo;

public class HierarchicalDemo {

	public static void main(String[] args) {
		
		Person p1=new Person();
		System.out.println(p1);
		
//		Student s1=new Student("Prasad", "Solapur", "SY", 23.78f);
//
//		Employee e1=new Employee("Prasad", "Solapur", 1001, 123456, "CS");
		
		Person p;
		p=new Person("Prasad","Solapur");
		System.out.println(p);
		
		p=new Employee("Saurabh", "nashik", 1002, 23456, "QA");
		System.out.println(p);
		
		p=new Student("Aditya", "Mumbai", "TY", 12345f);
		System.out.println(p);
				
		

	}


}
