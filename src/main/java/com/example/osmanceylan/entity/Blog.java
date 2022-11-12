package com.example.osmanceylan.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//Entity
@Entity
@Table(name = "Blog")
public class Blog extends BaseEntity implements Serializable {
    //Random uid for serialization
    private static final long serialVersionUID =1L;
    // Header
    @Column(name = "Header")
    @NotNull
    private String header;
    // Context
    @Column(name = "Context")
    @NotNull
    private String context;
    // Image
    @Column(name = "Image")
    private String image;
}
