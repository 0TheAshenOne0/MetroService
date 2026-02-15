import java.time.LocalTime;

public class Metro {
    double price;
    String name;
    boolean availability;

    public Metro(double ticketPrice, String trainName, boolean isAvailable)
    {
        price = ticketPrice;
        name = trainName;
        availability = isAvailable;

    }
    static public boolean late()
    {
        return LocalTime.parse("23:00:00").isBefore(LocalTime.now());



    }

}
