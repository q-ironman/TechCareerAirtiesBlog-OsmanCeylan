package com.example.osmanceylan.web.api;

import com.example.osmanceylan.dto.BlogDto;
import com.example.osmanceylan.exception.BlogNotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface IBlogApi {

    // Create
    ResponseEntity<BlogDto> create(BlogDto dto);
    // List
    ResponseEntity<List<BlogDto>> list();
    // Find
    ResponseEntity<BlogDto> find(Long id) ;
    // Update
    ResponseEntity<BlogDto> update(Long id, BlogDto blogDto) ;
    // Delete
    ResponseEntity<Map<String,Boolean>> delete(Long id) ;

}
