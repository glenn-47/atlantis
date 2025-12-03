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

    private int progress = 0;
    private final int max = 3;//num of correct answers needed
    private final String saveFile = "burns_progress.txt";

    public void addProgress() {
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
        return (int) ((progress / (double) max) * 100);
    }

    //saving
    public void saveToFile(int phase) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(saveFile))) {
            writer.println(progress);
            writer.println(phase);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int loadPhase() {
        File file = new File(saveFile);
        if (!file.exists()) {
            return 1;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String p = reader.readLine();
            String ph = reader.readLine();

            if (p != null) {
                progress = Integer.parseInt(p.trim());
            }
            if (ph != null) {
                return Integer.parseInt(ph.trim());
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public void reset() {
        progress = 0;
        saveToFile(1);// reset phase to 1 as well
    }

}
