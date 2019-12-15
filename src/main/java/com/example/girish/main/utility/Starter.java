package com.example.girish.main.utility;

import com.example.girish.main.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Starter implements CommandLineRunner {

    private final RecipeService recipeService;

    public Starter(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(recipeService.getRecipes().toString());
    }
}