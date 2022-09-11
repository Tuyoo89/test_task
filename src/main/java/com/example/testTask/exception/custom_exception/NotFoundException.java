package com.example.testTask.exception.custom_exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}
