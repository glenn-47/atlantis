/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

/**
 * Represents bigger deep sea creatures
 * Inheritance - extends the abstract creature class
 * @author glenn
 */

public class BigCreature extends Creature {
    
    // Variables
    private final double length;
    
    // Constructor - passes data to the super class
    public BigCreature(String name, String desc, String path, double length) {
        super(name, desc, path);
        this.length = length;
    }
    
    // Polymorphism - Overrides the abstract method
    @Override
    public String getStats() {
        return "SIZE CLASS: GIANT (" + length + " meters long)";
    }
}
