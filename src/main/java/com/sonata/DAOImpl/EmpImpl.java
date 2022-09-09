package com.sonata.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.sonata.EModel.employee;
import com.sonata.Intf.EmpIntf;
import com.sonata.Model.Employee;

public class EmpImpl implements EmpIntf {
	int row = 0 ;
	public int save(Object object, Statement db) {
		employee p1 =(employee) object;
		try {
			

			PreparedStatement e1 = db.getConnection().prepareStatement("insert into employe value(?,?,?");
			e1.setInt(1,p1.getEmpID() );
			e1.setNString(2,p1.getEmpName());
			row = e1.executeUpdate();
			db.getConnection();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return row;
	}
	@Override
	public double yearlySal(Employee e1) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double appSal(Employee e1) {
		// TODO Auto-generated method stub
		return 0;
	}

	


	}
	
	
	
	

	

		
		
	


