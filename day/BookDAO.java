package com.sonata.day;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	public List <Book>getBook(){
		List<Book>books=new ArrayList<>();
	books.add(new Book(102,"core java",400));
	books.add(new Book(101,"Hibernate",300));
	books.add(new Book(104,"Spring",200));
	books.add(new Book(103,"reactJs",300));
	return books;
	
	}

}
