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
        FeatureMenu menu = new FeatureMenu();
        
        IRepository<Flight> flightRepository = new FlightRepository() ;
        
        IRepository<Pilot> pilotRepository = new PilotRepository();
        
        //just for testing created a few pilots
        pilotRepository.AddItem(new Pilot("Murphy","Daniel","Skilled",32,true));
         pilotRepository.AddItem(new Pilot("Murphy","Dean","verySkilled",62,true));
          pilotRepository.AddItem(new Pilot("Gregan","Stephan","Skilled",42,false));
        
        IRepository<AirPlane> airPlaneRepository = new AirPlaneRepository();
        
        //Just for testing created a few airplanes
       airPlaneRepository.AddItem(new AirPlane("Boeing", 747, 500, pilotRepository.GetList().get(0)));
        airPlaneRepository.AddItem(new AirPlane("Boeing", 7, 100, pilotRepository.GetList().get(1)));
         airPlaneRepository.AddItem(new AirPlane("jet", 4, 200, pilotRepository.GetList().get(2)));
        
        FlightController flightController = new FlightController(flightRepository ,airPlaneRepository,pilotRepository);
        
        menu.AddItem(new Feature(new CreateFlightView(flightController),"Create Flight"));
        menu.AddItem(new Feature(new ScheduleFlightView(flightController),"Schedule Flight"));
        menu.AddItem(new Feature(new ListFlightsView(flightController),"List Flights"));
        
        do{ 
            menu.RenderView();
        }while(true);
       
    }
    
}
