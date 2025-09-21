package com.Abstract;

public class Square extends Shape {

	float side;
	
	public Square() {
		side=3.2f;
	
	}

	

	public Square(float side) {
		this.side = side;
		
	}

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		this.area=side*side;
	}

}
