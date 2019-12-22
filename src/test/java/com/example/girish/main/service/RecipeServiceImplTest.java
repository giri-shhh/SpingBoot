package com.example.girish.main.service;

import com.example.girish.main.convert.RecipeToRecipeCommand;
import com.example.girish.main.entity.Recipe;
import com.example.girish.main.repo.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {
    RecipeService recipeService;
    RecipeToRecipeCommand recipeToRecipeCommand;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository, recipeToRecipeCommand);
    }

    @Test
    public void getRecipes() {
        Recipe recipe = new Recipe();
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipes);
        Set<Recipe> recipesResult = recipeService.getRecipes();
        assertEquals(recipesResult.size(), 1);
        verify(recipeRepository, times(1)).findAll();
    }
}