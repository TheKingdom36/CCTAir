/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;
import Menu.*;
import Models.*;
import Repositorys.*;
import Controllers.FlightController;
import Views.*;
/**
 *
 * @author Daniel Murphy
 */
public class CCTAir {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        User admin = new User("Damiel","001");
     
        FeatureMenu menu = new FeatureMenu();
        
        //Create from file
        IRepository<Flight> flightRepository = new FlightRepository("Flights.txt") ;
        
        IRepository<Pilot> pilotRepository = new PilotRepository("Pilots.txt");
        
        IRepository<AirPlane> airPlaneRepository = new AirPlaneRepository("AirPlanes.txt");
        
        FlightController flightController = new FlightController(flightRepository ,airPlaneRepository,pilotRepository);
        
        menu.AddItem(new Feature(new CreateFlightView(flightController),"Create Flight"));
        menu.AddItem(new Feature(new ScheduleFlightView(flightController),"Schedule Flight"));
        menu.AddItem(new Feature(new ListFlightsView(flightController),"List Flights"));
        
        
        do{ 
            System.out.println("//////////////////////////////////////////////////////////////////////////");
            menu.RenderView();
        }while(true);
         

    }
}


/*
    do{
            int valueEntered = kboard.nextInt();
            if(valueEntered == 1){
           if(admin.getNumberOfFightsEntered() < max ){
                //Increse Number of flights entered for user
            //print number of flights enterd by user  
               
           }
           
            
        
            }else {
            //print number of flights enterd by user            
        
            } 
            
        }while(true); //admin.getNumOfFLightsEntered < 5
    */