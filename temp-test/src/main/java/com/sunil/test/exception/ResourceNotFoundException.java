package com.sunil.test.exception;


public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(int id) {
        super("Resource with id :- " + id + " not found");
    }
}
