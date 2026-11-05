package OnlineStore;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Search {
            //search one product
//        public static Products searchByProductName(ArrayList<Products> inventory, String nameSearch) {
//            for (Products products : inventory) { // runs through the inventory list
//                if (products.getName().equalsIgnoreCase(nameSearch)) { // compares the input vs the product
//                    return products; // if the product is found it will return result
//                }
//            }
//            return null; // if the product isn't found, it will return nothing
//        }

    public static ArrayList<Products> searchByProductName(ArrayList<Products> inventory, String nameSearch) {
        ArrayList<Products> matchingName = new ArrayList<>();
        for (Products products : inventory) { // runs through the inventory list
            if (products.getName().equalsIgnoreCase(nameSearch)) { // compares the input vs the product
                matchingName.add(products); // if the product is found it will return result
            }
        }
        return matchingName; // if the product isn't found, it will return nothing
    }
    public static ArrayList<Products> searchByProductPrice(ArrayList<Products> inventory, double priceSearch) {
        ArrayList<Products> matchingPrice = new ArrayList<>();
        for (Products products : inventory) { // runs through the inventory list
            if (products.getPrice() == priceSearch) { // compares the input vs the product
                matchingPrice.add(products); // if the product is found it will return result
            }
        }
        return matchingPrice; // if the product isn't found, it will return nothing
    }
    public static ArrayList<Products> searchByProductDepartment(ArrayList<Products> inventory, String productDepartment) {
        ArrayList<Products> matchingDepartment = new ArrayList<>(); // creates a list of all items in the same department
        for (Products products : inventory) { // runs through the inventory list
            if (products.getDepartment().equalsIgnoreCase(productDepartment)) { // compares the input vs the product
                matchingDepartment.add(products); // adds product in matching department to list

            }
        }
        return matchingDepartment; // returns the result
    }
}



