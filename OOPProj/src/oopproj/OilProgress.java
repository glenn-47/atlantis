/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

import java.util.ArrayList;
import javax.swing.JProgressBar;


public class OilProgress {

    public static void TreatmentProcess(ArrayList<String> waterTreatment, JProgressBar progressBar) {
        //references array and progress bar
        int count = 0; 
        System.out.println("Oil tiles cleaned:");

        if (waterTreatment.isEmpty()) {
            System.out.println("No oil tiles have been treated yet.");
        } else {

            for (String treated : waterTreatment) {
                if ("oilTile".equals(treated)) {
                    count++;
                    System.out.println("number" + count);
                    //for every oil tile it finds in array, add one to counter
                }
            }
        }
        //update the progress bar
        progressBar.setValue(count);
    }
}
