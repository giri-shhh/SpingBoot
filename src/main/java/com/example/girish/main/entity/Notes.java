package com.example.girish.main.entity;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"}, callSuper = true)
@ToString(exclude = {"recipe"})
@Entity
public class Notes extends BaseEntity{

    @Lob
    private String recipeNotes;

    @OneToOne
    private Recipe recipe;

}