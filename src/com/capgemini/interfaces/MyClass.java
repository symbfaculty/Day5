package com.capgemini.interfaces;

import java.util.ArrayList;

public class MyClass implements MyInterface{
	
	
	@Override
	public void print() {
	  ArrayList<String> list;
		System.out.println("Print in MyClass");
	}
	@Override
	public void myMethod() {
	System.out.println("In myMethod()");		
	}
}
