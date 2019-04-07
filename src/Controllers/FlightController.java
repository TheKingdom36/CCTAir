/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Flight;
import Models.Aircraft;
import Models.Pilot;
import Repositorys.IRepository;
import java.util.ArrayList;

/**
 *
 * @author Daniel Murphy
 */
public class FlightController {
    
    IRepository<Flight> flights;
    IRepository<Aircraft> aircrafts;
    IRepository<Pilot> pilots;
            
    public FlightController(IRepository<Flight> flights,IRepository<Aircraft> aircrafts,IRepository<Pilot> pilots){
        this.flights = flights;
        this.aircrafts = aircrafts;
        this.pilots = pilots;
    }
    
    /**
     *Returns an arrayList of all flights
     */
    public ArrayList<Flight> GetFlights(){
         return flights.GetList();
         
    } 
    
    /**
     *Adds a flight to the flights repository if the flight is accepted
     */
    public boolean AddFlight(Flight flight){
        
        if(ValidateFlight(flight) == true){
            flights.AddItem(flight);
            return true;
        }else{
            return false;
        }  
    }
    
    /**
     *Returns an ArrayList of flights which the flights origin matchs the String parameter
     * 
     * @param Origin The origin of the requested flights
     */
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
     
     /**
      *Updates a flight entry within the repository
      * 
      * @param id The id of the flight to be updated
      * @param flight The new flight information
      */
     public boolean UpdateFlight(String id,Flight flight){
       
        if(ValidateFlight(flight) == true){
            flights.UpdateItem(id, flight);
            return true;
        }else{
            return false;
        }
    }
    
    /**
     *Returns an ArrayList of Airplanes
     */
    public ArrayList<Aircraft> GetAircrafts(){
        return this.aircrafts.GetList();
    }
    
    /**
     *Returns an ArrayList of Pilots
     */
    public ArrayList<Pilot> GetPliots(){
        return this.pilots.GetList();
    }
    
    /**
     *Validates that a Flight meets the required information
     * 
     * @param flight flight to be validated
     */
     private boolean ValidateFlight(Flight flight){
        return true;
    }
}
