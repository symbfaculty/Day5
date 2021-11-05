package com.capgemini.interfaces;

public class Circle implements Shape{
	private int radius;
	public Circle() {
		super();
		this.radius=3;
	}
	@Override
	public void draw() {
	
	 System.out.println("Circle is drawn "+PI);
		
	}

}
