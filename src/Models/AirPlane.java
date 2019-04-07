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
    @SerializedName("airplanes")
    @Expose
    private List<AirPlane> airplanes = null;

    public List<AirPlane> getAirplanes()
    {
        return airplanes;
    }

    public void setAirplanes(List<AirPlane> airplanes)
    {
        this.airplanes = airplanes;
    }


    // String.Format:  Is this the correct format?? Make sure!!!
    @Override
    public String toString()
    {
        return String.format("Airplane Information: Aircraft: %s %s Capacity: %d seats, Pilot: %s", getMake(), getModel(), getCapacity(), getPilot());
        // return " Airplane Information: AirCraft: " + make + " " + model + ", Capacity: " + capacity + " seats, Pilot: " + pilot + '}';
    }
    
    
  
    
    
    
    
    
}

    
    
