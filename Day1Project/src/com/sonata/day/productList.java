package com.sonata.day;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class productList {
public static void main(String args[]) {

	List<product> p1 =new LinkedList<product>();
	p1.add(new product(123,"tv",346));
	p1.add(new product(124,"mobile",946));
	p1.add(new product(125,"laptop",846));
	
	for(product p2:p1) {
		System.out.println(p2.pId +"    "+p2.pName+"    "+p2.pPrice);
	}
	 LinkedList<String> l1 =new LinkedList<String>();
//	 int b=10;
	 l1.add("dhiraj");
	 l1.add("simple");
	 l1.add("just");
	l1.add("show");
	l1.addFirst("simple");
	l1.addLast("last");
	System.out.println(l1);
	
	Iterator<String> i1 =l1.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	}
}
