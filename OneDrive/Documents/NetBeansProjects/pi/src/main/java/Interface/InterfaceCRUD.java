/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import java.util.ArrayList;

/**
 *
 * @author azizh
 */
public interface InterfaceCRUD<T> {
    //Add
    void insert(T t);
    // Delete
    void delete(int id);
    // Update
    void update(T t);
    // Fetch ALL
    ArrayList<T> readAll();
    // Fetch by ID
    T readById(int id); 
    // Sort by nom column
    ArrayList<T> sortBy(String nom_column,String Asc_Dsc);
    
}
