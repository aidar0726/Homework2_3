import static validate.ValidateMethods.validateString;
public abstract class Transport {
    private  final String brand;
    private  final String model;
    private  final int year;
    private  final String country;
    private  String color;
    private int maxSpeed;
    private double fuelPercentag;

    private String fuel;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed,double fuelPercentag,String fuel) {
        this.brand = validateCarParametrs(brand);
        this.model = validateCarParametrs(model);
        this.year = validateYear(year);
        this.country = validateCountry(country);
        this.color = validateColor(color);
        this.maxSpeed = maxSpeed;
        this.fuelPercentag = validateFuelPercentag(fuelPercentag, 10.0);
        this.fuel = validateString(fuel,"petrol");
    }

    public abstract void refill();

    // region getters-setters
    public String getBrand() {
        return brand;
    }

    public String getFuel() {
        return fuel;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuelPercentag() {
        return fuelPercentag;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setFuelPercentag(double fuelPercentag) {
        this.fuelPercentag = validateFuelPercentag(fuelPercentag, 10.0);
    }

    //endregion getters-setters

    //region validation
    public static int validateYear (int value) {return value <= 1900 ? 2000 : value;}
    public static String validateCarParametrs(String value) {return value == null ? "default" : value;}
    public static String validateColor(String value) {return validateString(value,"белый");}
    public static String validateTransmission(String value) {return validateString( value,"автомат");}
    public static String validateCountry(String value) {return validateString( value,"Rus");}

    public static double validateFuelPercentag(double value, double substitution) {
        return ( value <= 0.00 || value > 100.00) ? substitution : value;
    }
    //endregion

    @Override
    public String toString() {
        return "Car {" +
                "brand='" + brand + '\''+
                ", model='" + model + '\''+
                ", maxSpeed=" + maxSpeed +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
