package remen;

public class Ramen {
	private Recipe recipe = null;
	
	public Ramen() {
		this(new GeneralRemanRecipe());
	}

	public Ramen(Recipe recipe) {
		this.recipe = recipe;
	}
	
	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	
	public void performCook() {
		recipe.cook();
	}
	
}
