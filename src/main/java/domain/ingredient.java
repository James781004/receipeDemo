package domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descirption;
	private BigDecimal amount;

	@OneToOne(fetch = FetchType.EAGER)
	private unitOfMeasure uom;

	public unitOfMeasure getUom() {
		return uom;
	}

	public void setUom(unitOfMeasure uom) {
		this.uom = uom;
	}

	@ManyToOne
	private recipe recipe;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescirption() {
		return descirption;
	}

	public void setDescirption(String descirption) {
		this.descirption = descirption;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(recipe recipe) {
		this.recipe = recipe;
	}

	@Override
	public String toString() {
		return "ingredient [descirption=" + descirption + ", amount=" + amount + ", recipe=" + recipe + "]";
	}
}
