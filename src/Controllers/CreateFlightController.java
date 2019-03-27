/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Repositorys.IRepository;
import Models.Flight;
import Views.IView;
import Views.CreateFlightView;
/**
 *
 * @author Daniel Murphy
 */
public class CreateFlightController {
    IRepository<Flight> FlightRepository;
    
       
    public CreateFlightController(IRepository repo){
        this.FlightRepository = repo;
       
    }
    
    public boolean AddFlight(Flight flight){
        
        if(ValidateFlight(flight) == true){
            FlightRepository.AddItem(flight);
            CommitFlightToFile(flight);
            return true;
        }else{
            return false;
        }
        
        
    }
    
    private void CommitFlightToFile(Flight flight){
    
    }
    
    private boolean ValidateFlight(Flight flight){
    
        return true;
    }
    
}
