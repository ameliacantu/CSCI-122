import java.util.Scanner;

class Pizza {
    private String[] toppings;
    private double price;

    public Pizza(String[] toppings, int numToppings) {
        this.toppings = new String[numToppings];
        for (int i = 0; i < numToppings; i++) {
            this.toppings[i] = toppings[i];
        }
        this.price = 14 + (numToppings * 2);
    }

    public String toString() {
        String description = "Pizza with ";
        for (int i = 0; i < toppings.length; i++) {
            if (toppings[i] != null) {
                description += toppings[i];
                if (i < toppings.length - 1 && toppings[i + 1] != null) {
                    description += ", ";
                }
            }
        }
        description += ". Price: $" + price;
        return description;
    }
}

class DeliveryPizza extends Pizza {
    private double deliveryFee;
    private String deliveryAddress;

    public DeliveryPizza(String[] toppings, String deliveryAddress, int numToppings) {
        super(toppings, numToppings);
        if (super.toString().contains("Price: $")) {
            double price = Double.parseDouble(super.toString().substring(super.toString().indexOf("$") + 1));
            this.deliveryFee = price > 18 ? 3 : 5;
        }
        this.deliveryAddress = deliveryAddress;
    }

    public String toString() {
        return super.toString() + ". Delivery Fee: $" + deliveryFee + ". Delivery Address: " + deliveryAddress;
    }
}

public class DemoPizza {
    public static final String QUIT = "QUIT";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] toppings = new String[10];
        int numToppings = 0;

        System.out.println("Enter toppings for the pizza (up to 10) or type QUIT to stop:");
        while (numToppings < 10) {
            System.out.print("Enter topping #" + (numToppings + 1) + ": ");
            String topping = scanner.nextLine();
            if (topping.equalsIgnoreCase(QUIT)) {
                break;
            }
            toppings[numToppings++] = topping;
        }

        System.out.print("Do you want the pizza to be delivered? (yes/no): ");
        String deliveryChoice = scanner.nextLine();
        if (deliveryChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter delivery address: ");
            String deliveryAddress = scanner.nextLine();
            DeliveryPizza pizza = new DeliveryPizza(toppings, deliveryAddress, numToppings);
            System.out.println("\nPizza Details:\n" + pizza);
        } else {
            Pizza pizza = new Pizza(toppings, numToppings);
            System.out.println("\nPizza Details:\n" + pizza);
        }

        scanner.close();
    }
}
