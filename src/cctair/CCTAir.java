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
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
/**
 *
 * @author Daniel Murphy
 */
public class CCTAir {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        User user = new User("Mark","001");
     
        FeatureMenu menu = new FeatureMenu();
        
        //Create from file
        IRepository<Flight> flightRepository = new FlightRepository("Flights.json") ;
        IRepository<Pilot> pilotRepository = new PilotRepository("Pilots.txt");
        IRepository<AirPlane> airPlaneRepository = new AirPlaneRepository("airplanes.txt");
        
        
        FlightController flightController = new FlightController(flightRepository ,airPlaneRepository,pilotRepository);
        
        menu.AddItem(new Feature(new CreateFlightView(flightController,user),"Create Flight"));
        menu.AddItem(new Feature(new ScheduleFlightView(flightController),"Schedule Flight"));
        menu.AddItem(new Feature(new ListFlightsView(flightController),"List Flights"));
        
            
        do{   
            System.out.println("//////////////////////////////////////////////////////////////////////////");
            menu.RenderView();
        }while(true);
         

    }
    
}
