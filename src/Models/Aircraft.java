/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stephen
 */
public abstract class Aircraft
{
    private String      make;
    private String     model;
    private int     capacity;
    private Pilot      pilot;
    
   
    
    public Aircraft(String make, String model, int capacity, Pilot pilot)
    {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.pilot = pilot;
    }
    
     public Aircraft()
    {
    
    }
    
    public String getMake()
    {
        return make;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public int getCapacity()
    {
        return capacity;
    }
    
    public Pilot getPilot()
    {
        return pilot;
    }
    
    public void setMake(String make)
    {
        this.make = make;
    }
    
    public void setModel(String model)
    {
        this.model = model;
    }
    
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
    
    public void setPilot(Pilot pilot)
    {
        this.pilot = pilot;
    }

    @Override
    public String toString()
    {
        return "Aircraft{" + "make=" + make + ", model=" + model + ", capacity=" + capacity + ", pilot=" + pilot + '}';
    }
    
    
    
}

