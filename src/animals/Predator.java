package animals;

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

}
