package com.sonata.javastream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int)(o1.getEmpSal()-o2.getEmpSal());
		
	}
}
public class SortedExampleEmployee {
	public static void main(String[] args) {
		List<Employee> employee = DataBaseEmp.getEmployee();
		Collections.sort(employee,(o1,o2)->(int)(o1.getEmpSal()));
		System.out.println(employee);
		
		employee
		.stream()
		.sorted((o1,o2)->(int)(o1.getEmpSal()-o2.getEmpSal()))
		.forEach(System.out::println);
	}
	

}
