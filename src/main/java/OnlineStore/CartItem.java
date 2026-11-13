package OnlineStore;

public class CartItem { //
    private final Products product;
    private int quantity;

    // Constructor - stores values
    public CartItem(Products product) { // runs when we create a new cart item
        this.product = product;
        this.quantity = 1; // qty starts at 1 instead of 0 when added to the cart
    }

    //Methods - returns stored values
    //Getters
    public Products getProduct() { // gets the product stored inside cart item
        return product; // returns whatever product was stored
    }

    public int getQuantity() { // allows other classes to access the qty
        return quantity;
    }

    public void increaseQuantity() { // void because it doesn't return anything just changes data
        quantity++;
    }

    public void decreaseQuantity() { // void because it doesn't return anything just changes data
        quantity--; // decreases the qty by 1
    }
}