package repository;

import org.springframework.data.repository.CrudRepository;

import domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
