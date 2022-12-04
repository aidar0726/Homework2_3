package animals;

public class TestAnimal {
    public static void main(String[] args) {
        Herbivore rabbit = new Herbivore("rabbit",5,"forest",50, "grass");
        Herbivore wolf = new Herbivore("Wolf",5,"forest",50, "meat");

        Herbivore elephant = new Herbivore("elephant", 2,"tropics", 55,"grass");
        Predator tiger = new Predator("Tiger",4,"tropics",75,"meat");
        Amphibians  snake = new Amphibians("Snake",4,"tropics");


        rabbit.eat();
        tiger.hunting();

        System.out.println(wolf.equals(rabbit));
        System.out.println(snake.toString());
    }
}
