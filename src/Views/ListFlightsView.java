/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Controllers.FlightController;
import Models.Flight;
/**
 *
 * @author Daniel Murphy
 */
public class ListFlightsView extends View {
   
    
    public ListFlightsView(FlightController controller){
        this.controller = controller;
    }
    
    
    @Override
    public void RenderView() {
          System.out.println("\n/////////////////////////////////////////////////////////////////////////\n");
        System.out.println("Total number of flights: " + controller.GetFlights().size() + "\n");
          for(int i=0; i<controller.GetFlights().size();i++){
              System.out.println(i+1 + ". " + controller.GetFlights().get(i).toString());
          }
          
          System.out.println("//////////////////////////////////////////////////////////////////////////");
    }
    
}
