package com.example.osmanceylan.web.api.impl;

import com.example.osmanceylan.dto.BlogDto;
import com.example.osmanceylan.exception.BlogNotFoundException;
import com.example.osmanceylan.service.IBlogService;
import com.example.osmanceylan.web.api.IBlogApi;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Lombok
@RequiredArgsConstructor
@Log4j2

// Api
@RestController
@RequestMapping("api/blog/v1")
@CrossOrigin
public class BlogApi implements IBlogApi {
    // Injection
    private final IBlogService service;

    //Create
    //http://localhost:8080/api/blog/v1/create
    @Override
    @PostMapping("/create")
    public ResponseEntity<BlogDto> create(@Valid @RequestBody BlogDto dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    //List
    //http://localhost:8080/api/blog/v1/list
    @Override
    @GetMapping("/list")
    public ResponseEntity<List<BlogDto>> list() {
        return ResponseEntity.ok(service.list());
    }

    //Find
    //http://localhost:8080/api/blog/v1/find/1
    @Override
    @GetMapping("/find/{id}")
    public ResponseEntity<BlogDto> find(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(service.find(id));
    }

    //Update
    //http://localhost:8080/api/blog/v1/update/1
    @Override
    @PutMapping("/update/{id}")
    public ResponseEntity<BlogDto> update(@PathVariable(name = "id") Long id, @Valid @RequestBody BlogDto blogDto)  {
        service.update(id,blogDto);
        return ResponseEntity.ok(blogDto);
    }

    //Delete
    //http://localhost:8080/api/blog/v1/delete/1
    @Override
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Boolean>> delete(@PathVariable(name = "id") Long id)  {
        service.delete(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
