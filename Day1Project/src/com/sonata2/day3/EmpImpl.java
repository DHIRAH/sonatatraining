package com.sonata2.day3;

public class EmpImpl extends employee  implements EmpIntf{
	

	double empSal = 10000;


	@Override
	public double skillBouns(int subjectUpgraded) {
	
	
	
	
	switch(subjectUpgraded) {
	case 1: 
		subjectUpgraded = (int) (empSal + (empSal * 0.1));
	break;
	case 2:
	subjectUpgraded = (int) (empSal+ (empSal * 0.1));
    break;
	case 3: 
	subjectUpgraded = (int) (empSal + (empSal * 0.1));
    break;


	default:
		
	}
	
	
	
		return 0;
	}

	@Override
	public void salCal() {
		int empId;
		String empName;
		double empSal;
	}
		public static void main(String[] args) {
			int empsalary=3;
			
	

		}
	}
