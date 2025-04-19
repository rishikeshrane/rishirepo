/**
 * 
 */
package com.rishi.libraryapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rishi.libraryapi.config.LibraryAPIConfigurationProperties;
import com.rishi.libraryapi.exception.BookIsExpensiveException;
import com.rishi.libraryapi.exception.BookNotFoundException;
import com.rishi.libraryapi.model.Book;
import com.rishi.libraryapi.repository.LibraryAPIRepository;

/**
 * @author Rishikesh
 *
 */
@Service
public class LibraryAPIService {

	@Autowired
	private LibraryAPIConfigurationProperties prop;
	private LibraryAPIRepository repo;
	
	public LibraryAPIService(LibraryAPIRepository repo) {
		this.repo = repo;
	}
	
	public Iterable<Book> getAllBooks() {
		return this.repo.findAll();
	}
	
	public Book getBookById(long id) {
		return repo.findById(id).orElseThrow(()-> new BookNotFoundException(1, "Book not found."));
	}
	
	public Book addBook(Book book) {
		if(book.getPrice() > prop.getMaxLimit()) {
			throw new BookIsExpensiveException(2, "Book is expensive.");
		}
		return repo.save(book);
	}
}
