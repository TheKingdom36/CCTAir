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
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
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
    
    
     //@Override
     protected void CreateFromFile(String path){
        
          Gson gs = new Gson();
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(path)); 
              
            Pilot[] pilots = gs.fromJson(reader, Pilot[].class);
            for(Pilot p : pilots){
                items.add(p);
            }
        }catch(JsonIOException | JsonSyntaxException | FileNotFoundException e){
           System.out.print(e.toString());
        }
         
    }


    
    
}
