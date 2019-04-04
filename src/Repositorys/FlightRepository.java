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
public class FlightRepository extends TextFileRepository<Flight>{
    
    public void FlightsRepository()
    {
     this.items = new ArrayList<>(); 
    }
    
    public FlightRepository(String path){
        this.items = new ArrayList<>(); 
        this.FilePath = path;
        CreateFromFile(FilePath);
    }
    
    @Override
    public void UpdateItem(String id, Flight item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    protected void CommitItemToFile(String path,Flight flight){
        //TODO Figure out how to put items in file
    }
    
    @Override
     protected void CreateFromFile(String path){
        //TODO figure out how to read items from file
    }

    @Override
    protected void UpdateItemInFile(String path,String id) {
        //TODO Figure out how to update a single flight entry
    }

    
}
