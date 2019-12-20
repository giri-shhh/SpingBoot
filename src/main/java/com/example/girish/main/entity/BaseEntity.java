package com.example.girish.main.entity;

import com.example.girish.main.utility.LoggedInUser;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDateTime creationDate;

    @UpdateTimestamp
    private LocalDateTime lastUpdateDate;

    @GeneratorType(type = LoggedInUser.class, when = GenerationTime.INSERT)
    private Long createdBy;

    @GeneratorType(type = LoggedInUser.class, when = GenerationTime.ALWAYS)
    private Long lastUpdatedBy;
}
