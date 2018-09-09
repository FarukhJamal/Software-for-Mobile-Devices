/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign_smd;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Instantiating the house class
        // It has exception handeling in it
        House house=new House();
        //Overriden method of Saleable 
        house.sale();
        
        // Final method with try catch and finally
        house.area();
        
        
        
        // Instantiating the outer class 
      Honda car = new Honda();
      
      // Accessing the display_Inner() method.
      car.display_Inner();
      
      
      
    }
    
}
