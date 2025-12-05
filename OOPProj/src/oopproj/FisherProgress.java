/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

import javax.swing.JProgressBar;

public class FisherProgress {

    // Method to update the progress bar
    public static void increaseBar(JProgressBar pBar, int persuaded) { //take the bar and variable values
        if (pBar != null) {
            pBar.setValue(persuaded);   //set value to be the persuasion value.
        }
    }
}
