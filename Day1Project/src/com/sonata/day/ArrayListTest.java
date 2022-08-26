package com.sonata.day;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.List;

public class ArrayListTest {
	/*@Test
	public void testAdd() {
		ArrayListDemo arrobj1 = new ArrayListDemo();
		arrobj1.add(1);
		arrobj1.add(2);
		arrobj1.add(3);
		arrobj1.add(4);
		arrobj1.add(5);
		arrobj1.add(6);
		
		int size=arrobj1.getSize();
		System.out.println(size);
		assertEquals(6,size);
		
	}
*/



	@Test
	public void testbook() {
		List<Book> books = new BookDAO().getBook();
		books.add(new Book(102,"core java",400));
		books.add(new Book(101,"Hibernate",300));
		books.add(new Book(104,"Spring",200));
		books.add(new Book(103,"reactJs",300));
		 
		int size =books.size();
		System.out.println(size);
		assertEquals(8,size);
		
	}
	
	
	
}