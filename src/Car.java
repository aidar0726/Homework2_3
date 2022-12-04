import java.util.Objects;
import java.util.regex.Pattern;
import static validate.ValidateMethods.validateString;

public class Car extends Transport {

    private String transmission;
    private String number;
    private int seatCount;
    private boolean isSummerRubber;
    private double enginePower;


    public Car(
            String brand,
            String model,
            int year,
            String country,
            String color,
            int maxSpeed,

            double enginePower,
            String transmission,
            String number,
            int seatCount,
            double fuelPercentag,
            String fuel) {
        super(brand,model,year,country,color,maxSpeed,fuelPercentag,fuel);
        this.enginePower = validateEngine(enginePower);
        this.transmission = validateTransmission(transmission);
        this.number = validateCarNumber(number);
        this.seatCount = validateSeatCount(seatCount);

    }

    //region getters/setters

    public String getTransmission() {
        return transmission;
    }

    public String getNumber() {
        return number;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public boolean isSummerRubber() {
        return isSummerRubber;
    }

    public double getEnginePower() {
        return enginePower;
    }

    //endregion

    @Override
    public void refill() {
        setFuelPercentag(100);
        System.out.println(getFuel());
    }

    //region validation
    public String validateCarNumber (String number) {
        if(Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}",number)) {
            return number;
        } else {
            System.out.println("Номер некорректный");
            return "неверный номер";
        }
    }

    public int validateSeatCount (int seatCount) {return seatCount <= 0 ? 4 : seatCount;}
    public static String validateCountry(String value) {return validateString( value,"Rus");}
    public static double validateEngine(double value) {return value <= 0 ? 1.5 : value;}
    public static String validateTransmission(String value) {return validateString( value,"автомат") ;}

    //endregion

    @Override
    public String toString() {
        return "Car {" +
                "brand='" + getBrand() + '\''+
                ", model='" + getModel() + '\''+
                ", maxSpeed=" + getMaxSpeed() +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", color='" + getColor() + '\'' +
                ", enginePower=" + enginePower +
                ", transmission=" + transmission +
                ", number='" + number + '\'' +
                ", seatCount='" + seatCount + '\'' +
                ", fuel='" + getFuel() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getBrand() == car.getBrand() && Objects.equals(getYear() ,car.getYear()) && Objects.equals(getModel() ,  car.getModel() );
    }

    @Override
    public int hashCode() {return Objects.hash(getBrand() ,getYear() ,getModel());}

}
