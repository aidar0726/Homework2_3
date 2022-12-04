package animals;

import java.util.Objects;

import static validate.ValidateMethods.validateString;
import static validate.ValidateMethods.validateInteger;

public abstract class Mammal extends Animal{
    private final int movementSpeed;
    private String food;

    public Mammal(String name, int age, String livingEnvironment, int movementSpeed, String food) {
        super(name, age, livingEnvironment);
        this.movementSpeed = validateInteger(movementSpeed, 1);
        this.food = validateString(food,"milk");
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = validateString(food,"any food");
    }

    public abstract void walk();

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Mammal animal = (Mammal) o;
        return getAge() == animal.getAge() && Objects.equals(getName() ,animal.getName()) && Objects.equals(getLivingEnvironment() ,  animal.getLivingEnvironment() );
    }

    @Override
    public int hashCode() {return Objects.hash(getName() ,getAge() ,getLivingEnvironment());}
}
