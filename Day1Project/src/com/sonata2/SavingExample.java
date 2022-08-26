package com.sonata2;

public class SavingExample {
	int accNo;
	String accName;
	double balance;
	SavingExample(){}
	
	SavingExample(int n , String name , double b){
			this.accNo = n ;
	this.accName = name;
	this.balance = b;
}

	public void deposit() {
	System.out.println(this.accNo);
	}
	public void withdraw() {}

	public static void main(String args[]) {
		SavingExample s1 = new SavingExample();
		s1.accNo = 123;
		s1.accName="dhiraj";
		s1.balance= 345;
		s1.deposit();
		
		SavingExample s2 = new SavingExample(234,"Santhosh",456);
		s2.deposit();
	}

}
