package com.example.girish.main.controller;

import com.example.girish.main.commands.IngredientCommand;
import com.example.girish.main.commands.RecipeCommand;
import com.example.girish.main.commands.UnitOfMeasureCommand;
import com.example.girish.main.commands.UpdateRecipeIngredientCommand;
import com.example.girish.main.service.IngredientService;
import com.example.girish.main.service.RecipeService;
import com.example.girish.main.service.UnitOfMeasureService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by jt on 6/28/17.
 */
@Slf4j
@RestController
public class IngredientController {

    private final IngredientService ingredientService;
    private final RecipeService recipeService;
    private final UnitOfMeasureService unitOfMeasureService;

    public IngredientController(IngredientService ingredientService, RecipeService recipeService, UnitOfMeasureService unitOfMeasureService) {
        this.ingredientService = ingredientService;
        this.recipeService = recipeService;
        this.unitOfMeasureService = unitOfMeasureService;
    }

    @SneakyThrows
    @GetMapping("/recipe/{recipeId}/ingredients")
    public RecipeCommand listIngredients(@PathVariable String recipeId, Model model) throws Exception {
        log.debug("Getting ingredient list for recipe id: " + recipeId);
        return recipeService.findCommandById(Long.valueOf(recipeId));
    }

    @GetMapping("recipe/{recipeId}/ingredient/{id}/show")
    public IngredientCommand showRecipeIngredient(@PathVariable String recipeId,
                                                  @PathVariable String id, Model model) {
        return ingredientService.findByRecipeIdAndIngredientId(Long.valueOf(recipeId), Long.valueOf(id));
    }

    @SneakyThrows
    @GetMapping("recipe/{recipeId}/ingredient/new")
    public Set<UnitOfMeasureCommand> newRecipe(@PathVariable String recipeId, Model model) throws Exception {

        //make sure we have a good id value
        RecipeCommand recipeCommand = recipeService.findCommandById(Long.valueOf(recipeId));
        //todo raise exception if null

        //need to return back parent id for hidden form property
        IngredientCommand ingredientCommand = new IngredientCommand();
        ingredientCommand.setRecipeId(Long.valueOf(recipeId));
        model.addAttribute("ingredient", ingredientCommand);

        //init uom
        ingredientCommand.setUom(new UnitOfMeasureCommand());

        return unitOfMeasureService.listAllUoms();
    }

    @GetMapping("recipe/{recipeId}/ingredient/{id}/update")
    public UpdateRecipeIngredientCommand updateRecipeIngredient(@PathVariable String recipeId,
                                         @PathVariable String id, Model model) {
        IngredientCommand byRecipeIdAndIngredientId = ingredientService.findByRecipeIdAndIngredientId(Long.valueOf(recipeId), Long.valueOf(id));

        Set<UnitOfMeasureCommand> unitOfMeasureCommands = unitOfMeasureService.listAllUoms();

        return new UpdateRecipeIngredientCommand(byRecipeIdAndIngredientId, unitOfMeasureCommands);
    }

    @PostMapping("recipe/{recipeId}/ingredient")
    public IngredientCommand saveOrUpdate(@ModelAttribute IngredientCommand command) {
        IngredientCommand savedCommand = ingredientService.saveIngredientCommand(command);

        log.debug("saved receipe id:" + savedCommand.getRecipeId());
        log.debug("saved ingredient id:" + savedCommand.getId());
        return savedCommand;
    }

    @GetMapping("recipe/{recipeId}/ingredient/{id}/delete")
    public boolean deleteIngredient(@PathVariable String recipeId,
                                    @PathVariable String id) {
        log.debug("deleting ingredient id:" + id);
        return ingredientService.deleteById(Long.valueOf(recipeId), Long.valueOf(id));
    }
}
