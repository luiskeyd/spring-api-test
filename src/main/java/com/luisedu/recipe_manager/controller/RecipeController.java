package com.luisedu.recipe_manager.controller;

import com.luisedu.recipe_manager.entity.Recipe;
import com.luisedu.recipe_manager.service.RecipeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
@AllArgsConstructor
public class RecipeController {
    private final RecipeService recipeService;

    @GetMapping
    public List<Recipe> getAll() {
        return recipeService.getAll();
    }

    @PostMapping
    public Recipe create(@RequestBody Recipe recipe) {
        return recipeService.save(recipe);
    }
}
