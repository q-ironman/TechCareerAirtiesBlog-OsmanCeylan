package com.example.osmanceylan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BlogNotFoundException  extends RuntimeException{
    public BlogNotFoundException() {
        super();
    }
}
