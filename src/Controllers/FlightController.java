/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Flight;
import Models.AirPlane;
import Models.Pilot;
import Repositorys.IRepository;
import java.util.ArrayList;

/**
 *
 * @author Daniel Murphy
 */
public class FlightController {
    
    IRepository<Flight> flights;
    IRepository<AirPlane> airPlanes;
    IRepository<Pilot> pilots;
            
    public FlightController(IRepository<Flight> flights,IRepository<AirPlane> airPlanes,IRepository<Pilot> pilots){
        this.flights = flights;
        this.airPlanes = airPlanes;
        this.pilots = pilots;
    }
    
    public ArrayList<Flight> GetFlights(){
         return flights.GetList();
    } 
    
    public boolean AddFlight(Flight flight){
        
        if(ValidateFlight(flight) == true){
            flights.AddItem(flight);
            return true;
        }else{
            return false;
        }  
    }
    
     public ArrayList<Flight> FindFlights(String Origin){
        ArrayList<Flight> MatchingFlights = new ArrayList<Flight>();
        ArrayList<Flight> AvailableFlights = flights.GetList();
        
        for(int i=0; i<AvailableFlights.size();i++){
            if(Origin.equals(AvailableFlights.get(i).getOrigin())){
                MatchingFlights.add(AvailableFlights.get(i));
            }
            
        }
        
        return MatchingFlights;
    }
     
     public boolean UpdateFlight(String id,Flight flight){
       
        if(ValidateFlight(flight) == true){
            flights.UpdateItem(id, flight);
            return true;
        }else{
            return false;
        }
    }
    
    
    public ArrayList<AirPlane> GetAirplanes(){
        return this.airPlanes.GetList();
    }
    
    public ArrayList<Pilot> GetPliots(){
        return this.pilots.GetList();
    }
    
    
     private boolean ValidateFlight(Flight flight){
        return true;
    }
}
