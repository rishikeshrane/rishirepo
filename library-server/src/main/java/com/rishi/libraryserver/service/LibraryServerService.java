package com.rishi.libraryserver.service;

import org.springframework.stereotype.Service;

import com.rishi.libraryserver.model.Book;

@Service
public class LibraryServerService {
	public Book getBook() {
		Book b = new Book();
		b.setName("Book1");
		b.setAuthor("Author");
		b.setPrice(100.19);
		
		return b;
	}
	
	public Book getBookById(long id) {
		Book b = new Book();
		b.setName("Book" +id);
		b.setAuthor("Author" +id);
		b.setPrice(100.19);
		
		return b;
	}
}
