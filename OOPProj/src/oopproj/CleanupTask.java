/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Abdallah haouit
 */
package oopproj;

public class CleanupTask {

    // Stores task details
    protected int id;
    protected String location;
    protected String wasteType;
    protected String difficulty;
    protected boolean done;

    public CleanupTask(int id, String location, String wasteType, String difficulty) {
        
        this.id = id;
        this.location = location;
        this.wasteType = wasteType;
        this.difficulty = difficulty;
        this.done = false;
    }

    public int getId() { return id; }
    public String getLocation() { return location; }
    public String getWasteType() { return wasteType; }
    public String getDifficulty() { return difficulty; }
    public boolean isDone() { return done; }

    public void markDone() { 
        this.done = true; // Mark the task as finished
    }

    public String getCategory() {
        return "Standard beach cleanup task."; // Returns the default category
    }
}
