/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;
import java.util.ArrayList;
import Models.Flight;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
/**
 *
 * @author Daniel Murphy
 */
public class FlightsRepository implements IRepository<Flight>{
    ArrayList<Flight> Flights;
    
    public void FlightsRepository(){
    
    }
    
    
    public void AddItem(Flight flight){
        Flights.add(flight);
    }
    
    public void RemoveItem(Flight flight){
        Flights.remove(flight);
    }
    
    /**
      *@param id flight id
      *@param flight flight with updated information
    */
    public void UpdateItem(String id, Flight flight){
    
    }
    
    public void CommitToFile(){
    
    }
}
