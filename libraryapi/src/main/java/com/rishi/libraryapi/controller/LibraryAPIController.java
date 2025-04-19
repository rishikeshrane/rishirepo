/**
 * 
 */
package com.rishi.libraryapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rishi.libraryapi.model.Book;
import com.rishi.libraryapi.service.LibraryAPIService;

/**
 * @author Rishikesh
 *
 */
@RestController
public class LibraryAPIController {

	private LibraryAPIService service;
	
	public LibraryAPIController(LibraryAPIService service) {
		this.service = service;
	}
	
	@GetMapping(path = "/libraryAPI")
	public Iterable<Book> getAllBooks() {
		return this.service.getAllBooks();
	}
	
	@PostMapping("/libraryAPI")
	public Book addBook(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@GetMapping("/libraryAPI/{id}")
	public Book findbyId(@PathVariable Long id) {
		return service.getBookById(id);
	}
}
