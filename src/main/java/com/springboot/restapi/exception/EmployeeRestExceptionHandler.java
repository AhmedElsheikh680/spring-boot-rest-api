package com.springboot.restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeRestExceptionHandler {

    // Add An Exception Handler For EmployeeNotFoundException

    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(EmployeeNotFoundException exc){
        EmployeeErrorResponse error = new EmployeeErrorResponse(HttpStatus.NOT_FOUND.value(),
                                                                exc.getMessage(),
                                                                System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // Add Another Exception Handler... TO Catch AnyException(Catch All)
    @ExceptionHandler
    public ResponseEntity<EmployeeErrorResponse> handleException(Exception exc){
        EmployeeErrorResponse error = new EmployeeErrorResponse(HttpStatus.BAD_REQUEST.value(),
                                                                exc.getMessage(),
                                                                System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
