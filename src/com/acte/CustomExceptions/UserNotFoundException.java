package com.acte.CustomExceptions;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String msg) {
		super(msg);
	}

}
