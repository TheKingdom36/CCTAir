/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.FlightController;
import Models.Flight;
import Models.User;
import Repositorys.DataStore;

public class CreateFlightView extends View
{

    // Declare a user
    User user;

    int maxNumFlightsUserCanEnter = 5;

    public CreateFlightView(FlightController controller, User user)
    {
        this.controller = controller;

        this.user = user;

        this.name = "Create Flight";
    }

    /**
     * Generates the display for the view
     */
    @Override
    public void RenderView()
    {

        System.out.println("\n//////////////////////////////////////////////////////////////////////////\n");
        System.out.println(this.name);

        if (user.getNumberOfFlightsEntered() >= maxNumFlightsUserCanEnter)
        {
            System.out.println("You have enetered 5 flights already");
        } else
        {

            int MinFlightDay = 1;
            Flight flight = new Flight();

            System.out.println("\nSelect aircraft from menu.  You have the option of choosing either a airplane or a helicopter.\n");

            PrintList(controller.GetAircrafts());

            flight.setAircraftAssigned(controller.GetAircrafts().get(GetValidInt(1, controller.GetAircrafts().size()) - 1));

            PrintList(controller.GetPilots());

            flight.getAircraftAssigned().AssignPilot(controller.GetPilots().get(GetValidInt(1, controller.GetPilots().size()) - 1));

            DataStore dataStore = new DataStore();

            boolean isValid = false;

            String originalLocation;

            System.out.println("\nAvailable Locations: ");
            for (String location : dataStore.locations)
            {
                System.out.println(location);
            }

            do
            {
                originalLocation = StringAsker.ask("\nEnter ORIGIN of flight: ");
                for (String location : dataStore.locations)
                {
                    if (originalLocation.equalsIgnoreCase(location))
                    {

                        isValid = true;
                        break;
                    }
                }

            } while (isValid == false);

            flight.setOrigin(originalLocation);

            isValid = false;

            String destinationLocation;

            System.out.println("\nAvailable Locations: ");
            for (String location : dataStore.locations)
            {
                System.out.println(location);
            }

            do
            {
                destinationLocation = StringAsker.ask("\nEnter DESTINATION of flight: ");
                for (String location : dataStore.locations)
                {

                    if (destinationLocation.equalsIgnoreCase(originalLocation))
                    {
                        System.out.printf("\nYou cant fly from %s to %s.  Please select a valid destination.", originalLocation, destinationLocation);
                        System.out.println();
                        isValid = false;
                        break;
                    }

                    if (destinationLocation.equalsIgnoreCase(location))
                    {

                        isValid = true;
                        break;
                    }

                }
            } while (isValid == false);
            flight.setDestination(destinationLocation);

            String Date = "";

            System.out.println("\nEnter DATE of flight\n");

            PrintList(dataStore.Months);
            System.out.println("\nPlease select a number that represents the corrisponding month below ");
            Date += (dataStore.Months[GetValidInt(MinFlightDay, dataStore.Months.length) - 1]);

            System.out.print("\nPlease select a number that represents the corrisponding day below \n");
            Date += ("/" + GetValidInt(MinFlightDay, dataStore.NumDaysPerMonth.get(Date)) + "/");

            System.out.println();
            PrintList(dataStore.Year);

            System.out.println("\nPlease select a number that represents the corrisponding year below ");

            Date += (dataStore.Year[GetValidInt(MinFlightDay, dataStore.Year.length) - 1]);

            flight.setDateOfFlight(Date);

            System.out.println("One moment as we validate your entered flight");

            controller.AddFlight(flight);
            user.IncreaseNumberOfFlightsEntered();

            System.out.println("Your flight has been recorded\n");
        }
    }
}
