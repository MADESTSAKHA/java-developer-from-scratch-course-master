import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import static java.awt.AlphaComposite.getInstance;

public class Main {

    public static void main(String[] args)
    {
        Airport yakutsk = Airport.getInstance();
        System.out.println("--------------================--------------");
        System.out.println(yakutsk.getAllAircrafts());
        System.out.println("--------------================--------------");
        System.out.println("--------------================--------------");
    }
}
