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
    public void AddItem(T item){
        items.add(item);
        CommitItemToFile(FilePath,item);
    }
    
/**
 * Removes an item from the Repository                         
 * @param item The item which will be added to the Repository 
 */
    public void RemoveItem(T item){
        items.remove(item);
    }
    
/**
 * Updates an item which is currently in the Repository                        
 * @param id  The id of the item to be updated
 * @param item  The updated item 
 */
    public abstract void UpdateItem(String id, T item);
    
/**
 *Returns an arrayList with all items in the repository
 * @return items The items within the repository
 */
    public ArrayList<T> GetList(){
        return items;
    }

    /**
     *Commits an item within the repository to a file
     * @param path  The file path of where the repository items are held
     * @parem item The item to be commited to a file
     */
    protected abstract void CommitItemToFile(String path,T item);
    
    /**
     *Takes in items from a file and adds them to the repository
     * @param path  The file path of where the repository items are to be held
     */
    protected abstract void CreateFromFile(String path);
    
    /**
     *Updates a single item within the repository
     * @param path The file path where the repository items are held
     * @param id  The id of the item to be updated 
     */
    protected abstract void UpdateItemInFile(String path ,String id); 
}
