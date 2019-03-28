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
    public void RenderView() {
          System.out.println("//////////////////////////////////////////////////////////////////////////");
        for(Flight f : controller.GetFlights()){
            System.out.println(f.toString());
        }
          System.out.println("//////////////////////////////////////////////////////////////////////////");
    }
    
}
