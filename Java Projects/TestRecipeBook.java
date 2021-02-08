import java.util.ArrayList;

public class TestRecipeBook {

//	public static void main(String[] args) {
//		RecipeBook r = new RecipeBook("Chef x");
//		
//		r.addRecipe("chili", new RecipeIngredient[] {
//			new RecipeIngredient("beans", "grams",100,100),
//			new RecipeIngredient("veganmeat", "grams", 100, 200)
//		});
//		
//		System.out.println(r.getRecipes().size());
//		
//		r.addRecipe("burger", new RecipeIngredient[] {
//				new RecipeIngredient("bread", "grams",100,100),
//				new RecipeIngredient("tomato", "grams", 100, 200),
//				new RecipeIngredient("veganmeat", "grams",100,100),
//				
//			});
//		
//		r.addRecipe("NoBakes", new RecipeIngredient[] {
//				new RecipeIngredient("peanut butter", "grams",100,100),
//				new RecipeIngredient("oats", "grams", 100, 200),
//				new RecipeIngredient("honey", "grams",100,100),
//				
//			});
//		
//		System.out.println(r);
//		
//		CookingRecipe [] few = r.findRecipesWithFewIngredients(2);
//		for(CookingRecipe c:few)
//			System.out.println(c);
//		
//		CookingRecipe [] low = r.findRecipesLowCalories();
//		for(CookingRecipe c:low)
//			System.out.println(c);
//		
//		System.out.println(r.getBookName());
//		r.removeRecipe("NoBakes");
//		
//		
//		RecipeBook s = new RecipeBook("Chef y");
//		
//		s.addRecipe("veggiestew", new RecipeIngredient[] {
//				new RecipeIngredient("beans", "grams",100,100),
//				new RecipeIngredient("olives", "grams",100,100)
//			});
//		
//		RecipeIngredient x = new RecipeIngredient("beans", "grams",100,100);
//		RecipeIngredient y = new RecipeIngredient("olives", "grams",100,100);
//		
//		System.out.println(r.equals(s));
//		
//	
//		
//		
//		
//		
//		
//		
//		
//		
//	
//
//	}
	
	public static void main(String[] args) {

		RecipeBook r = new RecipeBook("The Best Foods");

		r.addRecipe("Tiramisu", new RecipeIngredient[]{

			new RecipeIngredient("sugar","grams",100,100),

			new RecipeIngredient("mascarpone","grams",100,200),

			new RecipeIngredient("ladyfinger","grams",100,300),

			new RecipeIngredient("egg","grams",200,200),

			new RecipeIngredient("cream","grams",200,200),

			new RecipeIngredient("chocolate","grams",150,400),

			new RecipeIngredient("coffee","milliliters",200,300),

			new RecipeIngredient("cookie","grams",250,300)

		});

		

		System.out.println(r.getRecipes().size());

		

		r.addRecipe("Sushi",  new RecipeIngredient[]{

			new RecipeIngredient("Rice","grams",150,200),

			new RecipeIngredient("Shrimp","grams",100,200),

			new RecipeIngredient("Seewead","grams",100,300),

			new RecipeIngredient("Avocado","grams",125,200),

			new RecipeIngredient("egg","grams",225,400),

			new RecipeIngredient("Rice Vinegar","milliliters",100,200),

			new RecipeIngredient("Soy Sauce","milliliters",50,100),

			new RecipeIngredient("Cucumber","grams",150,200)

		});

		

		r.addRecipe("Dumplings", new RecipeIngredient[]{

			new RecipeIngredient("Flour","grams",200,400),

			new RecipeIngredient("Shrimp","grams",100,200),

			new RecipeIngredient("Water","milliliters",150,200),

			new RecipeIngredient("Egg","grams",200,200),

			new RecipeIngredient("Pork","grams",150,300),

			new RecipeIngredient("Soy Sauce","milliliters",175,325),

		});

		

		System.out.println(r);

		

		CookingRecipe[] few = r.findRecipesWithFewIngredients(2);

		for(CookingRecipe c:few)

			System.out.println(c);

		

		CookingRecipe[] low = r.findRecipesLowCalories();

		for(CookingRecipe c:low)

			System.out.println(c);

}

}
