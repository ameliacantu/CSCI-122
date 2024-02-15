import java.util.Scanner;

public class BigYStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to BigY Pizza Store!");
        System.out.println("Choose your pizza size:");
        System.out.println("1. Small ($5)");
        System.out.println("2. Medium ($10)");
        System.out.println("3. Large ($15)");
        System.out.println("4. Super ($20)");

        int choice = scanner.nextInt();
        double basePrice = 0;
        double toppingPrice = 0;

        switch (choice) {
            case 1:
                basePrice = 5;
                break;
            case 2:
                basePrice = 10;
                break;
            case 3:
                basePrice = 15;
                break;
            case 4:
                basePrice = 20;
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
        }

        System.out.println("Choose your toppings (Max 3, no additional charge for extra cheese):");
        System.out.println("1. Pepperoni");
        System.out.println("2. Mushrooms");
        System.out.println("3. Onions");
        System.out.println("4. Sausage");
        System.out.println("5. Bacon");
        System.out.println("6. Extra Cheese");

        int toppingChoice = scanner.nextInt();
        int numberOfToppings = 0;
        boolean extraCheese = false;

        while (toppingChoice != 0 && numberOfToppings < 3) {
            numberOfToppings++;
            if (toppingChoice == 6) {
                extraCheese = true;
            } else {
                toppingPrice += 0.5;
            }
            if (numberOfToppings == 2) {
                toppingPrice -= 0.5; // Apply discount for the second topping
            } else if (numberOfToppings == 3) {
                toppingPrice += 0.75; // Additional charge for the third topping
            }
            System.out.println("Topping added!");
            System.out.println("Add another topping (0 to finish):");
            toppingChoice = scanner.nextInt();
        }

        double totalPrice = basePrice + toppingPrice;
        System.out.println("Your order:");
        System.out.println("Pizza Size: $" + basePrice);
        System.out.println("Topping Cost: $" + toppingPrice);
        if (extraCheese) {
            System.out.println("Extra Cheese: Free!");
        }
        System.out.println("Total Cost: $" + totalPrice);
        System.out.println("Thank you for choosing BigY Pizza Store!");
    }
}