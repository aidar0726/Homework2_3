package animals;

import java.util.Objects;

public final class Amphibians extends Animal {

    public Amphibians(String name, int age, String livingEnviroment) {
        super(name,age,livingEnviroment);
    }

    @Override
    public void eat() {System.out.println("Питается насекомыми");}

    @Override
    public void sleep() {System.out.println("Спит в воде");}

    @Override
    public void go() {System.out.println("Перемещается по воде и суше");}

    public void hunting() {System.out.println("Охотится на насекомых");}

    @Override
    public String toString () {
        return "Amphibians{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnviroment= '" + getLivingEnvironment() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Amphibians animal = (Amphibians) o;
        return getAge() == animal.getAge() && Objects.equals(getName() ,animal.getName()) && Objects.equals(getLivingEnvironment() ,  animal.getLivingEnvironment() );
    }

    @Override
    public int hashCode() {return Objects.hash(getName() ,getAge() ,getLivingEnvironment());}

}

