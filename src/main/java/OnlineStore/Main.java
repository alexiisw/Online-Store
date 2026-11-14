package OnlineStore;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Products> inventory = Inventory.addProducts(); // receives the ArrayList returned by the Inventory class and stores it in a variable called inventory
        Menu.homeMenu(inventory); // passes the inventory list into the menu.


    }
}

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

