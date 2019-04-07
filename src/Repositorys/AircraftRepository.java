/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;
import Models.AirPlane;
import java.util.ArrayList;
import Models.Aircraft;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
 
/**
 *
 * @author Daniel Murphy
 */
public class AircraftRepository extends TextFileRepository<Aircraft>{
    
    public ArrayList<Aircraft> aircrafts;
    public void AircraftRepository()
    {
     this.items = new ArrayList<>(); 
    
    }
    
    public AircraftRepository(String path){
        this.items = new ArrayList<>(); 
        this.FilePath = path;
        CreateFromFile(this.FilePath);
    }
    
    
    @Override
    protected void CreateFromFile(String path){
        
        Gson gs = new Gson();
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("airplanes.json")); 
              
            Aircraft[] aircrafts = gs.fromJson(reader, AirPlane[].class);
            for(Aircraft a : aircrafts){
                items.add(a);
            }
        }catch(Exception e){
           System.out.print(e.toString());
        }
    }


    
    
}
