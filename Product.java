/** Project: ProductClass
 * Summary: Source code for the product superclass
 * Class: CST-135
 * Date: February 22, 2018
 * Author: Tim James
 */

import java.text.DecimalFormat;
import java.util.Date;

public abstract class Product {
    // Declare instance variables
    private String name; // product name
    private double price; // product price
    private java.util.Date dateCreated; // date of product creation
    
    // Declare empty constructor
    public Product() {
        dateCreated = new java.util.Date();
    }
    
    // Declare Product constructor that accepts paremeters name and price
    public Product(String nameIn, double priceIn) {
        dateCreated = new java.util.Date(); // assigns date when created
        name = nameIn; // assigns the value of nameIn to the name class instance variable
        price = priceIn; // assigns the value priceIn to the price class instance variable
    }
    
    // Set name of product
    public void setName(String nameIn) {
        this.name = nameIn; 
    }
    
    // Return name of product
    public String getName() {
        return this.name;
    }
    
    // Set price of product
    public void setPrice(double priceIn) {
        this.price = priceIn;
    }
    
    // Return price of product
    public double getPrice() {
        return this.price;
    }
    
    // Get date created
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    
    // Format Currency
    DecimalFormat currency = new DecimalFormat("0.00");
    
    // Display product info to the console
    @Override
    public String toString() {
        return "Product: " + name + "\nPrice: $" + currency.format(price) +
                "\nCreated: " + dateCreated;
    }
}
