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
public class FlightRepository extends BasicRepository<Flight>{
    
    public void FlightsRepository()
    {
     this.items = new ArrayList<>(); 
    }
    
    public void FlightsRepository(String path){
        CreateFromFile(path);
    }
    
    
    public void CommitToFile(String path){
        //TODO Figure out how to put items in file
    }
    
     public void CreateFromFile(String path){
        //TODO figure out how to read items from file
    }
}
