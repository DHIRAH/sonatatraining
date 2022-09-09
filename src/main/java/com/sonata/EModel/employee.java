package com.sonata.EModel;

public class employee {
	int empID;
	String empName;
	double empSal;
	 employee(int empId,String empName,double empSal){
		this.empID=empID;
		this.empName=empName;
		this.empSal=empSal;
	}
	public employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
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
		return "employedetails [empID=" + empID + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	

}
