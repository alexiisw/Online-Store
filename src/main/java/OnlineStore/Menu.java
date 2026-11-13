package OnlineStore;

import java.util.ArrayList;
import java.util.Scanner;

import static OnlineStore.Search.*;

public class Menu {
    public static void homeMenu(ArrayList<Products> inventory) {// uses the inventory it receives
        Cart customerCart = new Cart();
        Scanner read = new Scanner(System.in); // name scanner what its doing

        boolean systemsRunning = true;
        while (systemsRunning) {
            System.out.print("+===========================+\n");
            System.out.print("+  Welcome to Online Store! +\n");
            System.out.print("+===========================+\n");
            System.out.print("Please input your selection from the following menu choices:\n");
            System.out.println("(1)Display Products \n(2)Display Cart \n(3)Exit - closes out of the application");
            int selection = read.nextInt();
            read.nextLine(); // eats leftover line

            switch (selection) { // will choose a case based on selection input

                case 1:
                    displayMenu(inventory, customerCart, read); // displays all products on inventory list
                    break;

                case 2:
                    cartMenu(customerCart, read); // displays only the items in the customer cart
                    break;

                case 3:
                    systemsRunning = false; // closes out of the application
                    System.out.print("Thank you for visiting. See you soon!");
                    break;

                default: // similar to the final 'else' in a statement
                    System.out.print("That is an invalid input. Please try again!");

            }
        }
    }
    //ArrayList<String> displayedProducts = new ArrayList<>();
    public static void displayMenu(ArrayList<Products> inventory,Cart customerCart, Scanner read) {

        displayProducts(inventory);

        System.out.println("Would you like to search by (1)Name, (2)Price, (3)Department, (4)Exit");
        int searchMethod = read.nextInt();
        read.nextLine(); // eats empty line

        switch (searchMethod) {
            case 1:
                searchByName(inventory, customerCart, read);
                break;
            case 2:
                searchByDepartment(inventory, customerCart, read);
                break;
            case 3:
                searchByPrice(inventory, customerCart, read);
                break;
        }
    }
    public static void cartMenu (Cart customerCart, Scanner read) {
        displayCart(customerCart);

        System.out.print("""
                Please input your selection from the following options:
                (1)Check Out\s
                (2)Remove Product\s
                (3)Go Back - returns to HomeMenu\s""");

        int selection = read.nextInt();
        read.nextLine();

        switch (selection) {
            case 1:
                checkout(customerCart);
                break;
            case 2:
                removeProduct(customerCart, read);
                break;

        }
    }
    public static void searchByName(ArrayList<Products> inventory, Cart customerCart, Scanner read){
        System.out.println("Please enter the product name you are looking for: ");
        String nameSearch = read.nextLine();

        ArrayList<Products> matchingName = Search.searchByProductName(inventory, nameSearch);

        displaySearchResults(matchingName, inventory, customerCart, read);
    }
    public static void searchByPrice(ArrayList<Products> inventory, Cart customerCart, Scanner read){
        System.out.println("Please enter the product's price: ");
        String priceSearch = read.nextLine();
        double productPrice = Double.parseDouble(priceSearch);

        ArrayList<Products> matchingPrice = Search.searchByProductPrice(inventory, productPrice);

        displaySearchResults(matchingPrice, inventory, customerCart, read);
    }
    public static void searchByDepartment(ArrayList<Products> inventory, Cart customerCart, Scanner read){
        System.out.println("Please enter the store department you wish to explore: ");
        String departmentSearch = read.nextLine();

        ArrayList<Products> matchingDepartment = Search.searchByProductDepartment(inventory, departmentSearch);

        displaySearchResults(matchingDepartment, inventory, customerCart, read);
    }
    public static void displaySearchResults(ArrayList<Products> inventory, ArrayList<Products> results, Cart customerCart, Scanner read){
        System.out.println("Please enter the product name you are looking for: ");
        String nameSearch = read.nextLine();

        ArrayList<Products> matchingName = Search.searchByProductName(inventory, nameSearch);

        if (results.isEmpty()) {
            System.out.print("Item not found!");
            return;
        }

        for (Products product : results) {
            product.displayInfo();
        }
        addToCart(inventory, customerCart, read);
    }
    public static void displayProducts(ArrayList<Products> inventory){
        for (Products product :inventory){
            System.out.printf("%s | %s | $%.2f | %s%n", product.getSku(), product.getName(), product.getPrice(), product.getDepartment());
        }
    }
    public static void displayCart(Cart customerCart){
        if (customerCart.isEmpty()){
            System.out.println("CART IS EMPTY.");
            return;
        }
        for (CartItem item : customerCart.getItems()) {
            System.out.printf("%s - QTY: %d%n", item.getProduct().getName(), item.getQuantity()); // will only display name of product instead of all product info && its qty in the cart
        }
        System.out.printf("Total: $%.2f%n", customerCart.getTotal());
    }
    public static void addToCart(ArrayList<Products> inventory, Cart customerCart, Scanner read){
        System.out.println("Would you like to an add item to your cart? Yes or No");
        String addToCart = read.nextLine();

        if (!addToCart.equalsIgnoreCase("yes")) {
            return;
        }
        System.out.println("Please enter the product name you would like to add to your cart: ");
        String nameSearch = read.nextLine();

        ArrayList<Products> foundProduct = Search.searchByProductName(inventory, nameSearch);

        if (!foundProduct.isEmpty()) { // as long a result comes back
            customerCart.addProduct(foundProduct.get(0));

            System.out.print("Item has been added to cart.\n");
        }
    }
    public static void removeProduct(Cart customerCart, Scanner read){
        System.out.print("Enter the product name below. \n");

        String removeProduct = read.nextLine();
        customerCart.removeProduct(removeProduct);

        System.out.println("Item has been removed");
    }
    public static void checkout(Cart customerCart){
        System.out.printf("Total: $%.2f%n", customerCart.getTotal());
        System.out.println("Thank you for shopping. See you soon!");

    }
}