import validate.ValidateMethods;

import java.util.Objects;

import static validate.ValidateMethods.*;

public class Train extends Transport{
    private Integer travelTime;
    private String departure;
    private String destination;
    private Integer wagonsCount;

    public Train (String brand,
                  String model,
                  Integer year,
                  String country,
                  String color,
                  Integer travelTime,
                  String departure,
                  String destination,
                  Integer wagonsCount,
                  Integer maxSpeed,
                  double fuelPercentag,
                  String fuel) {
        super(brand,model,year,country,color,maxSpeed,fuelPercentag,fuel);

        this.travelTime = ValidateMethods.validateInteger(travelTime, 60);
        this.departure = validateString(departure, "any station");
        this.destination = validateString(destination , "any station");
        this.wagonsCount = validateInteger(wagonsCount, 2);
    }

    //region getters/setters

    public Integer getTravelTime() {
        return travelTime;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public Integer getWagonsCount() {
        return wagonsCount;
    }

    public void setTravelTime(Integer travelTime) {
        this.travelTime = travelTime;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setWagonsCount(Integer wagonsCount) {
        this.wagonsCount = wagonsCount;
    }

    //endregion

    @Override
    public void refill() {
        setFuelPercentag(100);
        System.out.println(getFuel());
    }

    @Override
    public String toString() {
        return "Train {" +
                "travelTime='" + travelTime  +
                ", departure='" + departure + '\''+
                ", destination='" + destination  + '\''+
                ", wagonsCount=" + wagonsCount +
                ", brand=" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year= " + getYear() +
                ", country='" + getCountry() + '\'' +
                ", color='" + getColor() + '\'' +
                ", maxSpeed= " + getMaxSpeed() +
                ", fuelPercentag= " + getFuelPercentag() +
                ", fuel='" + getFuel() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Train car = (Train) o;
        return getBrand() == car.getBrand() && Objects.equals(getYear() ,car.getYear()) && Objects.equals(getModel() ,  car.getModel() );
    }

    @Override
    public int hashCode() {return Objects.hash(getBrand() ,getYear() ,getModel());}

}
