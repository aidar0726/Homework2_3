package product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TestProduct {
    public static void main(String[] args) {
        Product apple = new Product("яблоки", 1000, 2);
        Product pear = new Product("груши", 1000, 3);
        Product peach = new Product("персик", 2000, 3);
        Set<Product> products = new HashSet<>();


        try {
            ProductMethod.addsProduct(apple, products);
            ProductMethod.addsProduct(pear, products);
            ProductMethod.addsProduct(peach, products);
        } catch (ProductDuplicateException e) {
            e.printStackTrace();
        }

        ProductMethod.removeProduct(peach, products);


        System.out.print("ДЗ2-1");

        Recipe recipeOne = new Recipe(products, "салат");
        Recipe recipeTwo = new Recipe(products, "винигрет");
        Set<Recipe> Recipes = new HashSet<>();
        //HashMap<String, Integer> Recipes = new HashMap<>();

        System.out.println(RecipeMethod.calculatesSumPrices(recipeOne));

        try {
            RecipeMethod.addRecipe(Recipes, recipeTwo);
        } catch (RecipeMethodException e) {
            e.printStackTrace();
        }


    }
}
