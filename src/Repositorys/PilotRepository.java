/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;
import Models.AirPlane;
import java.util.ArrayList;
import Models.Pilot;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
/**
 *
 * @author Daniel Murphy
 */
public class PilotRepository extends TextFileRepository<Pilot>{
    
    public void PilotRepository()
    {
     this.items = new ArrayList<>(); 
     
    }
    
    public PilotRepository(String path){
        this.items = new ArrayList<>(); 
        this.FilePath = path;
        CreateFromFile(FilePath);
    }
    
    
    
    @Override
    public void UpdateItem(String id, Pilot item) {
   
    }
    
     @Override
    protected void CommitItemToFile(String path , Pilot pilot){
        //TODO Figure out how to put items in file
    }
    
     //@Override
     protected void CreateFromFile(String path){
        
          Gson gs = new Gson();
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(path)); 
              
            Pilot[] pilots = gs.fromJson(reader, Pilot[].class);
            for(Pilot p : pilots){
                items.add(p);
            }
        }catch(Exception e){
           System.out.print(e.toString());
        }
         
    }

    @Override
    protected void UpdateItemInFile(String path, String id) {
   
    }

    
    
}
