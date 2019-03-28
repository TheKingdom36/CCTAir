/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.FlightController;
import java.util.Scanner;

/**
 *
 * @author Daniel Murphy
 */
public abstract class View {
    protected FlightController controller;
    protected Scanner scanner = new Scanner(System.in);
    public abstract void RenderView();
   
}
