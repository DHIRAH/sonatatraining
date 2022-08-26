package com.sonata4.day4;

public class CallCustonException {
public static void main(String args[])throws MyownException {
	int age=19;
	if(age<18) {
		throw new MyownException("age is less than 18");
	}
	else
	{
		System.out.println("welcome to vote");
	}
	
	}
}

