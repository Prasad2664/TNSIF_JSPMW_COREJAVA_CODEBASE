package com.Abstract;

public class Rectangular extends Shape {

	float width;
	float height;
	
	
	
	
	public Rectangular() {
		width=3.2f;
		height=4.6f;
	}

	

	public Rectangular(float width, float height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		this.area=width*height;
	}

	
	
}
