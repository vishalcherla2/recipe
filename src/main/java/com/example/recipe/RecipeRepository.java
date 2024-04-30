package com.example.recipe;

import java.util.*;
import com.example.recipe.Recipe;

public interface RecipeRepository {
  ArrayList<Recipe> getAllRecipies();

  Recipe addRecipe(Recipe recipe);

  Recipe getRecipeById(int recipeId);

  Recipe updateRecipe(int recipeId, Recipe recipe);

  void deleteRecipe(int recipeId);
}