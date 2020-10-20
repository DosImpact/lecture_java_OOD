package Stretegy.remen;

public class Remen {
	private Recipe recipe;

	public Remen() {
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	public void cook() {
		this.recipe.cook();
	}
	
}
