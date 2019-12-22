package com.example.girish.main.commands;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class CategoryCommand {
    private Long id;
    private String description;
}