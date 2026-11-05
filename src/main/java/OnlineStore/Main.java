package OnlineStore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Products> inventory = Inventory.addProducts; //
        Menu.homeMenu(inventory);


    }

    //Customers should be able to view all products
    //They should also be able to search by Product Name, Price or Department
    // Customers should be able to add products to their cart
    // Customers should be able to remove products from their cart

//    Screens
//• The Store Home Screen - The home screen should display a list
//    of options that a user can choose from.
//    o Display OnlineStore.Products
//    o Display Cart
//    o Exit - closes out of the application
//• Display OnlineStore.Products - Displays a list of products that your store
//    sells.
//    o On this screen the customer should be able to  - Search or filter the list of products - Add a product to their cart - Go Back to the home page
//• Display Cart - This displays a list of line items that are in the
//    customer's cart. It should also display the total sales amount of
//    the cart.
//    o The customer should be able to: - Check Out - Remove Product from the cart - Go Back to the home screen
//    o If the customer chooses to remove a product need to prompt
//    them for the product to remove

//    BONUS (optional)
//• Check Out - Here you should display the total sales amount
//    owed for this order and prompt the user for payment.
//    o Assume that the user will pay in cash
//    o When the customer enters their payment amount, verify that
//    the amount is sufficient to cover the cost of the cart - If the customer added enough money for the sale,
//• calculate the change that is owed to the customer
//    and display the calculated change
//• print a sales receipt to the screen
//    o Order Date
//    o All Line items
//    o Sales Total
//    o Amount Paid
//    o Change Given
//• clear the shopping cart
//• Return to the home screen
//• When a customer adds multiple items to a cart
//    o  Instead of showing the item multiple times, your cart
//    should only display each item once, but display the quantity
//for each item
//• Create Sales Receipt File
//    o After checkout, in addition to displaying the sales receipt to
//    the screen, create a file with the sale information - Save the file in a Receipts folder - The file name should be the date and time stamp of the
//    sale
//• 202303151148.txt - All of the information printed to the screen should be
//    saved to the file
}
