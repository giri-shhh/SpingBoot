package com.example.girish.main.controller;

import com.example.girish.main.entity.Recipe;
import com.example.girish.main.service.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipes")
    public Set<Recipe> getAllRecipes() {
        return recipeService.getRecipes();
    }
}
