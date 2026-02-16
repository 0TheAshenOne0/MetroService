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

    public boolean isAvailable()
     {
         return availability;
     }

    public double calculateTotalCost(int adults, int minors)
    {
        return  price * adults + (price * minors / 2);
    }

     public void processBooking()
    {
        if (!isAvailable())
        {
            System.out.println("It's too late! The metro is closed!");
            return;
        }
        int minors = 0;
        IO.println("Welcome to the London underground metro service! How many passengers shall be boarding?");
        int passengers = scanner.nextInt();
        int[] ages = new int[passengers];
        for (int i = 0; i < passengers; i++) {
            IO.println("Age person " + (i + 1) + ":");
            ages[i] = scanner.nextInt();
            if (ages[i] < 18)
            {
                minors++;
            }
        }

        int adults = passengers - minors;
        double totalCost = calculateTotalCost(adults, minors);

        displayBooking(adults, minors, totalCost);

    }
    private void displayBooking(int adults, int minors, double totalCost )
    {
        System.out.println("-------Booking summary---------");
        System.out.println("Train: " + name);
        System.out.println("Adults: " + adults);
        System.out.println("Minors: " + minors);
        System.out.println("Total Cost " + totalCost + "$");
    }

}
