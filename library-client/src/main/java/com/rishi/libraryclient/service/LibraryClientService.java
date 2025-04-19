package com.rishi.libraryclient.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rishi.libraryclient.model.Book;

@Service
public class LibraryClientService {

	public Book getBook() {
		RestTemplate rt = new RestTemplate();
		ResponseEntity< Book> re =	rt.getForEntity("http://localhost:8091/libraryserver/book", Book.class);
		System.out.println("got resp from server.");
		return re.getBody();
		
	}
}
