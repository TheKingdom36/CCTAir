/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.FlightController;

/**
 *
 * @author Daniel Murphy
 */
public class ListFlightsView extends View
{

    // ListFlightsView Constructor
    public ListFlightsView(FlightController controller)
    {
        this.controller = controller;
    }

    @Override
    public void RenderView()
    {
        // State the total number of flights available
        System.out.println("Total number of flights: " + controller.GetFlights().size() + "\n");
        // Return all the available flights.
        for (int i = 0; i < controller.GetFlights().size(); i++)
        {
            // Print them out e.g 1. Flight 1, 2. Flight 2 etc...
            System.out.println(i + 1 + ". " + controller.GetFlights().get(i).toString());
        }
    }
}
