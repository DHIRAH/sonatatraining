package com.sonata2;

public class CurrentAccount extends Bank {
	CurrentAccount(){}
	CurrentAccount(int a, String n, double b){
		super(a,n,b);
	}
	CurrentAccount(int b,String s){}
	
	public static void main(String args[]) {
		
	
	CurrentAccount c1 = new CurrentAccount(234, "abc", 236);
	//c1.accNo = 124;
	
	System.out.println(c1.deposit(900));
	System.out.println(c1.withdraw(100));
	
	CurrentAccount c2 = new CurrentAccount();
	}


	}


