/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Controllers.FlightController;
import Models.Flight;
import Models.AirPlane;

import java.util.ArrayList;
import Repositorys.DataStore;

public class CreateFlightView extends View {
    ArrayList<AirPlane> airPlanes;
    
    
    public CreateFlightView(FlightController controller){
        this.controller = controller;
        airPlanes = controller.GetAirplanes();
        this.name = "Create Flight";
    }
    
    @Override
    public void RenderView(){
        System.out.println("//////////////////////////////////////////////////////////////////////////");
        System.out.println(this.name);
        
        int MinFlightDay = 1;
        Flight flight = new Flight();
       
        do{
          
            System.out.println("Select aircraft from menu");
            PrintList(airPlanes);
           
            flight.setAircraftAssigned(airPlanes.get(GetValidInt(1,airPlanes.size())-1));
            
            flight.setDepartureTime(StringAsker.ask("Enter DEPARTURE time"));
            
            flight.setArrivalTime(StringAsker.ask("Enter ARRIVAL time"));
            
            flight.setOrigin(StringAsker.ask("Enter ORIGIN of flight"));
            
            flight.setDestination(StringAsker.ask("Enter DESTINATION of flight)"));
            
            
            String Date = "";
            DataStore dataStore = new DataStore();
            
            System.out.println("Enter DATE of flight");
            
            PrintList(dataStore.Months);
            System.out.print("Month: ");
            Date += (dataStore.Months[GetValidInt(MinFlightDay,dataStore.Months.length)-1]);
            
            System.out.print("Day: ");
            Date += ( GetValidInt(MinFlightDay,dataStore.NumDaysPerMonth.get(Date)) + "/");
            
            
            Date += (StringAsker.ask("Year: "));
            
            flight.setDateOfFlight(Date);
            
            System.out.println("");
            
            
            System.out.println("One moment as we validate your entered flight");
        
            
        }while( controller.AddFlight(flight) == false);
         
         System.out.println("Your flight has been recorded");
    }
    
    public <T> void PrintList(ArrayList<T> items){
        for(int i=0; i<items.size();i++){
            System.out.println(i+1 + ". " +items.get(i).toString());
        }
    }
    
    public <T> void PrintList(T[] items){
        for(int i=0; i<items.length;i++){
            System.out.println(i+1 + ". " +items[i].toString());
        }
    }
    
    
    private int GetValidInt(int MinValue , int MaxValue){
        int EnteredValue=MinValue;
        String message = "Enter a value between " + MinValue + " and " + MaxValue;
        do{
            if(EnteredValue > MaxValue){
                message = "Invalid value, Entered value is too high";
            }else if(EnteredValue < MinValue){
                message = "Invalid value, Entered value is too low";
            };
            
                EnteredValue = IntegerAsker.ask(message);
        }while(EnteredValue > MaxValue || EnteredValue < MinValue );
        
        return EnteredValue;
    }
    
}
