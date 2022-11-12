package com.example.osmanceylan.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass

public abstract class BaseEntity {
    //Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Initialize Date
    @Column(name = "system_created_date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date systemCreatedDate;
    //Last change date
    @Column(name="last_modified_date")
    @LastModifiedDate
    private Date lastModifiedDate;
}
