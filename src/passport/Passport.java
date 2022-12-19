package passport;

public class Passport {

    private Integer number;
    private String surname;
    private String fatherland;
    private Integer DateBirth;

    public Passport(Integer number, String surname, String fatherland, Integer dateBirth) {
        this.number = number;
        this.surname = surname;
        this.fatherland = fatherland;
        DateBirth = dateBirth;
    }

    public Integer getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public String getFatherland() {
        return fatherland;
    }

    public Integer getDateBirth() {
        return DateBirth;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFatherland(String fatherland) {
        this.fatherland = fatherland;
    }

    public void setDateBirth(Integer dateBirth) {
        DateBirth = dateBirth;
    }

    public String toString() {
        return "Passport {" +
                "number=" + getNumber() +
                ", surname='" + getSurname() + '\''+
                ", fatherland='" + getFatherland() + '\'' +
                ", DateBirth=" + getDateBirth() +
                '}';
    }

}
