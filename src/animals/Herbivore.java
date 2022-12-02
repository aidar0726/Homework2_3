package animals;

public class Herbivore extends Mammal{
    public Herbivore(String name, int age, String livingEnvironment, int movementSpeed, String food) {
        super(name, age, livingEnvironment, movementSpeed, food);
    }

    @Override
    public void eat() {System.out.println("Кушает: " + getFood());}

    @Override
    public void sleep() {System.out.println("Спит на земле.");}

    @Override
    public void go() {System.out.println("Перемещается по земле");}

    @Override
    public void walk() {System.out.println("Гуляет");}

    public void pastiche() {System.out.println("Пасется");}

    @Override
    public String toString () {
        return "Herbivore{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", livingEnviroment=" + getLivingEnvironment() + '\'' +
                ", movementSpeed=" + getMovementSpeed() +
                ", food=" + getFood() + '\'' +
                '}';
    }
}
