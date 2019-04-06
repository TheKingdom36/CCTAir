/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Input.IntegerAsker;
import Input.StringAsker;
import Controllers.FlightController;
import java.util.ArrayList;


/**
 *
 * @author Daniel Murphy
 */
public abstract class View {

    protected String name;
    protected StringAsker StringAsker = new StringAsker(System.in,System.out);
    protected IntegerAsker IntegerAsker = new IntegerAsker(System.in,System.out);
    
    protected FlightController controller;
    public abstract void RenderView();
    
    public <T> void PrintList(ArrayList<T> items){
        for(int i=0; i<items.size();i++){
            System.out.println(i+1 + ". " +items.get(i).toString());
        }
    }
    
    public <T> void PrintList(T[] items){
        for(int i=0; i<items.length;i++){
            System.out.println(i+1 + ". " +items[i].toString());
        }
    }
   
}
