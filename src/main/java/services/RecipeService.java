package services;

import java.util.Set;

import commands.RecipeCommand;
import domain.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();

	Recipe findById(Long l);

	RecipeCommand saveRecipeCommand(RecipeCommand command);

	RecipeCommand findCommandById(Long l);
}
