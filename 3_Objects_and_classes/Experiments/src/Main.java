import com.skillbox.airport.Airport;

public class Main {

    public static void main(String[] args)
    {
        Airport yakutsk = Airport.getInstance();
        System.out.println("--------------================--------------");
        System.out.println(yakutsk.getAllAircrafts());
        System.out.println("--------------================--------------");
        System.out.println("Всего самолетов: " + yakutsk.getAllAircrafts().size() + " шт.");
        System.out.println("--------------================--------------");
    }
}
