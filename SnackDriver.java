/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrtim
 */
public class ProductDriver extends Snack {
    
    public static void main(String[] args) {  
        
        Product a = new Product("Potato Chips", 2.50) {};
    
        Product chip1 = new Snack(5) {};      
    
        System.out.println(a + chip1.toString());
    }
    
    
}
