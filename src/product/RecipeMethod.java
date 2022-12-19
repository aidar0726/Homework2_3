package product;

import java.util.Set;

public class RecipeMethod {

    public static void addRecipe(Set<Recipe> recipes, Recipe recipe) throws RecipeMethodException {
        if (recipes.size() == 0) {
            for (Recipe recipeOne : recipes) {
                if (recipeOne.getName().equals(recipe.getName())) {
                    throw new RecipeMethodException("Данный рецепт уже имеется!");
                } else {
                    recipes.add(recipe);
                }
            }

        }
    }

    public static int calculatesSumPrices(Recipe recipe) {
        Set<Product> products = recipe.getConvenienceFood();
        int sumPrices = 0;

        for (Product product : products) {
            sumPrices = sumPrices + product.getPrice();
        }

        return sumPrices;

    }

}
