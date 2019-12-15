package com.example.girish.main.service;

import com.example.girish.main.entity.Recipe;

import java.util.Set;

public interface RecipeService {

    abstract Set<Recipe> getRecipes();

    Recipe findRecipe(Long id) throws Exception;

    Long addRecipe(Recipe recipe);

    abstract void addAllRecipes(Set<Recipe> recipes);

    abstract void deleteRecipe(Long id);

    abstract void deleteAllRecipes();
}
