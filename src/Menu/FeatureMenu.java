/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import java.util.ArrayList;
import java.util.Scanner;
import Input.IntegerAsker;
/**
 *
 * @author Daniel Murphy
 */
public class FeatureMenu {
    ArrayList<Feature> menuItems;
    
    IntegerAsker integerAsker = new IntegerAsker(System.in,System.out);
    public FeatureMenu(){
        menuItems = new ArrayList<Feature>();
   
    }
    
   /**
    *Adds feature to the FeatureMenu
    * 
    * @param menuItem feature to be added to the FeatureMenu
    */
    public void AddItem(Feature menuItem){
        menuItems.add(menuItem);
    }
    
   /**
    *Removes feature from the FeatureMenu
    * 
    * @param menuItem feature to be removed from the FeatureMenu
    */
    public void RemoveItem(Feature menuItem){
        menuItems.remove(menuItem);
       
    }
    
    /**
     *Generates the view for the featureMenu
     */
    public void RenderView(){
        for(int i=0; i< this.menuItems.size();i++){
            
            System.out.print(i+1 + ". ");
            System.out.println(this.menuItems.get(i).GetName());
        }
        
        HandleInput(integerAsker.ask(""));
        
    }
    
    /**
     *Handles the user input for the feature menu
     * 
     * @param value user input 
     */
    private void HandleInput(int value){
    
        int MenuItemPos = value - 1; //Accessing an arrayList which starts at 0 
        
        if(MenuItemPos < this.menuItems.size()){
              menuItems.get(MenuItemPos).RenderView();
        }
    }
    
}
