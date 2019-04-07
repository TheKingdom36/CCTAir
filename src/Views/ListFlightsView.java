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
          System.out.println("//////////////////////////////////////////////////////////////////////////");
        System.out.println(controller.GetFlights().size());
          for(int i=0; i<controller.GetFlights().size();i++){
              System.out.print(controller.GetFlights().get(i).toString());
          }
          
          System.out.println("//////////////////////////////////////////////////////////////////////////");
    }
    
}
