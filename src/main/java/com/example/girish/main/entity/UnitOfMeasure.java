package com.example.girish.main.entity;

import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class UnitOfMeasure extends BaseEntity {

    private String description;

}
