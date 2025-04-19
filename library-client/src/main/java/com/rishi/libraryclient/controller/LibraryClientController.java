package com.rishi.libraryclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rishi.libraryclient.model.Book;
import com.rishi.libraryclient.restproxy.LibraryClientRestProxyService;
import com.rishi.libraryclient.service.LibraryClientService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class LibraryClientController {

	@Autowired
	private LibraryClientService service;
	
	@Autowired
	private LibraryClientRestProxyService proxy;
	
	@GetMapping("/libraryclient/book")
	public Book getBook() {
		//return service.getBook();
		System.out.println("gettng response from feign client.");
		return proxy.getBook().getBody();
	}

	@CircuitBreaker(name = "libraryserver", fallbackMethod = "getBookName_fallback")
	@GetMapping("/libraryclient/book/{id}")
	public String getBookName(@PathVariable long id) {
		return proxy.getBookById(id).getBody().getName();
	}
	
	public String getBookName_fallback( long id, Exception e) {
		return "circuit breaker is open id:" +id + " exp msg=" +e.getMessage();
	}
}
