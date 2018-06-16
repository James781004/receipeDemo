package controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Category;
import domain.UnitOfMeasure;
import repository.CategoryRepository;
import repository.UnitOfMeasureRepository;

@Controller
public class IndexController {

	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;

	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}

	@RequestMapping({ "", "/", "/index" })
	public String getIndexPage() {

		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

		System.out.println("Cat Id is: " + categoryOptional.get().getId());
		System.out.println("UOM ID is: " + unitOfMeasureOptional.get().getId());

		return "index";
	}
}
