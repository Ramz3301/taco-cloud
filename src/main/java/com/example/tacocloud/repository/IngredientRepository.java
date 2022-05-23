package com.example.tacocloud.repository;

import com.example.tacocloud.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository
        extends CrudRepository<Ingredient, Long> {
}
