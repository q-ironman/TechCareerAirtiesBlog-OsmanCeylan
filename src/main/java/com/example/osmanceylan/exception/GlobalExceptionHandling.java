package com.example.osmanceylan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestControllerAdvice
public class GlobalExceptionHandling {
    @ExceptionHandler(BlogNotFoundException.class)
    public @ResponseBody ErrorResponse handlingBlogNotFoundException(){
        return new ErrorResponse( HttpStatus.NOT_FOUND.value(),ExceptionMessages.blogNotFoundMessage);
    }
}
