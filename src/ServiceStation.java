import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    static Queue<Transport> queueCar = new LinkedList<Transport>();

    public static void addsCarQueue (Transport transport) {
        System.out.println(transport.getClass());

        if(transport instanceof Bus) {
            System.out.println("Автобусы не проходят диагностику!");
        } else {
            queueCar.offer(transport);
            System.out.println(transport.getModel() + " Успешно добавлен на диагностику");
        }
    }


    public static void deleteCarQueue (Transport transport) {
        queueCar.remove(transport);
        System.out.println(queueCar);
    }


}
