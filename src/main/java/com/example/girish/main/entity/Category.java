package com.example.girish.main.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@ToString(exclude = {"recipes"})
@EqualsAndHashCode(exclude = {"recipes"}, callSuper = true)
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Category extends BaseEntity{

    private String name;
    private String description;

    @ManyToMany
    private Set<Recipe> recipes = new HashSet<>();

}
