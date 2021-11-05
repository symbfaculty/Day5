package com.capgemini.interfaces;

public interface MyInterface {
     void myMethod();
     default void print() {
    	System.out.println("In print method"); 
     }
     static void sayHello() {
    	 
    	 System.out.println("Hello All");
     }
}
