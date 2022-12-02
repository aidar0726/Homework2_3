package animals;
import static validate.ValidateMethods.validateString;

public abstract class Bird extends Animal{
    private final String typeArea;
    public Bird(String name, int age, String livingEnvironment,String typeArea) {
        super(name, age, livingEnvironment);
        this.typeArea = validateString(typeArea,"tropics");
    }

    public String getTypeArea() {
        return typeArea;
    }

    abstract public void hunting();
}
