package com.mottakin.onlineBookLibraryApplication.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String MESSAGE) {
        super(MESSAGE);
    }
}
