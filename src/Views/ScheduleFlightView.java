/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Controllers.FlightController;
import Input.StringAsker;
/**
 *
 * @author Daniel Murphy
 */
public class ScheduleFlightView extends View {
    
    public ScheduleFlightView(FlightController controller){
        this.controller = controller;
    }
    
    public void RenderView(){
       StringAsker stringAsker = new StringAsker(System.in,System.out);
       System.out.println("//////////////////////////////////////////////////////////////////////////");
       //User eneter flight id 
      
       //find flight which needs to be updated
       
       //allow the user to update the arrival or arrival and departure time 
       
            //Option 1 
                //ask user for new arrival Time
                
       
       
            //Option 2
                //ask user for new arrival time
                //askuser for new departture time
                
       
    }
}
