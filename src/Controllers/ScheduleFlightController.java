/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Models.Flight;
import Repositorys.IRepository;
import Views.IView;
/**
 *
 * @author Daniel Murphy
 */
public class ScheduleFlightController {
    IRepository<Flight> flights ;
  
    
    public ScheduleFlightController(IRepository<Flight> flights){
        this.flights = flights;
        
    }
    
    public boolean UpdateFlight(String id,Flight flight){
        flights.UpdateItem(id, flight);
        UpdateRecordInFile(flight);
        
        if(ValidateFlight(flight) == true){
            flights.AddItem(flight);
            UpdateRecordInFile(flight);
            return true;
        }else{
            return false;
        }
    }
    
    private void UpdateRecordInFile(Flight flight){
        
    }
    
    private boolean ValidateFlight(Flight flight){
        return true;//TODO
    }
}
