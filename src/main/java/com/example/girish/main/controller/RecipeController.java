package com.example.girish.main.controller;

import com.example.girish.main.entity.Recipe;
import com.example.girish.main.service.RecipeService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addRecipe")
    public Long addProduct(@RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRecipe(@PathVariable("id") Long id) {
        recipeService.deleteRecipe(id);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        recipeService.deleteAllRecipes();
    }

    @GetMapping("/{id}")
    public Recipe getRecipe(@PathVariable("id") Long id) throws Exception {
        return recipeService.findRecipe(id);
    }
}
