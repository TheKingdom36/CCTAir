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
public class DataStore {
    
    
    public String[] DaysOfTheWeek = {"Monday","Tuesday","Wedesday","Thursday","Friday","Saturday","Sunday"};
    
    public String[] Months = {"January", "February", "March", "April","May", "June","July", "August",
                               "September","October", "November","December"};
    
    public HashMap<String,Integer> NumDaysPerMonth = new HashMap<>();
    
    public DataStore(){
        NumDaysPerMonth.put("January", 30);
         NumDaysPerMonth.put("February", 30);
          NumDaysPerMonth.put("March", 30);
           NumDaysPerMonth.put("April", 30);
            NumDaysPerMonth.put("May", 30);
             NumDaysPerMonth.put("June", 30);
              NumDaysPerMonth.put("July", 30);
               NumDaysPerMonth.put("August", 30);
                NumDaysPerMonth.put("September", 30);
                 NumDaysPerMonth.put("October", 30);
                  NumDaysPerMonth.put("November", 30);
                    NumDaysPerMonth.put("December", 30);
        
    
    }
    
    
    
}
