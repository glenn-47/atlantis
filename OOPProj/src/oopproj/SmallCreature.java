/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

/**
 * Represents smaller deep sea creatures
 * Inheritance - extends the abstract creature class
 * @author glenn
 */

public class SmallCreature extends Creature {
    // Variables
    private final String diet;
    
    // Constructor - passes data to the super class
    public SmallCreature(String name, String desc, String path, String diet) {
        super(name, desc, path);
        this.diet = diet;
    }
    
    // Polymorphism - overrides the abstract method
    @Override
    public String getStats() {
        return "DIET TYPE: " + diet;
    }
}
