package com.luisedu.recipe_manager.service;

import com.luisedu.recipe_manager.entity.Recipe;
import com.luisedu.recipe_manager.repository.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    public Recipe save(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public void delete(Long id) {
        recipeRepository.deleteById(id);
    }
}
