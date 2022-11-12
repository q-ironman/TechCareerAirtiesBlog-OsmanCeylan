package com.example.osmanceylan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestControllerAdvice
public class GlobalExceptionHandling {
    @ExceptionHandler(BlogNotFoundException.class)
    public String handlingBlogNotFoundException(){return ExceptionMessages.blogNotFoundMessage;}
}
