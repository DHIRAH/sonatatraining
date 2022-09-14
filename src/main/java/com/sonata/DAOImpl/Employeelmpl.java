package com.sonata.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.DAO.DBConnection;
import com.sonata.Emodel.Employee;
import com.sonata.empIntf.Empintf;

public class Employeelmpl implements Empintf{
        DBConnection db = new DBConnection();
        int row = 0;
        public int save(Object object) {
            Employee  e1 =(Employee) object;
            try {
                PreparedStatement s1= db.getConnection().prepareStatement("insert into employee values (?,?,?)");
                s1.setInt(1,e1.getEmpId());
                s1.setString(2,e1.getEmpName());
                s1.setDouble(3,e1.getEmpSal());
                row =s1.executeUpdate();
                db.closeConnection();
                
            }catch (SQLException e) {
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
		}}