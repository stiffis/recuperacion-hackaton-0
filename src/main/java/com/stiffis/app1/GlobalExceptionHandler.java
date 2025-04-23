package com.stiffis.app1;

import com.stiffis.app1.exceptions.ErrorMessage;
import com.stiffis.app1.exceptions.HuanaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HuanaException.class)
    public ResponseEntity<ErrorMessage> handleHuanaException(HuanaException ex){
        ErrorMessage error=new ErrorMessage(ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}
