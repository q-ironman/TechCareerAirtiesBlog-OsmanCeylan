package com.example.osmanceylan.service;

import com.example.osmanceylan.dto.BlogDto;
import com.example.osmanceylan.entity.Blog;
import com.example.osmanceylan.exception.BlogNotFoundException;

import java.util.List;
import java.util.Map;

public interface IBlogService {

    // Mapping entity to dto
    BlogDto entity2Dto(Blog entity);
    // Mapping dto to entity
    Blog dto2Entity(BlogDto dto);
    // Create
    BlogDto create(BlogDto dto);
    // List
    List<BlogDto> list();
    // Find
    BlogDto find(Long id) ;
    // Update
    BlogDto update(Long id, BlogDto blogDto) ;
    // Delete
    Map<String,Boolean> delete(Long id) ;


}
