package com.rishi.libraryserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rishi.libraryserver.model.Book;
import com.rishi.libraryserver.service.LibraryServerService;

@RestController
public class LibraryServerController {
	@Autowired
	private LibraryServerService service;
	
	@GetMapping("/libraryserver/book")
	public Book getBook() {
		return service.getBook();
	}

	@GetMapping("/libraryserver/book/{id}")
	public Book getBookById(@PathVariable long id) {
		
		if(id % 5 == 0) {
			try {
				Thread.sleep(5000);
				throw new RuntimeException("invalid book id.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return service.getBookById(id);
	}
}
