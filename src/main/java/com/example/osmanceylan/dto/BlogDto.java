package com.example.osmanceylan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotEmpty;
//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogDto implements Serializable {
    // Random Uid for serialization
    private static final long serialVersionUID = 1L;

    private Long id;
    @NotEmpty(message = "{blog.header.validation.constraints.NotNull.message}")
    private String header;
    @NotEmpty(message = "{blog.content.validation.constraints.NotNull.message}")
    private String context;
    private String image;
    private Date systemCreatedDate;
}
