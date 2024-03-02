import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] firstNames = {"Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace", "Henry", "Ivy", "Jack"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the name you want to retrieve (0-9): ");

        try {
            int index = scanner.nextInt();
            System.out.println("The name at index " + index + " is: " + firstNames[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of range. Please enter a number between 0 and 9.");
        }
    }
}
