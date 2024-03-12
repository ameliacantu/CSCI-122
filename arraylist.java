import java.util.ArrayList;

// Class representing a grocery item
class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Class representing a shopper's desire to purchase a given item in a given quantity
class ItemOrder {
    private Item item;
    private int quantity;

    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate the total price for this item order
    public double getTotalPrice() {
        return item.getPrice() * quantity;
    }
}

// Class representing a shopping cart
class ShoppingCart {
    private ArrayList<ItemOrder> itemList;

    public ShoppingCart() {
        itemList = new ArrayList<ItemOrder>();
    }

    // Method to add an item order to the shopping cart
    public void addItemOrder(ItemOrder order) {
        itemList.add(order);
    }

    // Method to remove an item order from the shopping cart
    public void removeItemOrder(ItemOrder order) {
        itemList.remove(order);
    }

    // Method to search for an item order in the shopping cart
    public ItemOrder searchItemOrder(String itemName) {
        for (ItemOrder order : itemList) {
            if (order.getItem().getName().equalsIgnoreCase(itemName)) {
                return order;
            }
        }
        return null;
    }

    // Method to calculate the total price of all item orders in the shopping cart
    public double getTotalPrice() {
        double totalPrice = 0;
        for (ItemOrder order : itemList) {
            totalPrice += order.getTotalPrice();
        }
        return totalPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating some sample items
        Item tissueItem = new Item("Tissues", 3.0);

        // Creating item orders
        ItemOrder order1 = new ItemOrder(tissueItem, 5);
        ItemOrder order2 = new ItemOrder(tissueItem, 2);
        
        // Creating a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Adding item orders to the shopping cart
        cart.addItemOrder(order1);
        cart.addItemOrder(order2);

        // Calculating the total price of the shopping cart
        double totalPrice = cart.getTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
    }
}
