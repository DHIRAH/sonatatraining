package com.sonata.PJdbc;

import com.sonata.pDAOimpl.ProductImpl;
import com.sonata.pModel.Product;

public class App {
public static void main(String[] args) {
		Product s1 = new Product();
		s1.setProId(100);
		s1.setProName("shyam");
		s1.setProPrice(2355.55);
		ProductImpl p1 = new ProductImpl();
		int a = p1.save(s1);
		System.out.println(a);
			

	}



	
	}

