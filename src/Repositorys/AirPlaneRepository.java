/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;
import java.util.ArrayList;
import Models.AirPlane;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
/**
 *
 * @author Daniel Murphy
 */
public class AirPlaneRepository extends TextFileRepository<AirPlane>{
    
    public void AirPlaneRepository()
    {
     this.items = new ArrayList<>(); 
    }
    
    public AirPlaneRepository(String path){
        this.items = new ArrayList<>(); 
        this.FilePath = path;
        CreateFromFile(this.FilePath);
    }
    
     @Override
    public void UpdateItem(String id, AirPlane item) {
    }
    
    
    @Override
    protected void CommitItemToFile(String path,AirPlane airplane){
        //TODO Figure out how to put items in file
    }
    
    @Override
    protected void CreateFromFile(String path){
        //TODO figure out how to read items from file
      
    }

    @Override
    protected void UpdateItemInFile(String path ,String id) {
   
    }

   
    
}
