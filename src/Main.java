
import product.*;

import java.rmi.RemoteException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Car mersedesAmg = new Car("Mersedes", "C200", 3, 2, 200, 60, BodyType.CROSSOVER);
        Bus ikarus = new Bus("Ikarus", "F200", 9, 2, 200, 60, Size.S);
        Truck shahman = new Truck("Mersedes", "Shahman", 15, 2, 180, 60, LoadCapacity.getValue(20));
        Мechanic<Car> rik = new Мechanic("Ken", "Norton", "BMW");
        Sponsor bmw = new Sponsor("BMW", 3000_0000);
        DriverB<Car> ken = new DriverB<>("ken", true, 3, "B");*/

        System.out.println("ДЗ-1");

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


        System.out.println("ДЗ-2");

        Recipe recipeOne = new Recipe(products, "салат");
        Recipe recipeTwo = new Recipe(products, "винигрет");
        Set<Recipe> Recipes = new HashSet<>();

        System.out.println(RecipeMethod.calculatesSumPrices(recipeOne));

        try {
            RecipeMethod.addRecipe(Recipes, recipeTwo);
        } catch (RecipeMethodException e) {
            e.printStackTrace();
        }


        System.out.println(Recipes.size());

    }

}