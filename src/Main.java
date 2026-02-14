Scanner scanner = new Scanner(System.in);

Metro london = new Metro(5, "TheTube", true);

void main() {
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
    double totalCost = london.price * adultTickets + (london.price * minors / 2);
    System.out.println("Adults: " + adultTickets);
    System.out.println("Minors: " + minors);
    System.out.println("Train: " + london.name + "\nAvailability Status: " + london.availability + "\nTotal Cost: " + totalCost + "$");



}