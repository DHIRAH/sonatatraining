package com.sonata.Main;

import com.sonata.Impl.EmpImpl;

import com.sonata.Model.Employee;



public class EmpExcut {
	public static void main (String args[]) {
		Employee e1 = new Employee();
		e1.setEmpId(123);
		e1.setEmpName("dhiraj");
		e1.setEmpSal(100);
		 EmpImpl e2 = new  EmpImpl();
		e2.yearlySal(e1);
		e2.appSal(e1);
		

}
}