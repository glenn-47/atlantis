/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

/**
 *
 * @author mncrf
 */
public class CollectibleInfo {
    
    private String name;
    private String description;
    private String location;
    
    public CollectibleInfo(String name, String description, String location) {
        this.name = name;
        this.description = description;
        this.location = location;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getLocation() {
        return location;
    }
    
    public String getFullInfo() {
        return name + " - " + description;
    }
}
