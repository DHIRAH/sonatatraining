package com.sonata.pDAOimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.pDAO.ProductIntf;
import com.sonata.pModel.Product;

public class ProductImpl implements ProductIntf {
    
    DBConnection db = new DBConnection();	
    PreparedStatement s1;	
    int row = 0;	
    @Override	
    public int save(Object object) {	
  
        Product p1 = (Product) object;	
        try {			s1 = db.getConnection().prepareStatement("insert into product values(?,?,?)");			     
            s1.setInt(1, p1.getProId());		
            s1.setString(2, p1.getProName());			
            s1.setDouble(3, p1.getProPrice());		
            row = s1.executeUpdate();		
            db.closeConnection();		} 
        catch (SQLException e) {e.printStackTrace();}		 
        
        finally { if (s1!=null){		
                
                try {	s1.close();	} 
                
                catch (SQLException e) {e.printStackTrace();		 
                } }}		
        return row;	
        }}