/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import Controllers.ScheduleFlightController;
import Views.IView;
import Views.ScheduleFlightView;
import Repositorys.IRepository;
import Models.Flight;
/**
 *
 * @author Daniel Murphy
 */
public class ScheduleFlightFeature implements IFeature {

   private String ItemName = "ScheduleFlight";
   private ScheduleFlightController controller;
   private IView view;
           
   public ScheduleFlightFeature(IRepository<Flight> repo){
      
       this.controller = new ScheduleFlightController(repo);
       view = new ScheduleFlightView(this.controller);
   }
    @Override
    public void RenderView(){
       view.RenderView();
    }

    @Override
    public String GetName() {
        return ItemName;
    }
    
}
