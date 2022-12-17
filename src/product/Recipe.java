package product;

import java.util.Set;

public class Recipe {

    private Set<Product> convenienceFood;
    private Integer sumPrices;
    private String name;

    public Recipe(Set<Product> convenienceFood, String name) {
        this.convenienceFood = convenienceFood;
        this.name = name;
    }

    public Integer getSumPrices() {
        return sumPrices;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getConvenienceFood() {
        return convenienceFood;
    }


}
