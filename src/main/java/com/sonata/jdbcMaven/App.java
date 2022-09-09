
package com.sonata.jdbcMaven;


import com.sonata.DAOImpl.EmpImpl;
import com.sonata.EModel.employee;

public class App {
 public static void main(String[] args)
 {
	 employee e1 = new employee();
	 e1.setEmpID(13);
	 e1.setEmpName("Dhiraj");
	 EmpImpl p1 = new EmpImpl();
int a1 = p1.save(p1);
	 System.out.println(a1);
 }}

