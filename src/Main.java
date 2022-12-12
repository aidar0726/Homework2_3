public class Main {
    public static void main(String[] args) {
    Car mersedesAmg = new Car ("Mersedes", "C200", 3,2,200,60,BodyType.CROSSOVER );
    Truck shahman = new Truck ("Mersedes", "Shahman", 15,2,180,60,LoadCapacity.getValue(20));

    mersedesAmg.printType();

    }

}