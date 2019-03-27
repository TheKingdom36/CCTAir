/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;
import Menu.*;
import Models.Flight;
import Repositorys.*;

/**
 *
 * @author Daniel Murphy
 */
public class CCTAir {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FeatureMenu menu = new FeatureMenu();
        IRepository<Flight> FlightRepository = new FlightsRepository() ;
        
        menu.AddItem(new CreateFlightFeature(FlightRepository));
        menu.AddItem(new ScheduleFlightFeature(FlightRepository));
        do{
             menu.RenderView();
        }while(true);
       
    }
    
}
