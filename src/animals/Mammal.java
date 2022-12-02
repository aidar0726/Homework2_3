package animals;

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
}
