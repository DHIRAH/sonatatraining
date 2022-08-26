package com.sonata.day;

public class ParametreLambda {

	public static void main(String args[]) {
/*		CalTor c2 =(i1,i2) -> {return i1-i2;};
		CalTor c3 = (i1,i2) -> {
			if(i2<i1) {
				throw new RuntimeException("message");}
			else {return i2-i1;}
		};
		
		System.out.println(c2.substract(20, 10));
		MyFunctionInterface show =()-> {System.out.println(" hi");} ;*/
		
		
		BankInt b2 =(i1,i2)->{
			
			int X=i1+i2;
			
			if((i1+i2)<50)
			
		return --X;
			
			else 
			
				
		return ++X;
				
			
			};
		
		System.out.println(b2.add(10, 48));
		}
	
				}


	

