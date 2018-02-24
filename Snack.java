/** Project: Snack
 * Summary: Source code for the Snack subclass
 * Class: CST-135
 * Date: February 23, 2018
 * Author: Tim James
 */
public abstract class Snack extends Product {
    
    // Declare instance variables
    public int ounces;
    
    // Declare empty constructor
    public Snack(){}
    
    public Snack(int ouncesIn ) {
        ounces = ouncesIn; // assigns the calue of ouncesIn to the ounces class instance variable
    }
    
    // Set ounces of snack
    public void setOunces(int ouncesIn) {
        this.ounces = ouncesIn;
    }
    
    // Return ounces of snack
    public int getOunces() {
        return this.ounces;
    }
    
    // Display product info to the console
    @Override
    public String toString() {
        return "\nOunces: " + ounces;
    }
    
}
