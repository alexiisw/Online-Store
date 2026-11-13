package OnlineStore;

import java.util.ArrayList;

public class Cart {
    private final ArrayList<CartItem> items; // the cart's storage

    public Cart(){
        items = new ArrayList<>();
    }
    public void addProduct(Products product) { // void because it doesn't return anything just changes data (adding something)
        for (CartItem item : items) { // checks every item currently in the cart

            if (item.getProduct().getName().equalsIgnoreCase(product.getName())) { // compares the name of the product being added to the name on the products already in the cart
                item.increaseQuantity(); // match found ; increases the qty by 1
                return; // stops java from accidentally adding duplicate cart items
            }
        }
            items.add(new CartItem(product)); // adds item to cart
    }
    public void removeProduct(String name) { // // void because it doesn't return anything just changes data (removing something)
        for (CartItem item : items){

            if (item.getProduct().getName().equalsIgnoreCase(name)) { // compares the name of the product being removed to the name on the products already in the cart
                if (item.getQuantity() > 1) { // checks the qty and checks if there is more than one of that particular product
                    item.decreaseQuantity(); // match found ; decreases the qty by 1

                } else {
                    items.remove(item); // will just remove item if the qty is at 1
                }
                return;
            }
        }
    }
    public ArrayList<CartItem> getItems() { // returns all cartItems when displaying cart
            return items;
    }
    public double getTotal() {
        double total = 0;

        for (CartItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity(); // will multiply the products price by the qty
        }
        return total;
    }
    public boolean isEmpty() { // checks if the cart is empty; returns true if cart is empty / returns false if cart contains items
        return items.isEmpty();
    }
}
