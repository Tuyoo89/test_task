package com.example.testTask.exception.handler;

import com.example.testTask.exception.base.Data;
import com.example.testTask.exception.custom_exception.ApiRequestException;
import com.example.testTask.exception.custom_exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){
        Data<?> apiException = new Data(
                e.getMessage(),
                e.getCause().toString(),
                HttpStatus.INTERNAL_SERVER_ERROR,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(apiException, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = {NotFoundException.class})
    public ResponseEntity<?> handleNotFoundException(NotFoundException e){
        Data<?> data = new Data();
        data.setMessage(e.getMessage());
        data.setHttpStatus(HttpStatus.NOT_FOUND);
        data.setTimestamp(ZonedDateTime.now(ZoneId.of("Z")));
        return ResponseEntity.ok(data);
    }

}
