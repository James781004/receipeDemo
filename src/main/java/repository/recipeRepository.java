package repository;

import org.springframework.data.repository.CrudRepository;

import domain.recipe;

public interface recipeRepository extends CrudRepository<recipe, Long> {

}
