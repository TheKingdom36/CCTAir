/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author Stephen
 */
// Aircraft class is optional!!
public class AirPlane extends Aircraft
{

    public AirPlane(String make, String model, int capacity, Pilot pilot) {
        super(make, model, capacity, pilot);
    }
    
   
  

    // String.Format:  Is this the correct format?? Make sure!!!
    @Override
    public String toString()
    {
        return String.format("Airplane Information: Aircraft: %s %s Capacity: %d seats, Pilot: %s", getMake(), getModel(), getCapacity(), getPilot().getFirstName());
        // return " Airplane Information: AirCraft: " + make + " " + model + ", Capacity: " + capacity + " seats, Pilot: " + pilot + '}';
    }
    
    
  
    
    
    
    
    
}

    
    
