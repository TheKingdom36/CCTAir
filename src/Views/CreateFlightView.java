/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Controllers.FlightController;
import Models.Flight;
import Models.AirPlane;
import java.util.Scanner;
import java.util.ArrayList;
public class CreateFlightView extends View {
    ArrayList<AirPlane> airPlanes;
    
    public CreateFlightView(FlightController controller){
        this.controller = controller;
        airPlanes = controller.GetAirplanes();
    }
    
    public void RenderView(){
        System.out.println("//////////////////////////////////////////////////////////////////////////");
        
        Flight flight = new Flight();
        int EnteredValue=0;
        do{
            //TODO Ask user for all the input
            System.out.println("Enter you flight desination");
            
            flight.setDestination(this.scanner.nextLine());
            
            System.out.println("Select aircraft from menu");
            PrintList(airPlanes);
            do{
                EnteredValue = this.scanner.nextInt();
            }while(EnteredValue > airPlanes.size());
            
            flight.setAircraftAssigned(airPlanes.get(EnteredValue-1));
            
            System.out.println("");
            
            
            System.out.println("Ill good");
        
            
        }while( controller.AddFlight(flight) == false);
         System.out.println("//////////////////////////////////////////////////////////////////////////");
        
    }
    
    public void PrintList(ArrayList<AirPlane> items){
        for(int i=0; i<items.size();i++){
            System.out.println(i+1 + ". " +items.get(i).toString());
        }
    }
    
   
}
