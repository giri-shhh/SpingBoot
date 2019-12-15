package com.example.girish.main.service;

import com.example.girish.main.entity.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findRecipe(Long id) throws Exception;

    Long addRecipe(Recipe recipe);

    void addAllRecipes(Set<Recipe> recipes);

    void deleteRecipe(Long id);

    void deleteAllRecipes();
}
