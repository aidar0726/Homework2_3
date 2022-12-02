package animals;

public class TestAnimal {
    public static void main(String[] args) {
        Herbivore rabbit = new Herbivore("rabbit",5,"forest",50, "grass");
        Herbivore elephant = new Herbivore("elephant", 2,"tropics", 55,"grass");
        Predator tiger = new Predator("Tiger",4,"tropics",75,"meat");

        rabbit.eat();
        tiger.hunting();

        System.out.println(tiger.equals(rabbit));
        System.out.println(rabbit.toString());
    }
}
