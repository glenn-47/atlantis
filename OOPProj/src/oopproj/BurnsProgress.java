/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

import java.io.*;

/**
 *
 * @author Andrew
 */
public class BurnsProgress {

    private int progress = 0; //current progress
    private final int max = 3;//num of correct answers needed
    private final String saveFile = "burns_progress.txt"; //save file name

    public void addProgress() { //adds progress less than the max
        if (progress < max) {
            progress++;
        }
    }

    public int getProgress() {
        return progress;
    }

    public int getMax() {
        return max;
    }

    public int getPercentage() { 
        return (int) ((progress / (double) max) * 100); //calculates percentage
    }

    //saving
    public void saveToFile(int phase) { //saves both the progress value and phase value
        try (PrintWriter writer = new PrintWriter(new FileWriter(saveFile))) {
            writer.println(progress);
            writer.println(phase);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int loadPhase() { //checks if we have a file, if not then start at zero
        File file = new File(saveFile);
        if (!file.exists()) {
            return 1;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String p = reader.readLine();   //reads the first line which is progres, makes that String p
            String ph = reader.readLine();  //reads second line makes that String ph, for phase.

            if (p != null) {
                progress = Integer.parseInt(p.trim());  //basically if progress value exists, turn it to an int
            }                                           //trim to remove spaces
            if (ph != null) {                           //same as above for phase
                return Integer.parseInt(ph.trim());
            }

        } catch (IOException | NumberFormatException e) {   //for errors
            e.printStackTrace();                            
        }
        return 1;
    }

    public void reset() {
        progress = 0;   //resets progress to 0
        saveToFile(1);// reset phase to 1 as well [in the savetofile method]
    }

}
