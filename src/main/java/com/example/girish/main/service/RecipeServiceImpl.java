package com.example.girish.main.service;

import com.example.girish.main.entity.Recipe;
import com.example.girish.main.repo.RecipeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        HashSet<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().forEach(recipes::add);
        return recipes;
    }

    @Override
    public Recipe findRecipe(Long id) throws Exception {
        return recipeRepository.findById(id).orElseThrow(() -> new Exception("Recipe Not Found"));
    }

    @Override
    public Long addRecipe(Recipe recipe) {
        return recipeRepository.save(recipe).getId();
    }

    @Override
    public void addAllRecipes(Set<Recipe> recipes) {
            recipeRepository.saveAll(recipes);
    }

    @Override
    public void deleteRecipe(Long id) {
        recipeRepository.deleteById(id);
    }

    @Override
    public  void deleteAllRecipes() {
        recipeRepository.deleteAll();
    }
    
}
