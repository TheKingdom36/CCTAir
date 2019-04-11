/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;

import java.util.HashMap;

/**
 *
 * @author Daniel Murphy
 */
public class DataStore
{

    public String[] DaysOfTheWeek =
    {
        "Monday", "Tuesday", "Wedesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    public String[] Months =
    {
        "January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"
    };

    public HashMap<String, Integer> NumDaysPerMonth = new HashMap<>();

    public String[] Year =
    {
        "2019", "2020", "2021"
    };

    public String[] locations =
    {
        "Dublin", "London", "Paris", "Rome", "Berlin", "Prague", "Lisbon", "Vienna"
    };

    public DataStore()
    {
        NumDaysPerMonth.put("January", 31);
        NumDaysPerMonth.put("February", 30);
        NumDaysPerMonth.put("March", 31);
        NumDaysPerMonth.put("April", 30);
        NumDaysPerMonth.put("May", 31);
        NumDaysPerMonth.put("June", 30);
        NumDaysPerMonth.put("July", 31);
        NumDaysPerMonth.put("August", 31);
        NumDaysPerMonth.put("September", 30);
        NumDaysPerMonth.put("October", 31);
        NumDaysPerMonth.put("November", 30);
        NumDaysPerMonth.put("December", 31);
    }
}
