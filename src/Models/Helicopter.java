/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author Stephen
 */
public class Helicopter extends Aircraft
{
    @SerializedName("helicopters")
    @Expose
    private List<Helicopter> helicopters = null;
    
    public List<Helicopter> getHelicopters()
    {
        return helicopters;
    }
    
    public void setHelicopters(List<Helicopter> helicopters)
    {
        this.helicopters = helicopters;
    }
}

