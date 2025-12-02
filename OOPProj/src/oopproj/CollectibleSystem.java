/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author mncrf
 */
public class CollectibleSystem {
    
    private ArrayList<JLabel> collectibles= new ArrayList<>();
    private HashMap<JLabel, String> labelNames;
    
    public CollectibleSystem() {
        this.collectibles=new ArrayList<>();
        this.labelNames=new HashMap<>();
    }
    
    public void createCollectible(JLabel label,String name){
        labelNames.put(label, name);
    
}
    public void collectCollectible(JLabel label){
        if(!collectibles.contains(label)){//if collectible isnt in the list, itll be added, making it set visble false
          collectibles.add(label);
        label.setVisible(false);
        
        String name= labelNames.get(label);
        JOptionPane.showMessageDialog(null,"You found: "+name);
        }
    
}

   public ArrayList<JLabel> getCollectedItems() {
        return new ArrayList<>(collectibles);//shows collected collectibles (inventory)
    }
    
    public int getCollectionCount() {
        return collectibles.size();//counts how many collectibles collected
    }
    
    public boolean isCollected(JLabel label) {
        return collectibles.contains(label);//checks if collectible is collected
    }
    
    public String getLabelName(JLabel label) {
        return labelNames.get(label);//gets name of the collectible
    }
    
    public void resetCollectibles() {
        for (JLabel label : collectibles) {//allows the user to collect the collectibles again while reseting the list
            label.setVisible(true);
        }
        collectibles.clear();
    }
    

   
    
    
    
}
