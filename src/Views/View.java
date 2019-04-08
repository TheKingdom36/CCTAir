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
    
    /**
     * Return an int inputed by the user which is within the range
     * MinValue-MaxValue
     *
     * @param MinValue the minimum value of a valid int
     * @param MaxValue the maximum value of a valid int
     */
    protected int GetValidInt(int MinValue, int MaxValue)
    {
        int EnteredValue = MinValue;
        String message = "\nEnter a value between " + MinValue + " and " + MaxValue + " below\n\nEnter number: ";
        do
        {
            if (EnteredValue > MaxValue)
            {
                message = "Invalid value, Entered value is too high";
            } else if (EnteredValue < MinValue)
            {
                message = "Invalid value, Entered value is too low";
            }
            EnteredValue = IntegerAsker.ask(message);
        } while (EnteredValue > MaxValue || EnteredValue < MinValue);

        return EnteredValue;
    }
   
}
