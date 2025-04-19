package com.rishi.libraryapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rishi.libraryapi.model.Book;

@Repository
public interface LibraryAPIRepository extends CrudRepository<Book, Long> {

}
