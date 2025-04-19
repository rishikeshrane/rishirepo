package com.rishi.libraryclient.restproxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rishi.libraryclient.model.Book;

@FeignClient(name="proxyService", url = "http://localhost:8091")
public interface LibraryClientRestProxyService {
	
	@GetMapping("libraryserver/book")
	public ResponseEntity<Book> getBook();
	
	@GetMapping("libraryserver/book/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable long id);

}
