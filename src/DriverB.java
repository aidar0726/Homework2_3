public class DriverB <T extends Car> extends Driver {
    public DriverB(String name, Boolean hasLicense, Integer experience,String category) {
        super(name, hasLicense, experience,category);
    }

    @Override
    public String start() {return "Car has started";}

    @Override
    public String stop() {return "Car has stopped";}

    @Override
    public String refuel() {return "Car is charging with petrol";}

    public String getCarMessage (Car car) {
        return "Driver " + getName() + " is driving car " + car.getBrand() + " " + car.getModel() + " will participate in race";
    }
}
