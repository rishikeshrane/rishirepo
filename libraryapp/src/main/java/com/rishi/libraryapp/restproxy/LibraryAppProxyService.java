package com.rishi.libraryapp.restproxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.rishi.libraryapp.model.Book;

//@FeignClient(name="libraryFeignClientService", url = "http://localhost:8081")
@FeignClient("library-api")
@Service
public interface LibraryAppProxyService {

	@GetMapping("/libraryAPI")
	public Iterable<Book> getAllBooks();
}
