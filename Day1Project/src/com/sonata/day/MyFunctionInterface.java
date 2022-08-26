package com.sonata.day;
@FunctionalInterface
public interface MyFunctionInterface {
	void m1();
	
	default void m2() {System.out.println("Default method=1");}
	static void m3() {System.out.println("Default method-2");}
	

}
