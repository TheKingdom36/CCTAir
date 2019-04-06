/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Controllers.FlightController;
import Models.Flight;
import java.util.ArrayList;
/**
 *
 * @author Daniel Murphy
 */
public class ScheduleFlightView extends View {
    
    public ScheduleFlightView(FlightController controller){
        this.controller = controller;
    }
   
    public void RenderView(){
       System.out.println("//////////////////////////////////////////////////////////////////////////");
       System.out.println("Choose one of the following");
       ArrayList<Flight> flights =  controller.FindFlights(StringAsker.ask("What is ORIGIN of the FLIGHT you would like to schedule "));
       
       if(flights.size() == 0 ){
           System.out.print("There were no flights with your origin");
       }else{
            this.PrintList(flights);
            Flight FlightToBeScheduled = flights.get(IntegerAsker.ask("Choose the flight you wish to schedule")-1);
       
            System.out.println("Would you like to Schedule Arrival Time only OR both ArrivalTime and DepartureTime");
            if(1 == IntegerAsker.ask("Enter 1 for Arrival Time only or 2 for ArrivalTime and DepartureTime")){
                FlightToBeScheduled.Schedule(StringAsker.ask("Enter new arrival time"));
            }else{
                FlightToBeScheduled.Schedule(StringAsker.ask("Enter new Arrival time"), StringAsker.ask("Enter new DepartureTime"));
       
       }
       
       }
       
      
                
       
    }
}
