/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;
import java.util.ArrayList;
import Models.AirPlane;
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
public class AirPlaneRepository extends TextFileRepository<AirPlane>{
    
    public ArrayList<AirPlane> airplanes;
    public void AirPlaneRepository()
    {
     this.items = new ArrayList<>(); 
    
    }
    
    public AirPlaneRepository(String path){
        this.items = new ArrayList<>(); 
        this.FilePath = path;
        CreateFromFile(this.FilePath);
    }
    public ArrayList<AirPlane> listt(){
        return airplanes;
    }
    
    
    @Override
    protected void CreateFromFile(String path){
        
        Gson gs = new Gson();
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("airplanes.json")); 
              
            AirPlane[] airPlanes = gs.fromJson(reader, AirPlane[].class);
            for(AirPlane a : airPlanes){
                items.add(a);
            }
        }catch(Exception e){
           System.out.print(e.toString());
        }
    }


    
    
}
