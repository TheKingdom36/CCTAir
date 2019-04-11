/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Abraham Ehuiaka
 */
public class User
{

    private String name;
    private String id;
    private int numOfFlightsEntered = 0;

    public User(String name, String id)
    {
        this.name = name;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public int getNumberOfFlightsEntered()
    {
        return this.numOfFlightsEntered;
    }

    public void IncreaseNumberOfFlightsEntered()
    {
        numOfFlightsEntered++;
    }
}
