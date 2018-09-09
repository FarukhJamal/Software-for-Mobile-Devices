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
public class Honda extends Car {
    
    @Override
    void maintainence(){
        System.out.println("Honda needs maintainence after 6 months");
    }
    public class HondaCity{
    
         public void print() {
         System.out.println("This is honda city car");
      }
   }
   
   // Accessing he inner class from the method within
   void display_Inner() {
      HondaCity inner = new HondaCity();
      inner.print();
   }
    
}
