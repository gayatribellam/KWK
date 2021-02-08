import java.util.ArrayList;

public class CookingRecipe {
  
   private String name;
   private ArrayList<RecipeIngredient> ingredients = new ArrayList();
  
  
   public CookingRecipe(String name){
       this.name = name;
   }
  
   public String getName() {
	   return name;
   }
   
   public void setName(String name) {
	   this.name = name;
   }
   
   public ArrayList<RecipeIngredient> getIngredients(){
	   return ingredients;
   }
   
   public void setIngredients(ArrayList<RecipeIngredient> ingredients) {
	   this.ingredients = ingredients;
   }
   
   public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
	   for(RecipeIngredient r:ingredients)
		   if(ingredient.equals(r)) {
			   r.setQuantity(quantity);
		   }
	   ingredients.add(new RecipeIngredient(ingredient.getName(), ingredient.getMeasuringUnit(), ingredient.getCaloriesPerUnit(), quantity));
	   
   }
   
   public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
	   for(RecipeIngredient r:ingredients)
		   if(ingredient.equals(r)) 
			   return r;		   
	   return null;
   }
   
   public RecipeIngredient getRecipeIngredient(String ingredientName) {
	   for(RecipeIngredient r:ingredients)
		   if(ingredientName.equals(r.getName())) 
			   return r;		   
	   return null;
   }


  
   public RecipeIngredient removeRecipeIngredient(Ingredient ingredient){
      RecipeIngredient result = null;
      for(RecipeIngredient r:ingredients)
    	  if(ingredient.equals(r)) {
    		  result = r;
    		  break;
    	  }
      if(result != null)
    	  ingredients.remove(result);
      return result;  
   }

  
   public RecipeIngredient removeRecipeIngredient(String ingredientName){
	   RecipeIngredient result = null;
	      for(RecipeIngredient r:ingredients)
	    	  if(ingredientName.equals(r.getName())) {
	    		  result = r;
	    		  break;
	    	  }
	      if(result != null)
	    	  ingredients.remove(result);
	      return result; 
   }

   
   public int getNumberOfIngredients(){
     
       return ingredients.size();
      
   }
  
   public float calculateCalories() {
       float sum = 0;
       for(RecipeIngredient r:ingredients)
    	   sum += r.getQuantity() * r.getCaloriesPerUnit();
       
       return sum;
   }
  
 
   public String toString() {
	   String s = "CookingRecipe\n" + "name=" + name + "[";
	   for(RecipeIngredient r:ingredients)
		   s += r.toString() + "\n";
	   
       return s + "]";
   }
   
   public boolean equals(Object o) {
	   CookingRecipe c = (CookingRecipe)o;
	   return name.contentEquals(c.name) && ingredients.equals(c.ingredients);
   }
   
   
   
   
   
   
   
   
}


