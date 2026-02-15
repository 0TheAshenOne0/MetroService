import java.time.LocalTime;
import java.util.Scanner;

 class Metro {
    double price;
    String name;
    boolean availability;
     Scanner scanner = new Scanner(System.in);


    public Metro(double ticketPrice, String trainName, boolean isAvailable)
    {
        price = ticketPrice;
        name = trainName;
        availability = isAvailable;

    }
    static public boolean late()
    {
        return LocalTime.parse("21:00:00").isBefore(LocalTime.now());

    }
     public void processor()
    {
        if (!availability)
        {
            System.out.println("It's too late! The metro is closed!");
            return;
        }
        int minors = 0;
        IO.println("Welcome to the London underground metro service! How many passengers shall be boarding?");
        int members = scanner.nextInt();
        int[] ages = new int[members];
        for (int i = 0; i < members; i++) {
            IO.println("Age person " + (i + 1) + ":");
            ages[i] = scanner.nextInt();
            if (ages[i] < 18)
            {
                minors++;

            }

        }

        int adultTickets = members - minors;
        double totalCost = price * adultTickets + (price * minors / 2);
        System.out.println("Adults: " + adultTickets);
        System.out.println("Minors: " + minors);
        System.out.println("Train: " + name + "\nAvailability Status: " + availability + "\nTotal Cost: " + totalCost + "$") ;


    }

}
