public class Мechanic<T extends Transport> {
    private String name;
    private String lastName;
    private String company;

    public Мechanic(String name, String lastName, String company) {
        this.name = name;
        this.lastName = lastName;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public void мaintenance() {
        System.out.println("Провести техобслуживание");
    }

    public void carRepair() {
        System.out.println("Провести ремонт машины");
    }

    @Override
    public String toString() {
        return "Имя механика " + getName() + " Фамилия механика " + getLastName();
    }
}
