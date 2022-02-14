package com.asml.training.exception;

public class ResourceAlreadyExistsException extends Exception {
	public ResourceAlreadyExistsException() {}

    public ResourceAlreadyExistsException(String message) {
        super(message);
    }

}
