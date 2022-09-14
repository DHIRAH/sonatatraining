package com.sonata.Emodel;

public class Employee {



	   private int empId;
	    private String empName;
	    private double empSal;
	    public int ysal;
	    public int getEmpId() {
	        return empId;
	        
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
		public int getYsal() {
			return ysal;
		}
		public void setYsal(int ysal) {
			this.ysal = ysal;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", ysal=" + ysal + "]";
		}

	    }


