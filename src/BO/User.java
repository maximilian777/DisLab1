package BO;
import java.util.ArrayList;

public class User {
    private final String username;
    private ArrayList<Item> shoppingCart;

    public User(String username) {
        this.username = username;
        this.shoppingCart = new ArrayList<Item>();
    }

    private ArrayList<Item> addToShoppingCart(Item item) {
        shoppingCart.add(item);
        return shoppingCart;
    }

    private void viewShoppingCart() {
        if (shoppingCart.isEmpty()) {
            System.out.println("No Items");
        }
        else {
            System.out.println("Shopping cart contains");
            for (Item item : shoppingCart) {
                System.out.println("- " + item);
            }
        }
    }
}
