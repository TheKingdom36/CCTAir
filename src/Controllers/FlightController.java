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
            CommitFlightToFile(flight);
            return true;
        }else{
            return false;
        }
        
        
    }
     
     public boolean UpdateFlight(String id,Flight flight){
       
        if(ValidateFlight(flight) == true){
            flights.UpdateItem(id, flight);
            UpdateRecordInFile(flight);
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
    
    private void UpdateRecordInFile(Flight flight){
        
    }
    
    private void CommitFlightToFile(Flight flight){
    
    }
    
     private boolean ValidateFlight(Flight flight){
    
        
        return true;
    }
}
