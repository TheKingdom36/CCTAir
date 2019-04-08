/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;
import Models.AirPlane;
import Models.Aircraft;
import java.util.ArrayList;
import Models.Flight;
import Models.Helicopter;
import Models.Pilot;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
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
    
    
   
     protected void CreateFromFile(String path){
        /* 
        if(TypeOfAircraft == AirPlane.class){
             gs = new GsonBuilder().registerTypeAdapter(Aircraft.class, new AircraftAirpCreator()).create();
        }else if(TypeOfAircraft == Helicopter.class){
             gs = new GsonBuilder().registerTypeAdapter(Aircraft.class, new AircraftHeliCreator()).create();
        }
        */
        //Gson gs =  new Gson();
        BufferedReader reader ;
         Gson gs = new GsonBuilder().registerTypeAdapter(Aircraft.class, new AircraftAdapter()).create();
       
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



/*public class AircraftAirpCreator implements InstanceCreator<Aircraft> {

    @Override

    public Aircraft createInstance(Type type) {
       
       
        return new AirPlane("3","4",4,new Pilot());

    }

}          

public class AircraftHeliCreator implements InstanceCreator<Aircraft> {

    @Override

    public Aircraft createInstance(Type type) {
       
       
        return new Helicopter("3","4",4,new Pilot());

    }

   */
    
    public class AircraftAdapter implements  JsonDeserializer<Aircraft> {
    
 
    @Override
    public Aircraft deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context){
        
        System.out.print(json.toString());
        JsonObject jsonObject = json.getAsJsonObject();
       
        String type = jsonObject.get("type").getAsString();
       
        JsonElement element = jsonObject.get("properties");
 
        try {
          
            return context.deserialize(element, Class.forName("Models."+type));
        } catch (ClassNotFoundException cnfe) {
            
            throw new JsonParseException("Unknown element type: " + type, cnfe);
        }
    }
}
    
}          

    
    
    
    
    

