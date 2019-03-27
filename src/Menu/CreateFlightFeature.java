/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import Views.IView;
import Views.CreateFlightView;
import Repositorys.IRepository;
import Controllers.CreateFlightController;
import Models.Flight;

public class CreateFlightFeature implements IFeature {
    private String ItemName;
    private IView view;
    private CreateFlightController controller;
    
    
    public CreateFlightFeature(IRepository<Flight> repo){
        this.ItemName = "CreateFlight";
        controller = new CreateFlightController(repo);
        view = new CreateFlightView(controller);
    }
    
    public void RenderView(){
        view.RenderView();
    }
    
    public String GetName(){
        return this.ItemName; 
    }
    
    
}
