import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount in dollars: ");
        double amount = scanner.nextDouble();

        // Convert the amount to cents
        int totalCents = (int) Math.round(amount * 100);

        // Calculate the number of quarters, dimes, and nickels
        int quarters = totalCents / 25;
        totalCents %= 25;

        int dimes = totalCents / 10;
        totalCents %= 10;

        int nickels = totalCents / 5;
        totalCents %= 5;

        int pennies = totalCents;

        // Display the result
        System.out.println("Your amount consists of:");
        System.out.println(quarters + " quarter(s)");
        System.out.println(dimes + " dime(s)");
        System.out.println(nickels + " nickel(s)");
        System.out.println(pennies + "penny(s)");
    }
}


// ask user to enter an amount
// output should be # of quarters, # of dimes, # of nickles, # cents
// if user enters $3.40, 13 quarters, 1 dime, 1 nickle,
// Quarters 340/25 = 13 340 % 25 = 15
// Nickels 15/10 = 1 15 % 10 = 5
// Dimes 5/5 = 1 5 % 5 = 0