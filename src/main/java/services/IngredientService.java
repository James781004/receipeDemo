package services;

import commands.IngredientCommand;

public interface IngredientService {
	IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

	IngredientCommand saveIngredientCommand(IngredientCommand command);
}
