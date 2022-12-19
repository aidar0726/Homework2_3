
import passport.Passport;
import passport.PassportMethod;
import product.*;

import java.rmi.RemoteException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

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


        System.out.print("ДЗ2-1");

        Recipe recipeOne = new Recipe(products, "салат");
        Recipe recipeTwo = new Recipe(products, "винигрет");
        Set<Recipe> Recipes = new HashSet<>();

        System.out.println(RecipeMethod.calculatesSumPrices(recipeOne));

        try {
            RecipeMethod.addRecipe(Recipes, recipeTwo);
        } catch (RecipeMethodException e) {
            e.printStackTrace();
        }


        System.out.println("ДЗ2-2");
        Set<Integer> numbers = new HashSet<>();

        System.out.println(fillsRandomNumbers(numbers));
        System.out.println(removeEvenNumbers(numbers));

        System.out.println("ДЗ3-1");
        /* я так понял в этом задании нужно просто создать set из водителей, спонсоров и тд*/
        Car mersedesAmg = new Car("Mersedes", "C200", 3, 2, 200, 60, BodyType.CROSSOVER);
        Bus ikarus = new Bus("Ikarus", "F200", 9, 2, 200, 60, Size.S);
        Truck shahman = new Truck("Mersedes", "Shahman", 15, 2, 180, 60, LoadCapacity.getValue(20));
        Мechanic<Car> rik = new Мechanic("Ken", "Norton", "BMW");
        Sponsor bmw = new Sponsor("BMW", 3000_0000);
        DriverB<Car> ken = new DriverB<>("ken", true, 3, "B");

        Set<Sponsor> sponsors = new HashSet<>();
        Set<Driver> drivers = new HashSet<>();
        Set<Мechanic<Car>> mechanics = new HashSet<>();
        sponsors.add(bmw);
        System.out.println(sponsors);


        System.out.println("ДЗ3-2");
        System.out.println(createsUniqueExamples());

        System.out.println("ДЗ3-3");
        Passport andy = new Passport(989,"Kovalski","Popovich",2003);
        Passport kim = new Passport(900,"Chen","Ir",1942);
        Set<Passport> passports = new HashSet<>();
        passports.add(kim);

        PassportMethod.addPassport(kim,passports);
        PassportMethod.addPassport(andy,passports);
        System.out.println(passports.size());

        System.out.println(PassportMethod.returnsPassport(800,passports));
        System.out.println(passports);

        System.out.println("ДЗ3-4");
        /*я считаю что коллекции ArrayList потребуется меньше времени на выполнении данного метода, так как
        здесь здесь происходит поиск,а ArrayList основан на маасивах, поиск происходит по индексам.
         */
    }

    public static Set<Integer> fillsRandomNumbers(Set<Integer> numbers) {

        for (int i = 0; i < 20; i++) {
            numbers.add((int) (Math.random() * 1000));
        }

        return numbers;
    }

    public static Set<Integer> removeEvenNumbers(Set<Integer> numbers) {
        /* не дает удалить idea (нельзя удалять элементы в перебираемом массиве) поэтому создал новый массив*/
        Set<Integer> evenNumbers = new HashSet<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        return evenNumbers;
    }

    public static Set<String> createsUniqueExamples() {
        Set<String> examples = new HashSet<>();
        Set<Integer> sum = new HashSet<>();
        int a;
        int b;

        while (examples.size() < 15) {
            a = (int) (Math.random() * 8) + 2;
            b = (int) (Math.random() * 8) + 2;

            if (!sum.contains(a * b)) {
                examples.add(a + " * " + b + " = \n");
            }
            sum.add(a * b);
        }

        return examples;
    }

}