import java.rmi.RemoteException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Car mersedesAmg = new Car ("Mersedes", "C200", 3,2,200,60,BodyType.CROSSOVER );
    Bus ikarus = new Bus ("Ikarus", "F200", 9,2,200,60,Size.S );
    Truck shahman = new Truck ("Mersedes", "Shahman", 15,2,180,60,LoadCapacity.getValue(20));

    Мechanic<Car> rik = new Мechanic("Ken","Norton","BMW");
    Sponsor bmw = new Sponsor("BMW",3000_0000);
    Sponsor audi = new Sponsor("AUDI",3000_0000);
    DriverB<Car> ken = new DriverB<>("ken",true,3,"B");

    DriverC<Truck> ivan = new DriverC<>("Ivan",true,3,"");

    ArrayList<Transport> cars = new ArrayList<Transport>();

    mersedesAmg.addDriver(ken);
    mersedesAmg.addSponsor(bmw,audi);
    mersedesAmg.addМechanic(rik);

    vehicleInformation(mersedesAmg);

    ServiceStation.addsCarQueue(ikarus);
    ServiceStation.deleteCarQueue(mersedesAmg);
    ServiceStation.deleteCarQueue(mersedesAmg);
    ServiceStation.deleteCarQueue(mersedesAmg);

        addPersonQueue("Ken");
        addPersonQueue("Rick");

    }

    public static void addPersonQueue(String person) {
         Deque<String> queue1 = new ArrayDeque<>(5);
         Deque<String> queue2 = new ArrayDeque<>(5);

        queue1.add("KEN");
        queue1.add("KEN");
        queue1.add("KEN");
        queue1.add("KEN");
        queue1.add("KEN");
        queue1.add("KEN");
        System.out.println(queue1.size());
        System.out.println(queue1);
    }

    public static void vehicleInformation(Transport transport) {
        System.out.println( transport.getModel() + " " +
                            transport.getDrivers() + " " +
                            transport.getMechanics() + " " +
                            transport.getSponsors());
    }

    public static void checkTransport(Transport...transports) {
        int count = 0;
        for(Transport transport: transports) {
            if(!transport.passDiagnostics()) {
                try {
                    throw new RuntimeException(transport.getBrand() + " " + transport.getModel() + " не прошел диагностику!");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                count++;
            }
        }

        System.out.println("Диагностику прошли" + count + " из" + transports.length + " автомобилей");

    }

    public static void checkCategory(Driver...drivers) {
        int count = 0;
        for(Driver driver: drivers) {
            if(driver.getCategory() == null || driver.getCategory().isEmpty()) {
                try {
                    throw new RuntimeException(driver.getName()  + " нет прав");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                count++;
            }
        }

        System.out.println("Прошли на права" + count + " из" + drivers.length + " водителей");

    }

}