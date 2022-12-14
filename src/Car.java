import java.util.Objects;
import java.util.regex.Pattern;
import static validate.ValidateMethods.validateString;

public class Car extends Transport implements Competing{

    private  Integer pitStopTime;
    private final Integer maxSpeed;
    private  Integer bestLapTime;

    BodyType bodyType;


    public Car(String brand, String model, double enginePower,Integer pitStopTime,Integer maxSpeed,Integer bestLapTime,BodyType bodyType) {
        super(brand,model,enginePower);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.bodyType = bodyType;
    }


    public BodyType getBodyType() {
        return bodyType;
    }

    public void setSedan(BodyType sedan) {
        this.bodyType = sedan;
    }



    @Override
    public void printType() {
        System.out.println(getBodyType());
    }


    @Override
    public boolean passDiagnostics() {
        return true;
    };


    @Override
    void startToMove() {System.out.println("Car started");}

    @Override
    void finish() {System.out.println("Car finished");}

    @Override
    public void getPitStop() {System.out.println("pit-stop time is " + pitStopTime);}

    @Override
    public void getBestLapTime() {System.out.println("best lap time is " + bestLapTime);}

    @Override
    public void getMaxSpeed() {System.out.println("max speed is " + maxSpeed);}

    @Override
    public String toString() {
        return "Car {" +
                "brand='" + getBrand() + '\''+
                ", model='" + getModel() + '\''+
                ", enginePower=" + getEnginePower() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getBrand() == car.getBrand() && Objects.equals(getEnginePower() ,car.getEnginePower()) && Objects.equals(getModel() ,  car.getModel() );
    }

    @Override
    public int hashCode() {return Objects.hash(getBrand() ,getEnginePower() ,getModel());}

}
