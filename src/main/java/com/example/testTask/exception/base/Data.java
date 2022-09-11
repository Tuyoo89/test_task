package com.example.testTask.exception.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Data<T> {
    private T data;
    private String message;
    private HttpStatus httpStatus;
    private ZonedDateTime timestamp;

}
