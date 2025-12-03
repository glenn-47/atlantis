/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

import java.util.ArrayList;

public class OilProgress {

    public static void TreatmentProcess(ArrayList<String> waterTreatment, javax.swing.JProgressBar progressBar) {
        int count = 0;
        System.out.println("Oil tiles cleaned:");

        if (waterTreatment.isEmpty()) {
            System.out.println("No oil tiles have been treated yet.");
        } else {

            for (String treated : waterTreatment) {
                if ("oilTile".equals(treated)) {
                    count++;
                    System.out.println("number" + count);
                }
            }
        }
        //update the progress bar
        progressBar.setValue(count);
    }
}
