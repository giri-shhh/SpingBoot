package com.example.girish.main.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@ToString(exclude = {"recipe"})
@EqualsAndHashCode(exclude = {"recipe"}, callSuper = true)
public class Notes extends BaseEntity{

    @Lob
    private String recipeNotes;

    @OneToOne
    private Recipe recipe;

}