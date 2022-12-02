public class Bus extends Transport{
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed,double fuelPercentag,String fuel) {
        super(brand,model,year,country,color,maxSpeed,fuelPercentag,fuel);
    }

    @Override
    public void refill() {
        setFuelPercentag(100);
        System.out.println(getFuel());
    }

    @Override
    public String toString() {
        return "Car {" +
                "brand='" + getBrand() + '\''+
                ", model='" + getModel() + '\''+
                ", maxSpeed=" + getMaxSpeed() +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", color='" + getColor() + '\'' +
                ", fuelPercentag= " + getFuelPercentag() +
                ", fuel='" + getFuel() + '\'' +
                '}';
    }
}
