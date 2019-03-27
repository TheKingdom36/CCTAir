/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Controllers.CreateFlightController;
import Models.Flight;
import java.util.Scanner;

public class CreateFlightView implements IView {
    CreateFlightController controller;
    Scanner scanner = new Scanner(System.in);
    public CreateFlightView(CreateFlightController controller){
        this.controller = controller;
    }
    
    public void RenderView(){
        Flight flight = new Flight();
        
        //do{
            //TODO Ask user for all the input
            System.out.println("Enetr you flight desination");
            
            
            System.out.println("Choose your aireplane the options are");            
            
            
            System.out.println("Ill good");
        
            
       // }while( controller.AddFlight(flight) == false);
       
        
       
        
        
        
        
    }
    
   
}
