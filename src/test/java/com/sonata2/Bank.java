package com.sonata2;

public class Bank {
	int accNo;
	String accName;
	double balance;
	Bank(){}
	Bank(int a , String n, double b){
		this.accNo = a ;
		this.accName = n;
		this.balance = b;
	}
	public double deposit(double amount) {
	double totalBalance = balance + amount;
	System.out.println(this.accNo);
	return totalBalance;
	}
	public double withdraw(double amount) {
		double totalBalance = balance - amount;
		System.out.println(this.accNo);
		return totalBalance;
}
}