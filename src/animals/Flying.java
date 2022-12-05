package animals;

import java.util.Objects;

public class Flying extends Bird{
    public Flying(String name, int age, String livingEnvironment, String typeArea) {
        super(name, age, livingEnvironment, typeArea);
    }

    @Override
    public void hunting() {System.out.println("Охотится на мелких животных");}

    @Override
    public void eat() {System.out.println("Ест мелких животных");}

    @Override
    public void sleep() {System.out.println("Спит в гнезде");}

    @Override
    public void go() {System.out.println("Летает");}

    public void toFly() {System.out.println("Летающая птица");}

    @Override
    public String toString () {
        return "Flying{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnviroment=" + getLivingEnvironment() + '\'' +
                ", typeArea=" + getTypeArea() + '\'' +
                "}" + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Flying animal = (Flying) o;
        return getAge() == animal.getAge() && Objects.equals(getName() ,animal.getName()) && Objects.equals(getLivingEnvironment() ,  animal.getLivingEnvironment() );
    }

    @Override
    public int hashCode() {return Objects.hash(getName() ,getAge() ,getLivingEnvironment());}

}
