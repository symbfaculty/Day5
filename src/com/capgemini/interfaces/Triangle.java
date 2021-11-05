package com.capgemini.interfaces;

public class Triangle implements Shape {
	private int base;
	private int height;
	public Triangle() {
		this.base=3;
		this.height=5;
	}
	@Override
	public void draw() {
		System.out.println("Triangle is drawn");
	}
}
