package animals;
import java.util.Objects;

import static validate.ValidateMethods.validateString;
import static validate.ValidateMethods.validateInteger;

public abstract class Animal {
    private String name;
    private int age;
    private String livingEnvironment;

    public Animal(String name, int age, String livingEnvironment) {
        this.name = validateString(name,"any name");
        this.age = validateInteger(age,1);
        this.livingEnvironment = livingEnvironment;
    }

    //region getters/setters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    //end region

    public abstract void eat();
    public abstract void go();
    public abstract void sleep();

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name,animal.name) && Objects.equals(livingEnvironment, animal.livingEnvironment);
    }

    @Override
    public int hashCode() {return Objects.hash(name,age,livingEnvironment);}


    @Override
    public String toString () {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnviroment= '" + getLivingEnvironment() + '\'' +
                '}';
    }
}


