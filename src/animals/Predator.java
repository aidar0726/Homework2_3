package animals;

import java.util.Objects;

public class Predator extends Mammal {
    public Predator(String name, int age, String livingEnvironment, int movementSpeed, String food) {
        super(name, age, livingEnvironment, movementSpeed, food);
    }

    @Override
    public void walk() {System.out.println("Редко гуляет");}

    @Override
    public void eat() {System.out.println("Кушает: " + getFood());}

    @Override
    public void sleep() {System.out.println("Спит в берлоге.");}

    @Override
    public void go() {System.out.println("Перемещается быстро");}

    public void hunting() {System.out.println("Охотится на других животных");}

    @Override
    public String toString () {
        return "Predator{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnviroment=" + getLivingEnvironment() + '\'' +
                ", movementSpeed=" + getMovementSpeed() +
                ", food=" + getFood() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Predator animal = (Predator) o;
        return getAge() == animal.getAge() && Objects.equals(getName() ,animal.getName()) && Objects.equals(getLivingEnvironment() ,  animal.getLivingEnvironment() );
    }

    @Override
    public int hashCode() {return Objects.hash(getName() ,getAge() ,getLivingEnvironment());}

}
