package repository;

import org.springframework.data.repository.CrudRepository;

import domain.category;

public interface categoryRepository extends CrudRepository<category, Long> {

}
