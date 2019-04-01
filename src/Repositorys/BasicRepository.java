/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;
import java.util.ArrayList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
 
/**
 *
 * @author Daniel Murphy
 */
public abstract class BasicRepository<T> implements IRepository<T>{
    ArrayList<T> items;
    
    public BasicRepository(){
        items = new ArrayList<>();
        
    }
   
    public void AddItem(T item){
        items.add(item);
    }
    
    public void RemoveItem(T item){
        items.remove(item);
    }
    
   
    public void UpdateItem(String id, T item){
    
    }
    
    
    public ArrayList<T> GetList(){
        return items;
    }
    
    public abstract void CommitToFile(String path);
}
