/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

/**
 *
 * @author glenn
 */

public abstract class Creature {
    protected String name;
    protected String description;
    protected String imagePath;

    public Creature(String name, String description, String imagePath) {
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getImagePath() { return imagePath; }

    // This is the abstract method that forces the children to behave differently
    public abstract String getStats(); 
}