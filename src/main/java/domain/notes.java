package domain;
import javax.persistence.*;

@Entity
public class notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private recipe recipe;

    @Lob
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public recipe getrecipe() {
        return recipe;
    }

    public void setrecipe(recipe recipe) {
        this.recipe = recipe;
    }

    public String getrecipeNotes() {
        return recipeNotes;
    }

    public void setrecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}

