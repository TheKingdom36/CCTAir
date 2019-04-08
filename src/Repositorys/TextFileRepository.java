/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;

import java.util.ArrayList;
 
/**
 *
 * @author Daniel Murphy
 * 
 */
public abstract class TextFileRepository<T> implements IRepository<T>{
    ArrayList<T> items;
    protected String FilePath;
    public TextFileRepository(){
        items = new ArrayList<>();
        
    }
   
/**
 * Adds an item to the Repository                         
 * @param item The item which will be added to the Repository 
 */
    @Override
    public void AddItem(T item){
        items.add(item);
    }
    
/**
 * Removes an item from the Repository                         
 * @param item The item which will be added to the Repository 
 */
    @Override
    public void RemoveItem(T item){
        items.remove(item);
    }
    
    
/**
 *Returns an arrayList with all items in the repository
 * @return items The items within the repository
 */
    @Override
    public ArrayList<T> GetList(){
        return items;
    }

    protected  void CreateFromFile(String fileName){
        //do nothing
    };
    
    protected void CreateFromFiles(String[] fileNames){
        //do nothing
    };
    
    
    
    
}
