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
 * @author Stephen Gregan
 */
public class ScheduleFlightView extends View
{

    // Declare two variables(userArrivalTime and userDepartureTime)
    String userArrivalTime ;
    String userDepartureTime ;

    // ScheduleFlightView Constructor
    public ScheduleFlightView(FlightController controller)
    {
        this.controller = controller;
    }

    @Override
    public void RenderView()
    {
        // Set up an ArrayList of type "Flight" called "flights"
        ArrayList<Flight> flights = controller.FindFlights(StringAsker.ask("\nWhat is ORIGIN of the FLIGHT you would like to schedule: "));
        
        // Declare and initialize a boolean called "isValid"
        boolean isValid = false;

        // Check if the flights ArrayList is empty.
        if (flights.isEmpty())
        {
            // Print this out if flights is empty.
            System.out.print("\nUnfortunatly there are no flights with your selected origin.\n\n");

        } else
        {
            // Display all flights.
            this.PrintList(flights);
            System.out.println("Choose the flight you wish to schedule: ");
            // Get a valid int from the user
            Flight FlightToBeScheduled = flights.get(GetValidInt(1, flights.size()) - 1);
            System.out.println("\nWould you like to Schedule Arrival Time only OR both Arrival Time and Departure Time");
            
            // Assign "isValid" false
            isValid = false;
            
            // Declare a variable of type int called "valueUser".
            int valueUser;

            OUTER:
            do
            {
                valueUser = IntegerAsker.ask("\nPlease enter either 1 for Arrival Time only or "
                        + "please enter 2 for Arrival Time and Departure Time: ");
                System.out.println();

                switch (valueUser)
                {
                    case 1:
                        System.out.println("Select the hour and minutes for your Arrival Time: ");
                        // Call the "GetValidInt" method twice to validate the users input.
                        userArrivalTime = GetValidInt(00, 23) + ":" + GetValidInt(00, 59);
                        
                        // Pass in "arrivalTime" to the Schedule 
                        // method that takes in one parameter.
                        FlightToBeScheduled.Schedule(userArrivalTime);
                        
                        // Display the users choice.
                        System.out.println("You have chosen: " + userArrivalTime + ":00 for your Arrival Time.\n");
                        System.out.println();
                        
                        // Set "isValid" to true
                        isValid = true;
                        break OUTER;
                    case 2:
                        System.out.println("Select the hour and minutes for your Arrival Time\n");
                        
                        // Call the "GetValidInt" twice to validate the users input.
                        userArrivalTime = GetValidInt(00, 23) + ":" + GetValidInt(00, 59);

                        System.out.println("\nSelect the hour and minutes for your Departure Time");
                        System.out.println("");
                        
                        // Call the "GetValidInt" twice to validate the users input.
                        userDepartureTime = GetValidInt(00, 23) + ":" + GetValidInt(00, 59);
                        
                        // Pass "userArrivalTime" and "userDepartureTime" to the "Schedule" method
                        // that takes in two parameters.
                        FlightToBeScheduled.Schedule(userArrivalTime, userDepartureTime);
                        
                        // Display the users choices.
                        System.out.println("\nYou have chosen: " + userArrivalTime + ":00 for your Arrival "
                                + "Time and " + userDepartureTime + ":00 for your Departure Time.\n");
                        System.out.println();
                        
                        // Set "isValid" to "true"
                        isValid = true;
                        break OUTER;
                    default:
                        // if no other cases are meet specifications, get the user to try again.
                        System.out.println("You entered an incorrect value, please try again.");
                        break;
                }
            } while (isValid == false);
        }
    }
}
