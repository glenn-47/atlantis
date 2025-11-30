/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;


import java.io.Serializable;

public class CleanupTask implements Serializable {

    private String location;
    private String wasteType;
    private String difficulty;
    private boolean completed;

    public CleanupTask(String location, String wasteType, String difficulty) {
        this.location = location;
        this.wasteType = wasteType;
        this.difficulty = difficulty;
        this.completed = false;
    }

    public String getLocation() {
        return location;
    }

    public String getWasteType() {
        return wasteType;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}