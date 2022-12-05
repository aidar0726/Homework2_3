package animals;

import java.util.Objects;

public class NotFlying extends Bird{
    public NotFlying(String name, int age, String livingEnvironment, String typeArea) {
        super(name, age, livingEnvironment, typeArea);
    }

    public void walk() {System.out.println("Ходит пешком");}

    @Override
    public void eat() {System.out.println("Питается червечками");}

    @Override
    public void sleep() {System.out.println("Спит в гнезде");}

    @Override
    public void go() {System.out.println("Перемещается по суше");}

    @Override
    public void hunting() {System.out.println("Охотится на насекомых");}

    @Override
    public String toString () {
        return "NotFlying{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnviroment=" + getLivingEnvironment() + '\'' +
                ", typeArea=" + getTypeArea() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        NotFlying animal = (NotFlying) o;
        return getAge() == animal.getAge() && Objects.equals(getName() ,animal.getName()) && Objects.equals(getLivingEnvironment() ,  animal.getLivingEnvironment() );
    }

    @Override
    public int hashCode() {return Objects.hash(getName() ,getAge() ,getLivingEnvironment());}
}
