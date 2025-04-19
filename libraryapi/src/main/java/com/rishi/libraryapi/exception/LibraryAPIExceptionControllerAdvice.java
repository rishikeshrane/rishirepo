/**
 * 
 */
package com.rishi.libraryapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.rishi.libraryapi.model.ErrorResponse;

/**
 * @author Rishikesh
 *
 */
@ControllerAdvice
public class LibraryAPIExceptionControllerAdvice {

	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleBookNotFound() {
		ErrorResponse e = new ErrorResponse("Er-1", "Book Not Found.");
		
		ResponseEntity<ErrorResponse> rs = new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
		return rs;
	}
	
	@ExceptionHandler(BookIsExpensiveException.class)
	public ResponseEntity<ErrorResponse> handleBookIsExpensive() {
		ErrorResponse e = new ErrorResponse("Er-2", "Book is expensive.");
		
		ResponseEntity<ErrorResponse> rs = new ResponseEntity<>(e, HttpStatus.PRECONDITION_FAILED);
		return rs;
	}
}
