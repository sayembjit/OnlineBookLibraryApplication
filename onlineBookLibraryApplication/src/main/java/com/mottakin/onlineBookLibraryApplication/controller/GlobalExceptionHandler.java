package com.mottakin.onlineBookLibraryApplication.controller;

import com.mottakin.onlineBookLibraryApplication.exception.BookAlreadyExistsException;
import com.mottakin.onlineBookLibraryApplication.exception.BookNotAvailable;
import com.mottakin.onlineBookLibraryApplication.exception.BookNotFoundException;
import com.mottakin.onlineBookLibraryApplication.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({BookAlreadyExistsException.class})
    public ResponseEntity<String> handleBookAlreadyExistsException(String MESSAGE) {
        return new ResponseEntity<>(MESSAGE, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler({UserNotFoundException.class})
    public ResponseEntity<String> handleUserNotFoundException(String MESSAGE) {
        return new ResponseEntity<>(MESSAGE, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler({BookNotFoundException.class})
    public ResponseEntity<String> handleBookNotFoundException(String MESSAGE) {
        return new ResponseEntity<>(MESSAGE, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler({BookNotAvailable.class})
    public ResponseEntity<String> handleBookNotAvailableException(String MESSAGE) {
        return new ResponseEntity<>(MESSAGE, HttpStatus.BAD_REQUEST);
    }
}
