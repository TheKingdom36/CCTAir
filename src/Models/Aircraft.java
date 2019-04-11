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
public abstract class Aircraft
{

    // Declaring multiple variables
    protected String make;
    protected String model;
    protected int capacity;
    protected Pilot pilot;

    public Aircraft(String make, String model, int capacity, Pilot pilot)
    {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.pilot = pilot;
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

    public void AssignPilot(Pilot pilot)
    {
        this.pilot = pilot;
    }

    /**
     * Returns details of the aircraft as a string
     * @return 
     */
    @Override
    public String toString()
    {
        return "Aircraft{" + "make=" + make + ", model=" + model + ", capacity=" + capacity + ", pilot=" + pilot.getFirstName() + " " + pilot.getSurname() + '}';
    }
}
