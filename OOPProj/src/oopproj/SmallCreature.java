/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

/**
 *
 * @author glenn
 */

public class SmallCreature extends Creature {
    private String diet;

    public SmallCreature(String name, String desc, String path, String diet) {
        super(name, desc, path);
        this.diet = diet;
    }

    @Override
    public String getStats() {
        return "DIET TYPE: " + diet;
    }
}
