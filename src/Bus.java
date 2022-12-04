import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Bus car = (Bus) o;
        return getBrand() == car.getBrand() && Objects.equals(getYear() ,car.getYear()) && Objects.equals(getModel() ,  car.getModel() );
    }

    @Override
    public int hashCode() {return Objects.hash(getBrand() ,getYear() ,getModel());}
}
