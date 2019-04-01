/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;
import java.util.ArrayList;
import Models.Pilot;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
/**
 *
 * @author Daniel Murphy
 */
public class PilotRepository extends BasicRepository<Pilot>{
    
    public void PilotRepository()
    {
     this.items = new ArrayList<>(); 
    }
    
    
    public void CommitToFile(String path){
        //TODO Figure out how to put items in file
    }
    
}
