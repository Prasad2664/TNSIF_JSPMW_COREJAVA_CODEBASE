package com.StaticMethod;

public class MyClass {
	
	private int section;
	private static int srNo;
	
	//static block
	static{
		System.out.println("Static Method");
		srNo=1000;
//		section=2000;
	}
	
	MyClass(){
		System.out.println("Default constructor");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [serial No"+srNo+",section=" + section + "]";
	}
	
	//static method
	static void display() {
//		System.out.println("section:"+section);
		System.out.println("serial No:"+srNo);
	}
}
