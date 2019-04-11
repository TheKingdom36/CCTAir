/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Flight;
import Models.Aircraft;
import Models.Pilot;
import Repositorys.IRepository;
import java.util.ArrayList;

/**
 *
 * @author Daniel Murphy
 */
public class FlightController
{

    // IRepository is of type interface.
    // The below code takes in a Flight.
    IRepository<Flight> flights;
    // The below code takes in a Aircraft.
    IRepository<Aircraft> aircrafts;
    // The below code takes in a Pilot.
    IRepository<Pilot> pilots;

    // FlightController Constructor
    public FlightController(IRepository<Flight> flights, IRepository<Aircraft> aircrafts, IRepository<Pilot> pilots)
    {
        this.flights = flights;
        this.aircrafts = aircrafts;
        this.pilots = pilots;
    }

    /**
     * Returns an arrayList of all flights
     *
     * @return
     */
    public ArrayList<Flight> GetFlights()
    {
        return flights.GetList();
    }

    /**
     * Adds a flight to the flights repository if the flight is accepted
     *
     * @param flight The flight to be added to the repository
     *
     */
    public void AddFlight(Flight flight)
    {

        flights.AddItem(flight);
    }

    /**
     * Returns an ArrayList of flights which the flights origin matches the
     * String parameter
     *
     * @param Origin The origin of the requested flights
     * @return
     *
     */
    public ArrayList<Flight> FindFlights(String Origin)
    {
        ArrayList<Flight> MatchingFlights = new ArrayList<>();

        for (int i = 0; i < flights.GetList().size(); i++)
        {
            if (Origin.equals(flights.GetList().get(i).getOrigin()))
            {
                MatchingFlights.add(flights.GetList().get(i));
            }
        }
        return MatchingFlights;
    }

    /**
     * Returns an ArrayList of Aircrafts
     */
    public ArrayList<Aircraft> GetAircrafts()
    {
        return this.aircrafts.GetList();
    }

    /**
     * Returns an ArrayList of Pilots
     */
    public ArrayList<Pilot> GetPilots()
    {
        return this.pilots.GetList();
    }
}
