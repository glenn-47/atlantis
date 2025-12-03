/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

/**
 * Abstract Parent Class
 * Blueprint for all deep sea creatures
 * @author glenn
 */

public abstract class Creature {
    
    // Variables
    protected String name;
    protected String description;
    protected String imagePath;
    
    // Constructor
    public Creature(String name, String description, String imagePath) {
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
    }
    
    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getImagePath() { return imagePath; }

    public abstract String getStats(); 
}