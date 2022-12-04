package animals;
import java.util.Objects;

import static validate.ValidateMethods.validateString;

public abstract class Bird extends Animal{
    private final String typeArea;
    public Bird(String name, int age, String livingEnvironment,String typeArea) {
        super(name, age, livingEnvironment);
        this.typeArea = validateString(typeArea,"tropics");
    }

    public String getTypeArea() {
        return typeArea;
    }

    @Override
    public String toString () {
        return "Bird{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnviroment= '" + getLivingEnvironment() + '\'' +
                ", typeArea= '" + getTypeArea() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Bird animal = (Bird) o;
        return getAge() == animal.getAge() && Objects.equals(getName() ,animal.getName()) && Objects.equals(getLivingEnvironment() ,  animal.getLivingEnvironment() );
    }

    @Override
    public int hashCode() {return Objects.hash(getName() ,getAge() ,getLivingEnvironment());}

    abstract public void hunting();
}
