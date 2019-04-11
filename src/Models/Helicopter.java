/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 * @author Stephen
 */
public class Helicopter extends Aircraft
{

    // Helicopter Constructor
    public Helicopter(String make, String model, int capacity, Pilot pilot)
    {
        super(make, model, capacity, pilot);
    }

    /**
     * Returns details of the aircraft as a string
     *
     * @return
     */
    @Override
    public String toString()
    {
        return String.format("Helicopter Information: Helicopter: %s %s Capacity: %d seats, Pilot: %s", getMake(), getModel(), getCapacity(), getPilot().getFirstName() + " " + getPilot().getSurname());
    }
}
