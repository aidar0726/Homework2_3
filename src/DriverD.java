public class DriverD<T extends Bus> extends Driver{
    public DriverD(String name, Boolean hasLicense, Integer experience,String category) {
        super(name, hasLicense, experience,category);
    }

    @Override
    public String start() {return "Car has started";}

    @Override
    public String stop() {return "Car has stopped";}

    @Override
    public String refuel() {return "Car is charging with petrol";}

    public String getCarMessage (Bus bus) {
        return "Driver " + getName() + " is driving car " + bus.getBrand() + " " + bus.getModel() + " will participate in race";
    }
}
