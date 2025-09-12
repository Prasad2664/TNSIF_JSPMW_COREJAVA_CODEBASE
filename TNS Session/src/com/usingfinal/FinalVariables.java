package com.usingfinal;

public class FinalVariables {

	final int x=100;
	
	//declare a static final should be variables
	final static int y;
	
	final static int z=10;
	
	//instance method
	void change() {
//		x=30;
//		z=100;
//		y=25;
	}

	@Override
	public String toString() {
		return "FinalVariables [x=" + x + ",y="+y+"]";
		
	}
	
	//static block
	static {
//		z=80;
		y=20;
		System.out.println("vlue of y:"+y);
	}
//	static {
//		y=55;
//	}
	
}
