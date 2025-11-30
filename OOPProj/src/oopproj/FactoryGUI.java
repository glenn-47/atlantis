/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oopproj;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrew
 */
public class FactoryGUI extends javax.swing.JFrame {

    BurnsProgress burnsTracker = new BurnsProgress();

    int choice = 0;
    int phase = 0;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FactoryGUI.class.getName());

    /**
     * Creates new form FactoryGUI
     */
    public FactoryGUI() {
        initComponents();
        //resetLvl();
        burnsTracker = new BurnsProgress();
        phase = burnsTracker.loadPhase();
        pBar.setValue(burnsTracker.getPercentage());

        setupInitialView();
        restoreDialogueState();

    }

    private void restoreDialogueState() {
        switch (phase) { //Very useful switch which looks at my phase num and executes the case equal to it i like this
            case 1 ->
                Decisions1(0);
            case 2 ->
                Decisions2(0);
            case 3 ->
                Decisions3(0);
            case 4 ->
                Decisions4(0);
            case 5 ->
                Decisions5(0);
        }
    }

    private void setupInitialView() {
        dialog1BTN.setVisible(true);
        dialog2BTN.setVisible(true);
        dialog3BTN.setVisible(true);
        proceedBTN.setVisible(false);
        dialog1BTN.setText("A chance for you to avoid potential public uproar!");
        dialog2BTN.setText("To remind you you're really old.");
        dialog3BTN.setText("For help in saving our marine creatures and the natural beauty of our oceans!");

        BurnsSpeachTXTAREA.setEditable(false);
        BurnsSpeachTXTAREA.setText("What is it now peasant?\nWhat have you come to bore me to death about now?");

        choice = 0;
        phase = 1;
    }

    private void resetLvl() {
        phase = 1;
        burnsTracker = new BurnsProgress();
        burnsTracker.saveToFile(phase);  //saves progress=0 and phase=1
        pBar.setValue(0);

        dialog1BTN.setVisible(true);
        dialog2BTN.setVisible(true);
        dialog3BTN.setVisible(true);
        proceedBTN.setVisible(false);
        dialog1BTN.setText("A chance for you to avoid potential public uproar!");
        dialog2BTN.setText("To remind you you're really old.");
        dialog3BTN.setText("For help in saving our marine creatures and the natural beauty of our oceans!");

        BurnsSpeachTXTAREA.setEditable(false);
        BurnsSpeachTXTAREA.setText("What is it now peasant?\nWhat have you come to bore me to death about now?");
        choice = 0;
    }

    private void Proceed() {
        dialog1BTN.setVisible(false);
        dialog2BTN.setVisible(false);
        dialog3BTN.setVisible(false);
        choice = 0;
        System.out.println("choice" + choice);
        if (phase >= 2) {
            proceedBTN.setVisible(true);
        }

    }

    private void GetOut() {
        SurfaceLvlGUI surfaceGUI = new SurfaceLvlGUI();
        surfaceGUI.setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(null, "You were kicked out of MrBuns' factory.");
    }

    private void Decisions1(int choice) {
        if (choice == 1 && phase == 1) {
            BurnsSpeachTXTAREA.setText("Hmm.. sounds interesting..\nVery well take a seat.");

            burnsTracker.addProgress();                 //add progress for right answer, save answer
            burnsTracker.saveToFile(phase);
            pBar.setValue(burnsTracker.getPercentage());

            Proceed();
            proceedBTN.setVisible(true);

        } else if (choice == 2 && phase == 1) {
            BurnsSpeachTXTAREA.setText("WHAT!? RELEASE THE HOUNDS");
            resetLvl();
            GetOut();

        } else if (choice == 3 && phase == 1) {
            BurnsSpeachTXTAREA.setText("oh boo hoo, theres an incident?\nWhats in it for me??..");
            Proceed();
            proceedBTN.setVisible(true);

        }
    }

    private void Decisions2(int choice) {
        BurnsSpeachTXTAREA.setText("How exactly do you suggest I avoid this \nunpleasant incident?");
        dialog1BTN.setVisible(true);
        dialog2BTN.setVisible(true);
        dialog3BTN.setVisible(true);
        dialog1BTN.setText("Retire to an old folks home!");
        dialog2BTN.setText("Shut down your factory's waste pipes.");
        dialog3BTN.setText("Install a waste treatment system for cheaper disposal fees!");
        if (choice == 1 && phase == 2) {
            BurnsSpeachTXTAREA.setText("HOW DARE YOU! RELEASE THE HOUNDS!");
            resetLvl();
            GetOut();
        } else if (choice == 2 && phase == 2) {
            BurnsSpeachTXTAREA.setText("BAH! you must be joking!");
            Proceed();

        } else if (choice == 3 && phase == 2) {
            BurnsSpeachTXTAREA.setText("Interesting proposal indeed! \nAn investment for cheaper fees\nAND the public will love it!");
            burnsTracker.addProgress();                 //add progress for right answer, save answer
            burnsTracker.saveToFile(phase);
            pBar.setValue(burnsTracker.getPercentage());
            Proceed();

        }
    }

    private void Decisions3(int choice) {
        BurnsSpeachTXTAREA.setText("-and this will be recieved well by the public yes?");
        dialog1BTN.setVisible(true);
        dialog2BTN.setVisible(true);
        dialog3BTN.setVisible(true);
        dialog1BTN.setText("Like they could ever enjoy something you do!");
        dialog2BTN.setText("Possibly");
        dialog3BTN.setText("Oh yes, you'll be talked about in all the papers!");
        if (choice == 1 && phase == 3) {
            BurnsSpeachTXTAREA.setText("well I simply refuse to work with such bullies.");
            resetLvl();
            GetOut();
        } else if (choice == 2 && phase == 3) {
            BurnsSpeachTXTAREA.setText("oh..?\nNot quite the confidence I was looking for..");
            Proceed();

        } else if (choice == 3 && phase == 3) {
            BurnsSpeachTXTAREA.setText("Oh great, I could use some public rep aid!");
            burnsTracker.addProgress();                 //add progress for right answer, save answer
            burnsTracker.saveToFile(phase);
            pBar.setValue(burnsTracker.getPercentage());
            Proceed();

        }
    }

    private void Decisions4(int choice) {
        BurnsSpeachTXTAREA.setText("Just how profitable is this venture?");
        dialog1BTN.setVisible(true);
        dialog2BTN.setVisible(true);
        dialog3BTN.setVisible(true);
        dialog1BTN.setText("Can you at least TRY hide your greed?");
        dialog2BTN.setText("Profit? you're doing the planet a service..");
        dialog3BTN.setText("You get cheaper waste fees and access to resource recovery!");
        if (choice == 1 && phase == 4) {
            BurnsSpeachTXTAREA.setText("HOW DARE YOU! SMITHERS?! RELEASE THE HOUNDS!");
            resetLvl();
            GetOut();
        } else if (choice == 2 && phase == 4) {
            BurnsSpeachTXTAREA.setText("What?! Why waste my time with such a meeting?! \nWhat has the planet ever done for me?");
            Proceed();

        } else if (choice == 3 && phase == 4) {
            BurnsSpeachTXTAREA.setText("That sounds quite economical yes.. Excellent.");
            burnsTracker.addProgress();                 //add progress for right answer, save answer
            burnsTracker.saveToFile(phase);
            pBar.setValue(burnsTracker.getPercentage());
            Proceed();

        }
    }

    private void Decisions5(int choice) {
        BurnsSpeachTXTAREA.setText("Are there other benefits of this change?");
        dialog1BTN.setVisible(true);
        dialog2BTN.setVisible(true);
        dialog3BTN.setVisible(true);
        dialog1BTN.setText("Why would I tell you!?");
        dialog2BTN.setText("Workers will be happeir.");
        dialog3BTN.setText("With better waters around the factory it will improve the company image!");
        if (choice == 1 && phase == 5) {
            BurnsSpeachTXTAREA.setText("This was your idea! Such foolishness, begone!");
            resetLvl();
            GetOut();
        } else if (choice == 2 && phase == 5) {
            BurnsSpeachTXTAREA.setText("The workers are not my concern,\nWhat am I their mother?");
            Proceed();

        } else if (choice == 3 && phase == 5) {
            BurnsSpeachTXTAREA.setText("E X C E L L E N T.");
            burnsTracker.addProgress();                 //add progress for right answer, save answer
            burnsTracker.saveToFile(phase);
            pBar.setValue(burnsTracker.getPercentage());
            Proceed();

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roomTitleLBL = new javax.swing.JLabel();
        retryBTN = new javax.swing.JButton();
        ReturnBTN = new javax.swing.JButton();
        pBar = new javax.swing.JProgressBar();
        BurnsSpeachTXTAREA = new java.awt.TextArea();
        burnsLBL = new javax.swing.JLabel();
        burnsBackgroundPNL = new javax.swing.JPanel();
        pMeterLBL = new javax.swing.JLabel();
        responseLBL = new javax.swing.JLabel();
        proceedBTN = new javax.swing.JButton();
        dialog1BTN = new javax.swing.JButton();
        dialog2BTN = new javax.swing.JButton();
        dialog3BTN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        factoryBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roomTitleLBL.setText("Mr Burns' office                       Objective: convince him to stop polluting our oceans!");
        getContentPane().add(roomTitleLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        retryBTN.setText("Retry");
        retryBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryBTNActionPerformed(evt);
            }
        });
        getContentPane().add(retryBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 150, 30));

        ReturnBTN.setText("Return to map");
        ReturnBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ReturnBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 30));
        getContentPane().add(pBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 20));
        getContentPane().add(BurnsSpeachTXTAREA, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 310, 180));

        burnsLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/burns.png"))); // NOI18N
        getContentPane().add(burnsLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 30, 310, 180));

        burnsBackgroundPNL.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout burnsBackgroundPNLLayout = new javax.swing.GroupLayout(burnsBackgroundPNL);
        burnsBackgroundPNL.setLayout(burnsBackgroundPNLLayout);
        burnsBackgroundPNLLayout.setHorizontalGroup(
            burnsBackgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        burnsBackgroundPNLLayout.setVerticalGroup(
            burnsBackgroundPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        getContentPane().add(burnsBackgroundPNL, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 310, 180));

        pMeterLBL.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        pMeterLBL.setText("The persuasion meter");
        getContentPane().add(pMeterLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, -1));

        responseLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        responseLBL.setText("How do you respond?");
        getContentPane().add(responseLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, 20));

        proceedBTN.setText("Proceed");
        proceedBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBTNActionPerformed(evt);
            }
        });
        getContentPane().add(proceedBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 520, 40));

        dialog1BTN.setText("Dialog option 1");
        dialog1BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialog1BTNActionPerformed(evt);
            }
        });
        getContentPane().add(dialog1BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 520, 40));

        dialog2BTN.setText("Dialog option 2");
        dialog2BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialog2BTNActionPerformed(evt);
            }
        });
        getContentPane().add(dialog2BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 520, 40));

        dialog3BTN.setText("Dialog option 3");
        dialog3BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialog3BTNActionPerformed(evt);
            }
        });
        getContentPane().add(dialog3BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 520, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 800, 190));
        getContentPane().add(factoryBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dialog3BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialog3BTNActionPerformed
        if (phase == 1) {
            Decisions1(3);
        } else if (phase == 2) {
            Decisions2(3);
        } else if (phase == 3) {
            Decisions3(3);
        } else if (phase == 4) {
            Decisions4(3);
        } else if (phase == 5) {
            Decisions5(3);
        }
    }//GEN-LAST:event_dialog3BTNActionPerformed

    private void dialog1BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialog1BTNActionPerformed
        if (phase == 1) {
            Decisions1(1);
        } else if (phase == 2) {
            Decisions2(1);
        } else if (phase == 3) {
            Decisions3(1);
        } else if (phase == 4) {
            Decisions4(1);
        } else if (phase == 5) {
            Decisions5(1);
        }
    }//GEN-LAST:event_dialog1BTNActionPerformed

    private void dialog2BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialog2BTNActionPerformed
        if (phase == 1) {
            Decisions1(2);
        } else if (phase == 2) {
            Decisions2(2);
        } else if (phase == 3) {
            Decisions3(2);
        } else if (phase == 4) {
            Decisions4(2);
        } else if (phase == 5) {
            Decisions5(2);
        }
    }//GEN-LAST:event_dialog2BTNActionPerformed

    private void ReturnBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBTNActionPerformed
        // TODO add your handling code here:
        SurfaceLvlGUI surfaceGUI = new SurfaceLvlGUI();
        surfaceGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnBTNActionPerformed

    private void retryBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryBTNActionPerformed
        // TODO add your handling code here:
        //this will change progress bar = 0 and empty array 
        resetLvl();

    }//GEN-LAST:event_retryBTNActionPerformed

    private void proceedBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBTNActionPerformed

        phase++;
        burnsTracker.saveToFile(phase);
        if (phase == 2) {
            Decisions2(0);
        } else if (phase == 3) {
            Decisions3(0);
        } else if (phase == 4) {
            Decisions4(0);
        } else if (phase == 5) {
            Decisions5(0);
        }

        proceedBTN.setVisible(false);

        System.out.println(phase);
    }//GEN-LAST:event_proceedBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FactoryGUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextArea BurnsSpeachTXTAREA;
    private javax.swing.JButton ReturnBTN;
    private javax.swing.JPanel burnsBackgroundPNL;
    private javax.swing.JLabel burnsLBL;
    private javax.swing.JButton dialog1BTN;
    private javax.swing.JButton dialog2BTN;
    private javax.swing.JButton dialog3BTN;
    private javax.swing.JLabel factoryBackground;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JProgressBar pBar;
    private javax.swing.JLabel pMeterLBL;
    private javax.swing.JButton proceedBTN;
    private javax.swing.JLabel responseLBL;
    private javax.swing.JButton retryBTN;
    private javax.swing.JLabel roomTitleLBL;
    // End of variables declaration//GEN-END:variables
}
