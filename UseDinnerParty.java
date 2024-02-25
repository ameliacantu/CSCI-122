import java.util.Scanner;

public class UseDinnerParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating a Party object
        Party party = new Party();
        
        // Prompting user for the number of guests for the party
        System.out.print("Enter number of guests for the party >> ");
        int guests = scanner.nextInt();
        party.setNumberOfGuests(guests);
        
        // Displaying party information
        System.out.println("The party has " + party.getNumberOfGuests() + " guests");
        party.displayInvitation();
        
        // Creating a DinnerParty object
        DinnerParty dinnerParty = new DinnerParty();
        
        // Prompting user for the number of guests for the dinner party
        System.out.print("Enter number of guests for the dinner party >> ");
        int dinnerGuests = scanner.nextInt();
        dinnerParty.setNumberOfGuests(dinnerGuests);
        
        // Prompting user for the dinner menu choice
        System.out.print("Enter the menu option -- 1 for chicken or 2 for Vegi >> ");
        int menuOption = scanner.nextInt();
        dinnerParty.setDinnerChoice(menuOption);
        
        // Displaying dinner party information
        System.out.println("The dinner party has " + dinnerParty.getNumberOfGuests() + " guests");
        System.out.println("Menu option " + dinnerParty.getDinnerChoice() + " will be served");
        dinnerParty.displayInvitation();
        
        scanner.close();
    }
}
