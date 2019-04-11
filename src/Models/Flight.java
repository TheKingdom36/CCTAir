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
public class Flight
{

    // Declaring multiple variables
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String dateOfFlight;
    private Aircraft aircraftAssigned;

    // Flight Constructor that takes not arguments
    public Flight()
    {

    }

    // Flight Constructor that takes in origin, destination, dateOfFlight and aircraftAssigned as arguments.
    public Flight(String origin, String destination, String dateOfFlight, Aircraft aircraftAssigned)
    {
        this.origin = origin;
        this.destination = destination;
        this.dateOfFlight = dateOfFlight;
        this.aircraftAssigned = aircraftAssigned;
    }

    // Flight constructor that takes in all arguments.
    public Flight(String origin, String destination, String departureTime, String arrivalTime, String dateOfFlight, Aircraft aircraftAssigned)
    {
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.dateOfFlight = dateOfFlight;
        this.aircraftAssigned = aircraftAssigned;
    }

    public String getOrigin()
    {
        return origin;
    }

    public String getDestination()
    {
        return destination;
    }

    public String getDepartureTime()
    {
        return departureTime;
    }

    public String getArrivalTime()
    {
        return arrivalTime;
    }

    public String getDateOfFlight()
    {
        return dateOfFlight;
    }

    public Aircraft getAircraftAssigned()
    {
        return aircraftAssigned;
    }

    public void setOrigin(String origin)
    {
        this.origin = origin;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime)
    {
        this.departureTime = departureTime;
    }

    public void setDateOfFlight(String dateOfFlight)
    {
        this.dateOfFlight = dateOfFlight;
    }

    public void setAircraftAssigned(Aircraft aircraftAssigned)
    {
        this.aircraftAssigned = aircraftAssigned;
    }

    public void Schedule(String arrivalTime)
    {
        this.arrivalTime = arrivalTime;
    }

    public void Schedule(String arrivalTime, String departureTime)
    {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    /**
     * Returns details of the aircraft as a string
     *
     * @return
     */
    @Override
    public String toString()
    {
        return String.format("\nFlight Information:\nDate: %s\nFrom: "
                + "%s\nto: %s\nDeparture Time: %s\narrival time: %s\nPlane "
                + "Information: Aircraft: %s %s Capacity: %s seats Pilot: First "
                + "Name: %s Surname: %s Age: %d Rank: %s\n", dateOfFlight,
                origin, destination, departureTime, arrivalTime,
                aircraftAssigned.getMake(), aircraftAssigned.getModel(),
                aircraftAssigned.getCapacity(), aircraftAssigned.getPilot().getFirstName(),
                aircraftAssigned.getPilot().getSurname(), aircraftAssigned.getPilot().getAge(),
                aircraftAssigned.getPilot().getRank());
    }
}
