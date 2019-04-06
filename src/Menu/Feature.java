/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;


import Views.View;
/**
 *
 * @author Daniel Murphy
 */
public class Feature {
  
    protected String ItemName;
    protected View view;
    public boolean IsActive;
       
    public Feature(View view , String ItemName){
       this.ItemName = ItemName;
       this.view = view;
   }
       
    /**
     *Generates the view associated with the feature
     */
    public void RenderView(){
         view.RenderView();
    };
    
    /**
     *Returns the name of the feature
     * 
     * @return A string which is the name of the feature 
     */
    public String GetName(){
        
        return ItemName;
    }
}
