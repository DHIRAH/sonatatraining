package com.sonata2.day3;

public class EmpModel {
	private int empId;
	private String empName;
	private double empSal;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
		@Override
	public String toString() {
		return "EmpModel [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	

}