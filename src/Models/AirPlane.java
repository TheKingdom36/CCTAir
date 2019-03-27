/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Stephen
 */
public class AirPlane
{
    private String make;
    private int model;
    private int capacity;
    private Pilot pilot;
    
    public AirPlane()
    {}
    
    public AirPlane(String make, int model, int capacity, Pilot pilot)
    {
        this.make       = make;
        this.model      = model;
        this.capacity   = capacity;
        this.pilot      = pilot;
    }

    public String getMake()
    {
        return make;
    }

    public int getModel()
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

    public void setModel(int model)
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
    
    public Pilot AssignPilot(Pilot pilot)
    {
        return pilot;
    }

    @Override
    public String toString()
    {
        return String.format("Airplane Information: Aircraft: %s %s Capacity: %d seats, Pilot: %s", make, model, capacity, pilot);
        // return " Airplane Information: AirCraft: " + make + " " + model + ", Capacity: " + capacity + " seats, Pilot: " + pilot + '}';
    }
    
}
  
    
    
    
    
