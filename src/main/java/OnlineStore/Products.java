public class Products { // stores the properties defined by csv file
    private long sku;
    private String name;
    private double price;
    private String department ;

    // Constructor - stores values
    public Products (long sku,
                     String name,
                     double price,
                     String department){
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.department = department;
    }
    //Methods - returns stored values
    //Getters
    public long getProductSku() {
        return sku;
    }public String getName() {
        return name;
    }public double getPrice() { // calculates the gross pay
        return price;
    }public String getDepartment(){
        return department;
    }
}
