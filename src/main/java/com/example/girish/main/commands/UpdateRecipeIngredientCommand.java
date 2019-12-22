package com.example.girish.main.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateRecipeIngredientCommand {
    private IngredientCommand byRecipeIdAndIngredientId;
    private Set<UnitOfMeasureCommand> unitOfMeasureCommands;
}
