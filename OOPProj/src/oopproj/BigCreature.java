/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

/**
 *
 * @author glenn
 */

public class BigCreature extends Creature {
    private double length;

    public BigCreature(String name, String desc, String path, double length) {
        super(name, desc, path);
        this.length = length;
    }

    @Override
    public String getStats() {
        return "SIZE CLASS: GIANT (" + length + " meters long)";
    }
}
