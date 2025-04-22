package com.stiffis.app1.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class HuanaException extends RuntimeException {
    public HuanaException(String message) {
		super(message);
	}
}

