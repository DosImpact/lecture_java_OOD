package Stretegy.remen;

public class MainTest {

	public static void main(String[] args) {
		Recipe[] recipes = {new MikeRecipe(),new OnionRecipe(),new CheezeRecipe()};
		Remen remen = new Remen();
		for(Recipe recipe : recipes ) {
			remen.setRecipe(recipe);
			remen.cook();
		}
	}

}
