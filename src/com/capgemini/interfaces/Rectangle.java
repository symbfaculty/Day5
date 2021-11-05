package com.capgemini.interfaces;

public class Rectangle implements Shape{

	private int width;
	private int height;
	 public Rectangle() {
		super();
		this.width=3;
		this.height=4;
	}
	@Override
	public void draw() {
		System.out.println("Rectangle is drawn");
		
	}
	

}
