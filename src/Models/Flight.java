/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Scanner;

/**
 *
 * @author Stephen
 */
public class Flight
{
    private String origin;
    private String destination;
    private String  departureTime;
    private String arrivalTime;
    private String dateOfFlight;
    private AirPlane aircraftAssigned;
    
    public Flight()
    {
    
    }

    public Flight(String origin, String destination, String dateOfFlight, AirPlane aircraftAssigned)
    {
        this.origin = origin;
        this.destination = destination;
        this.dateOfFlight = dateOfFlight;
        this.aircraftAssigned = aircraftAssigned;
    }

    public Flight(String origin, String destination, String departureTime, String arrivalTime, String dateOfFlight, AirPlane aircraftAssigned)
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

    public AirPlane getAircraftAssigned()
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

    public void setArrivalTime(String arrivalTime)
    {
        this.arrivalTime = arrivalTime;
    }

    public void setDateOfFlight(String dateOfFlight)
    {
        this.dateOfFlight = dateOfFlight;
    }

    public void setAircraftAssigned(AirPlane aircraftAssigned)
    {
        this.aircraftAssigned = aircraftAssigned;
    }
    
    public void Schedule(String arrivalTIme)
    {
    
    }
    
    public void Schedule(String arrivalTime, String departureTime)
    {
        
    }
    
    public void UserAddFlight()
    {
        boolean isTrue = false;
        String[] locationsArray = new String[10];
        locationsArray[0] = "Dublin";
        locationsArray[1] = "London";
        locationsArray[2] = "Paris";
        locationsArray[3] = "Spain";
        locationsArray[4] = "Egypt";
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please add a flight below:\n ");
        do
        {
            for(String n : locationsArray)
            {
                if(n.equalsIgnoreCase(userInput.nextLine()))
                {
                    System.out.println("Vaild input");
                    //isTrue = false;
                    continue;
                }
                System.out.println("Invalid input");
                break;
            }
             
        }
        while(isTrue = true);
        
//        String userOrigin = userInput.nextLine();
//        do
//        {
//            for (String locationsArray1 : locationsArray)
//            {
//                if (userOrigin.equalsIgnoreCase(locationsArray1))
//                {
//                    System.out.println("Good");
//                    System.out.printf("You have chosen '%s' as the origin\n", userOrigin);
//                    continue;
//                } else
//                {
//                    System.out.println("Bad");
//                }
//            }
//            break;
//        }
//       
//        while(isTrue == false);
        
        
    }

    @Override
    public String toString()
    {
        return String.format("Flight Information:\nDate: %s\nFrom: "
                + "%s\nto: %s\nDeparture Time: %s\narrival time: %s\nPlane "
                + "Information: Aircraft: %s %s Capacity: %s seats Pilot: First "
                + "Name: %s Surname: %s Age: %d Rank: %s", dateOfFlight, 
                origin, destination, departureTime, arrivalTime, 
                aircraftAssigned.getMake(), aircraftAssigned.getModel(), 
                aircraftAssigned.getCapacity(), aircraftAssigned.getPilot().getFirstName(),
                aircraftAssigned.getPilot().getSurname(), aircraftAssigned.getPilot().getAge(),
                aircraftAssigned.getPilot().getRank());
    }
    
    
    
    
    
    
    
}
