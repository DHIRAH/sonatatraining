package com.sonata3.day3;
import com.sonata2.day3.SimpleExample;
public class PackageExample extends SimpleExample {
	public static void main (String[] args) {
		SimpleExample s1 =new SimpleExample();
		s1.div(10, 2);
		PackageExample p1 = new PackageExample();
		System.out.println(s1.div(10, 2));
	//	System.out.println(s1.mul(10, 2));
	}
	

}
