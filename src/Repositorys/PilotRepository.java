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
public class PilotRepository extends TextFileRepository<Pilot>{
    
    public void PilotRepository()
    {
     this.items = new ArrayList<>(); 
     
    }
    
    public PilotRepository(String path){
        this.items = new ArrayList<>(); 
        this.FilePath = path;
        CreateFromFile(FilePath);
    }
    
    @Override
    public void UpdateItem(String id, Pilot item) {
   
    }
    
     @Override
    protected void CommitItemToFile(String path , Pilot pilot){
        //TODO Figure out how to put items in file
    }
    
     @Override
     protected void CreateFromFile(String path){
        //TODO figure out how to read items from file
    }

    @Override
    protected void UpdateItemInFile(String path, String id) {
   
    }

    
    
}
