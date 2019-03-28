/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Daniel Murphy
 */
public class FeatureMenu {
    ArrayList<Feature> menuItems;
    
    Scanner kboard = new Scanner(System.in);
    public FeatureMenu(){
        menuItems = new ArrayList<Feature>();
   
    }
    
   
    public void AddItem(Feature menuItem){
        menuItems.add(menuItem);
    }
    
   
    public void RemoveItem(Feature menuItem){
        menuItems.remove(menuItem);
       
    }
    
    
    public void RenderView(){
        for(int i=0; i< this.menuItems.size();i++){
            
            System.out.print(i+1 + ". ");
            System.out.println(this.menuItems.get(i).GetName());
        }
        
        HandleInput(kboard.nextInt());
        
    }
    
    private void HandleInput(int value){
    
        int MenuItemPos = value - 1; //Accessing an arrayList which starts at 0 
        
        if(MenuItemPos < this.menuItems.size()){
              menuItems.get(MenuItemPos).RenderView();
        }
    }
    
}
