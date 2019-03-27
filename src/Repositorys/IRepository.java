/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorys;

/**
 *
 * @author Daniel Murphy
 */
public interface IRepository<T> {
    void AddItem(T t);
    void RemoveItem(T t);
    void UpdateItem(String id ,T t);
    void CommitToFile();
}
