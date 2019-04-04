/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Input.IntegerAsker;
import Input.StringAsker;
import Controllers.FlightController;


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
   
}
