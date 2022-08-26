package com.sonata2.day3;

public class SimpleExample {
	private int add	(int a, int b) {
		return a+b;
	}
 int sub	(int a, int b) {
		return b-a;
	}
 protected int mul	(int a, int b) {
		return a*b;
	}
 public int div(int a, int b) {
		return a/b;
	}
 public static void main(String[] args) {
	SimpleExample A1= new SimpleExample();
	
	System.out.println( A1.add(20, 04));
	 

	System.out.println( A1.sub(5, 04));
	
	System.out.println( A1.mul(5, 04));
	System.out.println( A1.div(20, 04));
	 
	 
	 
 }

}
