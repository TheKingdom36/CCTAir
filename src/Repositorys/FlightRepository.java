/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;
import Models.AirPlane;
import java.util.ArrayList;
import Models.Flight;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
 
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
    
     /**
     *Commits an item within the repository to a file
     * @param path  The file path of where the repository items are held
     * @param flight The flight to be commited to a file
     * 
     */
    @Override
    protected void CommitItemToFile(String path,Flight flight){
        //TODO Figure out how to put items in file
    }
    
    
    @Override
     protected void CreateFromFile(String path){
        Gson gs = new Gson();
        BufferedReader reader ;
        try{
            reader = new BufferedReader(new FileReader(path)); 
              
            Flight[] flights = gs.fromJson(reader, Flight[].class);
            
            items.addAll(Arrays.asList(flights));
            
        }catch(JsonIOException | JsonSyntaxException | FileNotFoundException e){
           System.out.print(e.toString());
        }
    }

    
    @Override
    protected void UpdateItemInFile(String path,String id) {
        //TODO Figure out how to update a single flight entry
    }

    
    
    
    
    
}
