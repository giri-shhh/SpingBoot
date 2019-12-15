package com.example.girish.main.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"recipes"}, callSuper = true)
@ToString(exclude = {"recipes"})
@Entity
public class Category extends BaseEntity{

    private String name;
    private String description;

    @ManyToMany
    private Set<Recipe> recipes = new HashSet<>();

}
