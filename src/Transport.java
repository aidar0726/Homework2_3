import animals.Bird;

import java.util.Objects;

import static validate.ValidateMethods.validateString;
public abstract class Transport {
    private  final String brand;
    private  final String model;
    private double enginePower;


    public Transport(String brand, String model, double enginePower) {
        this.brand = validateCarParametrs(brand);
        this.model = validateCarParametrs(model);
        this.enginePower = validateEnginePower(enginePower,1.5);
    }

    // region getters-setters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEnginePower() {
        return enginePower;
    }


    //region validation
    public static String validateCarParametrs(String value) {return value == null ? "default" : value;}
    public static String validateTransmission(String value) {return validateString( value,"автомат");}

    public static double validateEnginePower(double value, double substitution) {
        return ( value <= 0.5 || value > 10.00) ? substitution : value;
    }
    //endregion

    abstract void startToMove();
    abstract void finish();


    @Override
    public String toString() {
        return "Transport {" +
                "brand='" + brand + '\''+
                ", model='" + model + '\''+
                ", enginePower=" + enginePower +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Transport car = (Transport) o;
        return getBrand() == car.getBrand() && Objects.equals(getEnginePower() ,car.getEnginePower()) && Objects.equals(getModel() ,  car.getModel() );
    }

    @Override
    public int hashCode() {return Objects.hash(getBrand() ,getEnginePower() ,getModel());}
}
