/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.FlightController;
import Models.Flight;
import java.util.ArrayList;

/**
 *
 * @author Daniel Murphy
 */
public class ScheduleFlightView extends View
{

    public ScheduleFlightView(FlightController controller)
    {
        this.controller = controller;
    }

    @Override
    public void RenderView()
    {
        System.out.println("\n//////////////////////////////////////////////////////////////////////////\n");
        ArrayList<Flight> flights = controller.FindFlights(StringAsker.ask("What is ORIGIN of the FLIGHT you would like to schedule: "));

        boolean isValid = false;
        //Flight FlightToBeScheduled = flights.get(IntegerAsker.ask("\nChoose the flight you wish to schedule: ") - 1);

        if (flights.isEmpty())
        {
            System.out.print("\nUnfortunatly there are no flights with you specificed origin.\n");

        } else
        {
            this.PrintList(flights);
            //Flight FlightToBeScheduled = flights.get(IntegerAsker.ask("\nChoose the flight you wish to schedule: ") - 1);
            System.out.println("Choose the flight you wish to schedule: ");
            Flight FlightToBeScheduled = flights.get(GetValidInt(1, flights.size()) - 1);
            System.out.println("\nWould you like to Schedule Arrival Time only OR both Arrival Time and Departure Time\n");

            isValid = false;
            int valueUser;

            OUTER:
            do
            {
                valueUser = IntegerAsker.ask("Please enter either 1 for Arrival Time only or please enter 2 for Arrival Time and Departure Time: ");
                String userArrivalTime;
                String userDepartureTime;

                switch (valueUser)
                {
                    case 1:
                        System.out.println("Select the hour and minutes for your Arrival Time: ");
                        userArrivalTime = GetValidInt(00, 23) + ":" + GetValidInt(00, 59);

                        FlightToBeScheduled.Schedule(userArrivalTime);

                        System.out.println("You have chosen: " + userArrivalTime + ":00 for your Arrival Time.\n");

                        isValid = true;
                        break OUTER;
                    case 2:
                        System.out.println("Select the hour and minutes for your Arrival Time: ");
                        userArrivalTime = GetValidInt(00, 23) + ":" + GetValidInt(00, 59);
                        System.out.println("Select the hour and minutes for your Departure Time: ");
                        userDepartureTime = GetValidInt(00, 23) + ":" + GetValidInt(00, 59);
                        FlightToBeScheduled.Schedule(userArrivalTime, userDepartureTime);
                        System.out.println("You have chosen: " + userArrivalTime + ":00 for your Arrival Time and " + userDepartureTime + ":00 for your Departure Time.\n");
                        isValid = true;
                        break OUTER;
                    default:
                        System.out.println("You entered an incorrect value, please try again.");
                        break;
                }
            } while (isValid == false);
        }
    }
}
