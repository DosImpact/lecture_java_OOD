package remen;

public class MainTest {

	public static void main(String[] args) {
		
		Recipe[] recipes = {
				new GeneralRemanRecipe(),
				new CheeseRemenRecipe(),
				new MilkRamenRecipe(),
				new VinegarRamenReciple(),
				new RamenWithoutBrothReciple()
		};
		Ramen ramen = new Ramen();
		for(Recipe recipe : recipes ) {
			ramen.setRecipe(recipe);
			ramen.performCook();
		}
	}

}
