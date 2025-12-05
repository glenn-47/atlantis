/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Abdallah haouit
 */
package oopproj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Progress {
    
    private String fileName;
    
    public Progress(String fileName) {
        this.fileName = fileName;
    }
    //creates save file which is named CollectiblesProgress
    public void saveCollectible(String collectibleName, String location) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(collectibleName + " collected in " + location);
            bw.newLine();
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    //rewrites the lines to blank and acts as a Progress delete 
    public void clearProgress() {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, false))) {
            bw.write("");
            JOptionPane.showMessageDialog(null, "Progress deleted Returning to main menu..");
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Error clearing file: " + e.getMessage());
        }
    }
}
