package com.sonata2.day3;

public class EmpMain {
	public static void main( String[] args) {
		EmpModel e1 =new EmpModel();
		e1.setEmpId(123);
		e1.setEmpName("dhiraj");
		e1.setEmpSal(456);
		
		System.out.println(e1);
		SimpleExample A1= new SimpleExample();
		
		//System.out.println( A1.add(20, 04));
		 

		System.out.println( A1.sub(5, 04));
		
		//System.out.println( A1.mul(5, 04));
		System.out.println( A1.div(20, 04));
		 

	}}
