package com.mottakin.onlineBookLibraryApplication.exception;

public class BookNotAvailable extends Exception {
    public BookNotAvailable(String MESSAGE) {
        super(MESSAGE);
    }
}
