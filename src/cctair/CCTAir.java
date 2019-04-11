/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import Menu.*;
import Models.*;
import Repositorys.*;
import Controllers.FlightController;
import Views.*;

/**
 *
 * @author Daniel Murphy
 */
public class CCTAir
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        User user = new User("Mark", "001");

        FeatureMenu menu = new FeatureMenu();

        //Create from file
        IRepository<Flight> flightRepository = new FlightRepository(new String[]
        {
            "flights.json"
        });
        IRepository<Pilot> pilotRepository = new PilotRepository(new String[]
        {
            "pilots.json"
        });
        IRepository<Aircraft> aircraftRepository = new AircraftRepository(new String[]
        {
            "airplanes.json", "helicopters.json"
        });

        FlightController flightController = new FlightController(flightRepository, aircraftRepository, pilotRepository);

        menu.AddItem(new Feature(new CreateFlightView(flightController, user), "Create Flight"));
        menu.AddItem(new Feature(new ScheduleFlightView(flightController), "Schedule Flight"));
        menu.AddItem(new Feature(new ListFlightsView(flightController), "List Flights"));

        do
        {
            System.out.println("//////////////////////////////////////////////////////////////////////////\n");
            System.out.println("Welcome to CCTAir!\n");
            menu.RenderView();
        } while (true);
    }
}
