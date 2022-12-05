public class Main {
    public static void main(String[] args) {
    Car MersedesAmg = new Car ("Mersedes", "C200", 3,2,200,60);
    System.out.println(MersedesAmg.toString());
    MersedesAmg.getBestLapTime();



    DriverB kenNorton = new DriverB<>("Ken",true,5);
        System.out.println(kenNorton.getCarMessage(MersedesAmg));

    }

}