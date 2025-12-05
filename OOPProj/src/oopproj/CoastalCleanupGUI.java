/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Abdallah haouit
 */
package oopproj;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class CoastalCleanupGUI extends javax.swing.JFrame {
    TaskManager manager = new TaskManager(); // Handles all task featurew

    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CoastalCleanupGUI.class.getName());

   
    public CoastalCleanupGUI() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JTabbedPane jTabbedPane1 = new javax.swing.JTabbedPane();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel panelAddTask = new javax.swing.JPanel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        cmbWasteType = new javax.swing.JComboBox<>();
        cmbDifficulty = new javax.swing.JComboBox<>();
        btnAddTask = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        javax.swing.JButton jButton4 = new javax.swing.JButton();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JButton jButton5 = new javax.swing.JButton();
        javax.swing.JButton jButton6 = new javax.swing.JButton();
        javax.swing.JButton jButton3 = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tblTasks = new javax.swing.JTable();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        javax.swing.JPanel panelsearchAndManage = new javax.swing.JPanel();
        javax.swing.JPanel panelBottom2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        javax.swing.JButton btnClear = new javax.swing.JButton();
        javax.swing.JButton btnSave = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JButton jButton18 = new javax.swing.JButton();
        javax.swing.JButton jButton7 = new javax.swing.JButton();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(223, 246, 255));
        jTabbedPane1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(223, 246, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(790, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAddTask.setBackground(new java.awt.Color(250, 240, 220));
        panelAddTask.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("Beach Location:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setText("Weather:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setText("Difficulty:");

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        cmbWasteType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "clear", "Rainy", "Windy", "Red", "Red warning", "Sunny", "Moderate heat" }));

        cmbDifficulty.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        cmbDifficulty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Easy", "Medium", "Hard" }));
        cmbDifficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDifficultyActionPerformed(evt);
            }
        });

        btnAddTask.setBackground(new java.awt.Color(76, 175, 80));
        btnAddTask.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        btnAddTask.setText("Add Task");
        btnAddTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTaskActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(244, 67, 54));
        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddTaskLayout = new javax.swing.GroupLayout(panelAddTask);
        panelAddTask.setLayout(panelAddTaskLayout);
        panelAddTaskLayout.setHorizontalGroup(
            panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddTaskLayout.createSequentialGroup()
                .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddTaskLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddTaskLayout.createSequentialGroup()
                        .addComponent(btnAddTask, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLocation)
                    .addComponent(cmbDifficulty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbWasteType, 0, 100, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );
        panelAddTaskLayout.setVerticalGroup(
            panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddTaskLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbWasteType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(panelAddTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTask)
                    .addComponent(jButton2))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jPanel1.add(panelAddTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(120, 90, 60));
        jLabel1.setText("Add New Task");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 165, 35));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(120, 90, 60));
        jLabel11.setText("Coastal Cleanup");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 180, 30));

        jButton4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton4.setText("Main Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/CleanupBackground.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setMaximumSize(new java.awt.Dimension(10000, 10000));
        jLabel7.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 620));

        jTabbedPane1.addTab("Add Task", jPanel1);

        jPanel2.setBackground(new java.awt.Color(223, 246, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(780, 620));
        jPanel2.setPreferredSize(new java.awt.Dimension(793, 600));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(120, 90, 60));
        jLabel3.setText("Task list");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 215, 35));

        jButton5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton5.setText("Main Menu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 941, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton6.setText("Main Menu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton3.setText("Mark Done");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        tblTasks.setAutoCreateRowSorter(true);
        tblTasks.setBackground(new java.awt.Color(255, 255, 250));
        tblTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Location", "waste", "Difficulty", "Done"
            }
        ));
        jScrollPane1.setViewportView(tblTasks);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, 310));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/CleanupBackground.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -3, 800, 600));

        jTabbedPane1.addTab("Task List", jPanel2);

        jPanel3.setBackground(new java.awt.Color(223, 246, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(780, 620));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelsearchAndManage.setPreferredSize(new java.awt.Dimension(342, 360));

        panelBottom2.setBackground(new java.awt.Color(250, 240, 220));
        panelBottom2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel13.setText("Search beach:");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(76, 175, 80));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchjButton5ActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnSave.setText("Save Tasks");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnLoad.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnLoad.setText("Load tasks");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel14.setText("Cleanup Progress:");

        javax.swing.GroupLayout panelBottom2Layout = new javax.swing.GroupLayout(panelBottom2);
        panelBottom2.setLayout(panelBottom2Layout);
        panelBottom2Layout.setHorizontalGroup(
            panelBottom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBottom2Layout.createSequentialGroup()
                .addGroup(panelBottom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBottom2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBottom2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBottom2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelBottom2Layout.setVerticalGroup(
            panelBottom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBottom2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelBottom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addComponent(btnClear)
                    .addGroup(panelBottom2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelBottom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGap(31, 31, 31)
                .addGroup(panelBottom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoad)
                    .addComponent(btnSave))
                .addGroup(panelBottom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBottom2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBottom2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout panelsearchAndManageLayout = new javax.swing.GroupLayout(panelsearchAndManage);
        panelsearchAndManage.setLayout(panelsearchAndManageLayout);
        panelsearchAndManageLayout.setHorizontalGroup(
            panelsearchAndManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBottom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelsearchAndManageLayout.setVerticalGroup(
            panelsearchAndManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBottom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(panelsearchAndManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 480, 190));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(120, 90, 60));
        jLabel2.setText("Search & Manage Tasks");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 215, 35));

        jButton18.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton18.setText("Main Menu");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 990, -1, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton7.setText("Main Menu");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Cleanup.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 270, 170));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/CleanupBackground.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 620));

        jTabbedPane1.addTab("Search & Manage Tasks", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 620));
        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MainMenuGUI mainGUI= new MainMenuGUI();
        mainGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmbDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDifficultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDifficultyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     try {
        // Ask  for an ID and try to delete the  task
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to Delete:"));

        boolean ok = manager.deleteById(id);

        if (ok)
            JOptionPane.showMessageDialog(this, "Task Deleted.");
        else
            JOptionPane.showMessageDialog(this, "Task not Found.");

        // Updates  table after deleting
        manager.refreshTable((DefaultTableModel) tblTasks.getModel());

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Invalid ID."); // Handles non-numeric input
    
    }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void jButton18jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18jButton4ActionPerformed
        MainMenuGUI mainGUI= new MainMenuGUI();
        mainGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton18jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MainMenuGUI mainGUI= new MainMenuGUI();
        mainGUI.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnSearchjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchjButton5ActionPerformed
     
        String q = txtSearch.getText().trim();

    if (q.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter a locatiob.");
        return;
    }
     
    CleanupTask result = manager.searchByLocation(q);

    if (result == null) {
        JOptionPane.showMessageDialog(this, "No task found.");
        return;
    }

    JOptionPane.showMessageDialog(this,
            "Found:\nID: " + result.getId() +
            "\nLocation: " + result.getLocation() +
            "\nWaste: " + result.getWasteType() +
            "\nDifficulty: " + result.getDifficulty() +
            "\nDone: " + (result.isDone() ? "Yes" : "No"));
    }//GEN-LAST:event_btnSearchjButton5ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MainMenuGUI mainGUI= new MainMenuGUI();
        mainGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnAddTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTaskActionPerformed
                                          
        String loc = txtLocation.getText().trim();
        String waste = cmbWasteType.getSelectedItem().toString();
        String diff = cmbDifficulty.getSelectedItem().toString();

        if (loc.isEmpty()) {
          JOptionPane.showMessageDialog(this, "Enter a location.");
         return;
    }

        int id = manager.getNextId();
        CleanupTask task;

        // choose the correct task type based on difficulty
    if (diff.equals("Easy"))
        task = new EasyCleanupTask(id, loc, waste);
        else if (diff.equals("Medium"))
        task = new MediumCleanupTask(id, loc, waste);
         else
       task = new HardCleanupTask(id, loc, waste);

    // add the new task to my list
        manager.addTask(task);

    JOptionPane.showMessageDialog(this, "Task Added");

    // refresh table immediately
        manager.refreshTable((DefaultTableModel) tblTasks.getModel());
                                         
       manager.refreshTable((DefaultTableModel) tblTasks.getModel());
    updateProgressBar();


    }//GEN-LAST:event_btnAddTaskActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    manager.saveToFile();
    JOptionPane.showMessageDialog(this, "Tasks saved");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
    manager.loadFromFile();
    manager.refreshTable((DefaultTableModel) tblTasks.getModel());
    JOptionPane.showMessageDialog(this, "Tasks loaded");          
        manager.refreshTable((DefaultTableModel) tblTasks.getModel());
    updateProgressBar();

    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      txtSearch.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int row = tblTasks.getSelectedRow();
    if (row < 0) {
        JOptionPane.showMessageDialog(this, "Select a task first.");
        return;
    }

    int id = (int) tblTasks.getValueAt(row, 0);

    for (CleanupTask t : manager.tasks) {
        if (t.getId() == id) {
            t.markDone();
            break;
        }
    }
        manager.refreshTable((DefaultTableModel) tblTasks.getModel());
    updateProgressBar();

    JOptionPane.showMessageDialog(this, "Marked done");
    manager.refreshTable((DefaultTableModel) tblTasks.getModel());
    }//GEN-LAST:event_jButton3ActionPerformed

    
        // updates the progress bar based on how many tasks are done
    private void updateProgressBar() {
        int total = manager.getTaskCount();   // how many tasks exist
        int done = manager.getDoneCount();    // how many are done

        if (total == 0) {
            progressBar.setValue(0);
            progressBar.setString("");
            return;
        }

        int percent = (int) ((done * 100.0) / total);
        progressBar.setValue(percent);
        progressBar.setString(percent + "% complete");
        progressBar.setStringPainted(true);
    }

    
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
        java.awt.EventQueue.invokeLater(() -> new CoastalCleanupGUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnAddTask;
    javax.swing.JButton btnLoad;
    javax.swing.JButton btnSearch;
    javax.swing.JComboBox<String> cmbDifficulty;
    javax.swing.JComboBox<String> cmbWasteType;
    javax.swing.JButton jButton2;
    javax.swing.JProgressBar progressBar;
    javax.swing.JTable tblTasks;
    javax.swing.JTextField txtLocation;
    javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
