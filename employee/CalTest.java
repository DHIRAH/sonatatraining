package com.sonata2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.sonata.Impl.EmpImpl;
import com.sonata.Main.EmpExcut;
import com.sonata.Model.Employee;

public class CalTest {
	
	@Test
	public void addTest( ) {
		Calculator c1 = new Calculator();
		Assertions.assertEquals(4, c1.add(2,2));
	}
	
	@Test
	public void mulTest( ) {
		Calculator c2 = new Calculator();
		Assertions.assertEquals(4, c2.mul(2,2));
		
	}
	@Test
	public void totalbalance() {
		Bank d1 =new Bank();
		d1.balance=567;
		Assertions.assertEquals(600,d1.deposit(33));
	}
	@Test
	public void totalbalance1() {
		Bank d1 =new Bank();
		d1.balance=567;
		Assertions.assertEquals(600,d1.deposit(43));
	}
	@Test
	public void totalbalance2() {
		Bank w1 =new Bank();
		w1.balance=600;
		Assertions.assertEquals(567,w1.withdraw(33));
	}
	@Test
	public void totalbalance3() {
		Bank w1 =new Bank();
		w1.balance=700;
		Assertions.assertEquals(700,w1.withdraw(33));
	}
	@Test
	public void ySalTest1() {
		Employee e1 = new Employee();
		e1.setEmpSal(10);
		EmpImpl e2 = new  EmpImpl();
		Assertions.assertEquals(120,e2.yearlySal(e1));
			
	}
	@Test
	public void ySalTest2() {
		Employee e1 = new Employee();
		e1.setEmpSal(15);
		EmpImpl e2 = new  EmpImpl();
		Assertions.assertEquals(120,e2.yearlySal(e1));
	}
	@Test
	public void appSalTest1() {
		Employee e1 = new Employee();
		e1.setEmpSal(20000);
		EmpImpl e2 = new  EmpImpl();
		Assertions.assertEquals(5000,e2.appSal(e1));
	}
	@Test
	public void appSalTest2() {
		Employee e1 = new Employee();
		e1.setEmpSal(9000);
		EmpImpl e2 = new  EmpImpl();
		Assertions.assertEquals(5000,e2.appSal(e1));
}
}