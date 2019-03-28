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
      
       
       public Feature(View view , String ItemName){
      
       this.ItemName = ItemName;
       
       this.view = view;
   }
       
     public void RenderView(){
         view.RenderView();
     };
    
     public String GetName(){
        return ItemName;
     }
}
