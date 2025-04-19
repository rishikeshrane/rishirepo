package com.rishi.libraryapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rishi.libraryapp.model.Book;
import com.rishi.libraryapp.restproxy.LibraryAppProxyService;

@Controller
public class LibraryAppController {
	
	@Autowired
	private LibraryAppProxyService proxy;
	
	@RequestMapping(path="/library" , method=RequestMethod.GET)
	public String getAllBooks(Model page) {
		Iterable<Book> bs= proxy.getAllBooks();
		page.addAttribute("books", bs);
		
		return "books.html";
	}
	

}
