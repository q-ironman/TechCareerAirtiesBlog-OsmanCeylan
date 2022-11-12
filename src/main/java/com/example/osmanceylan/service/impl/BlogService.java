package com.example.osmanceylan.service.impl;

import com.example.osmanceylan.bean.ModelMapperBean;
import com.example.osmanceylan.dto.BlogDto;
import com.example.osmanceylan.entity.Blog;
import com.example.osmanceylan.exception.BlogNotFoundException;
import com.example.osmanceylan.repository.IBlogRepository;
import com.example.osmanceylan.service.IBlogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Lombok
@RequiredArgsConstructor
@Log4j2

@Service
public class BlogService implements IBlogService {

    //injection
    private final IBlogRepository repository;
    private final ModelMapperBean modelMapperBean;
    // Model Mapping
    @Override
    public BlogDto entity2Dto(Blog entity) {

        return modelMapperBean.modelMapperMethod().map(entity,BlogDto.class);
    }

    @Override
    public Blog dto2Entity(BlogDto dto) {

        return modelMapperBean.modelMapperMethod().map(dto,Blog.class);
    }

    // Create
    @Override
    public BlogDto create(BlogDto dto) {
        Blog entity = dto2Entity(dto);
        repository.save(entity);
        return dto;
    }

    // List
    @Override
    public List<BlogDto> list() {
        List<Blog> entityList = repository.findAll();
        List<BlogDto> dtoList = new ArrayList<>();

        entityList.forEach(tmp -> dtoList.add(entity2Dto(tmp)));

        return dtoList;
    }

    //Find
    @Override
    public BlogDto find(Long id){
        Blog entity = repository.findById(id).orElseThrow(() -> new BlogNotFoundException());
        return entity2Dto(entity);
    }

    // Update
    @Override
    public BlogDto update(Long id, BlogDto blogDto){
        Blog entity = repository.findById(id).orElseThrow(() -> new BlogNotFoundException());
        entity.setContext(blogDto.getContext());
        entity.setHeader(blogDto.getHeader());
        entity.setImage(blogDto.getImage());
        repository.save(entity);
        return blogDto;
    }

    // Delete
    @Override
    public Map<String, Boolean> delete(Long id){
        Blog entity = repository.findById(id).orElseThrow(() -> new BlogNotFoundException());
        repository.delete(entity);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted",true);
        return response;
    }
}
