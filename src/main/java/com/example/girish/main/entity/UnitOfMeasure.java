package com.example.girish.main.entity;

import lombok.*;

import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class UnitOfMeasure extends BaseEntity {

    private String description;

}
