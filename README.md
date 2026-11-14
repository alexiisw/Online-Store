# ShopSphere

## Overview

ShopSphere is a Java-based e-commerce application that simulates an online shopping experience through a console interface. The
application loads product inventory from a CSV file, allows customers to browse and search products, add items to a shopping cart, 
remove items from their cart, and complete purchases through a checkout system.

This project was developed as part of the Pluralsight Java Development program to strengthen skills in Object-Oriented Programming (OOP), 
file handling, collections, application design, and real-world business logic.

---

## Features

### Product Inventory Management

- Loads product data from a CSV file
- Creates Product objects from inventory records
- Displays all available products
- Organizes products by department

### Product Search

Customers can search products by:

- Product Name
- Price
- Department

### Shopping Cart

Customers can:

- Add products to their cart
- Remove products from their cart
- View their cart at any time
- View quantities for duplicate items
- View the current cart total

### Checkout System

During checkout the application:

- Calculates the total purchase amount
- Prompts the customer for payment
- Validates sufficient payment
- Calculates change owed
- Prints a detailed sales receipt
- Clears the shopping cart after a successful purchase

### Receipt Generation

After checkout:

- Receipt details are displayed in the console
- A timestamped receipt file is created
- Receipt files are saved in a Receipts folder
- All transaction details are preserved for future reference

Example:

```text
20261113180215.txt
```

---

## Product Data Structure

Inventory is loaded from a CSV file using the following format:

```text
SKU|Product Name|Price|Department
AV1051|JBL Bluetooth Speaker|89.95|Audio Video
AV1312|Mini 1000 Lumens Projector|149.95|Audio Video
GM1148|Retro Handheld Arcade|24.45|Games
PW1001|Solar Powered Battery Charger|19.99|Electronics
```

Each product contains the following information:

| Property | Description |
|-----------|-----------|
| SKU | Unique Product Identifier |
| Product Name | Product Description |
| Price | Product Price |
| Department | Product Category |

---

## Application Flow

### Home Screen

```text
-------------------------------------
          AUTONEXUS
-------------------------------------

1. Display Products
2. Display Cart
3. Exit

Select an option:
```

### Products Screen

```text
Products Menu

1. View All Products
2. Search by Name
3. Search by Price
4. Search by Department
5. Add Product to Cart
6. Return to Home Screen
```

### Cart Screen

```text
Shopping Cart

1. View Cart
2. Remove Product
3. Check Out
4. Return to Home Screen
```

---

## Example Shopping Cart

```text
Shopping Cart

JBL Bluetooth Speaker x2
Mini 1000 Lumens Projector x1
Retro Handheld Arcade x3

Total: $403.20
```

Duplicate products are grouped together and displayed with their quantities rather than appearing multiple times.

---

## Example Receipt

```text
=================================
          SALES RECEIPT
=================================

Order Date:
2026-11-13 18:02:15

JBL Bluetooth Speaker x2
Mini 1000 Lumens Projector x1

---------------------------------

Sales Total:   $329.85
Amount Paid:   $350.00
Change Given:  $20.15

=================================
Thank You For Shopping!
=================================
```

---

## Object-Oriented Design

### Product Class

The Product class stores product-related information.

#### Properties

| Property | Type |
|-----------|-----------|
| sku | String |
| productName | String |
| price | double |
| department | String |

### Cart Class

The Cart class manages all shopping cart operations.

Responsibilities include:

- Adding products
- Removing products
- Tracking quantities
- Calculating totals
- Managing cart items

### CartItem Class

The CartItem class stores:

- Product information
- Quantity of the selected product

This allows duplicate products to be displayed as a single line item with a quantity count.

### Receipt Class

The Receipt class handles:

- Receipt formatting
- Receipt generation
- Receipt file creation
- Saving purchase history

---

## Technologies Used

- Java
- Maven
- IntelliJ IDEA
- Object-Oriented Programming (OOP)
- ArrayLists
- File I/O
- BufferedReader
- BufferedWriter
- LocalDateTime
- DateTimeFormatter

---

## Project Structure

```text
src
└── main
    └── java
        └── OnlineStore
            ├── Main.java
            ├── Menu.java
            ├── Products.java
            ├── Inventory.java
            ├── Cart.java
            ├── CartItem.java
            ├── Search.java
            └── Receipt.java

resources
└── products.csv

Receipts
└── Sales Receipt Files
```

---

## Skills Demonstrated

This project demonstrates:

- Object-Oriented Design
- Encapsulation
- Class Composition
- ArrayList Management
- CSV File Processing
- Searching and Filtering Data
- Data Validation
- File Creation and Persistence
- Shopping Cart Architecture
- Receipt Generation
- Refactoring Large Classes
- Business Logic Implementation

---

## What I Learned

While building AutoNexus, I gained experience working with real-world data sources, designing relationships between multiple classes, and implementing a complete purchase workflow. I learned how to load and process CSV files, organize shopping cart data using composition, create reusable search functionality, generate receipt files, and refactor application logic into smaller, maintainable methods.

This project strengthened my understanding of how Object-Oriented Programming can be used to build scalable business applications and reinforced best practices for code organization and separation of responsibilities.

---

## Future Improvements

Potential enhancements include:

- Customer accounts
- Product inventory updates
- Product categories and sorting
- Order history tracking
- Sales reporting dashboard
- Database integration using MySQL
- Product recommendations
- Persistent shopping carts
- Employee inventory management tools
- Graphical User Interface (GUI)
- Web-based storefront

---

## Author

**Alexis Williams**

Aspiring Software Engineer

GitHub: https://github.com/alexiisw
