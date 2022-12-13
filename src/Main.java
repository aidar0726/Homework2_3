import java.rmi.RemoteException;

public class Main {
    public static void main(String[] args) {
    Car mersedesAmg = new Car ("Mersedes", "C200", 3,2,200,60,BodyType.CROSSOVER );
    Truck shahman = new Truck ("Mersedes", "Shahman", 15,2,180,60,LoadCapacity.getValue(20));

    DriverB<Car> ken = new DriverB<>("ken",true,3,"B");
    DriverC<Truck> ivan = new DriverC<>("Ivan",true,3,"");
    checkTransport(mersedesAmg,shahman);
    checkCategory(ken,ivan);

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