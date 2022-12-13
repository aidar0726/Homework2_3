import static validate.ValidateMethods.*;

public abstract class Driver {
    private final String name;
    private final Boolean hasLicense;
    private final Integer experience;

    private String category;

    public Driver(String name, Boolean hasLicense, Integer experience, String category) {
        this.name = validateString(name,"no name");
        this.hasLicense = validateBoolean(hasLicense);
        this.experience = validateInteger(experience,1);
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Boolean getHasLicense() {
        return hasLicense;
    }

    public Integer getExperience() {
        return experience;
    }

    abstract String start();
    abstract String stop();
    abstract String refuel();
}
