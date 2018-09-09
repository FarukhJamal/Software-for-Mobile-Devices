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
public class House implements Paintable,Saleable {
   static  float area=(float) 5000.30;
    @Override
    public void paint(){
        try{
        System.out.println("House is painted white");
        }
        catch(NullPointerException e ){
            System.out.println(e);
        }
    }
   @Override
    public void sale(){
        try{
        System.out.println("The house is for sale");
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
    }
    
    final void area(){
        try{
        System.out.println("Area of the house is :");
        System.out.println(area);
        }
        catch(Exception e){
            
        }
        finally{
            area=(float) 0.0;
        }
    }

}

