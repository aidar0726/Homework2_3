public class Main {
    public static void main(String[] args) {

        Train martin = new Train(
                "Martin",
                "B-901",
                2011,
                "Russia",
                null,
                null,
                "Беларусский вокзал",
                "Минск-Пассажирский",
                11,
                301,
                50,
                "diesel");
        martin.refill();

        Bus ikarus = new Bus (
                "Gaz",
                "Ikarus",
                1985, "USSR",
                "желтый",
                100,
                21.33,
                "petrol");

        ikarus.refill();
    }

}