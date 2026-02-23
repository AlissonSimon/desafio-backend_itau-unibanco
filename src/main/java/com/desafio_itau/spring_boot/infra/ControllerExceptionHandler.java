package com.desafio_itau.spring_boot.infra;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Void> invalidJsonHandler() {
        return ResponseEntity.badRequest().build();
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Void> validationErrorsHandler() {
        return ResponseEntity.badRequest().build();
    }
}
