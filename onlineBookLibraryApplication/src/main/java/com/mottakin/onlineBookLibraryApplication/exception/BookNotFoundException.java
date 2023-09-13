package com.mottakin.onlineBookLibraryApplication.exception;

public class BookNotFoundException extends Exception{
    public BookNotFoundException(String MESSAGE) {
        super(MESSAGE);
    }
}
