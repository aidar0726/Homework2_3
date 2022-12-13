public class DriverC<T extends Truck> extends Driver{
    public DriverC(String name, Boolean hasLicense, Integer experience,String category) {
        super(name, hasLicense, experience,category);
    }

    @Override
    public String start() {return "Car has started";}

    @Override
    public String stop() {return "Car has stopped";}

    @Override
    public String refuel() {return "Car is charging with petrol";}

    public String getCarMessage (Truck truck) {
        return "Driver " + getName() + " is driving car " + truck.getBrand() + " " + truck.getModel() + " will participate in race";
    }
}