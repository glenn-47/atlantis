/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oopproj;

/**
 *
 * @author glenn
 */
public class LowLvlGUI extends javax.swing.JFrame {
    
    // POLYMORPHISM: Here I use an ArrayList of the abstract parent type 'Creature'.
    // This allows us to store both 'BigCreature' and 'SmallCreature' objects in the same list.
    private java.util.ArrayList<Creature> creatureList;
    
    // Quiz Variables
    private java.util.ArrayList<QuizQuestion> quizList;
    private int currentQuestionIndex = 0;
    private int score = 0;
    
    // Logger for debugging and error tracking
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LowLvlGUI.class.getName());

    /**
     * Creates new form LowLvlGUI
     */
    public LowLvlGUI() {
        initComponents();
        
        // Load the data
        loadCreatures();

        // Setup ComboBox through the polymorphic list to get common attributes
        creatureComboBox.removeAllItems();
        for (Creature c : creatureList) {
            creatureComboBox.addItem(c.getName());
        }

        // Add Listener (When user picks a fish)
        creatureComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCreatureDisplay();
            }
        });

        // Shows the first one
        updateCreatureDisplay();
        
        loadQuiz();
        displayQuestion();
    }
    
    // Inheritance & polymorphism, list is populated with different sub classes
    private void loadCreatures() {
    creatureList = new java.util.ArrayList<>();

    // =======================================================
    //     BIG CREATURES (sub class of creature)
    //  Demonstrates passing specific data (Length) to the super constructor
    // =======================================================

    creatureList.add(new BigCreature(
        "Sperm Whale",
        "The largest toothed predator. It dives to great depths to hunt squid using echolocation.",
        "/resources/sperm_whale.png",
        20.5
    ));

    creatureList.add(new BigCreature(
        "Giant Squid",
        "The legendary Kraken. It has the largest eyes in the animal kingdom to see in the dark.",
        "/resources/giant_squid.png",
        13.0
    ));

    creatureList.add(new BigCreature(
        "Colossal Squid",
        "Shorter but much heavier than the Giant Squid. It has rotating hooks on its tentacles.",
        "/resources/colossal_squid.png",
        14.0
    ));

    creatureList.add(new BigCreature(
        "Giant Oarfish",
        "The longest bony fish alive. It is likely the source of 'sea serpent' myths.",
        "/resources/oarfish.png",
        8.0
    ));

    creatureList.add(new BigCreature(
        "Greenland Shark",
        "A slow-moving shark that lives in the arctic deep. They can live to be over 400 years old.",
        "/resources/greenland_shark.png",
        6.4
    ));

    creatureList.add(new BigCreature(
        "Megamouth Shark",
        "An extremely rare deep-water shark. It swims with its mouth wide open to filter plankton.",
        "/resources/megamouth.png",
        5.5
    ));

    creatureList.add(new BigCreature(
        "Goblin Shark",
        "Known for its terrifying, protruding jaws which snap forward to catch prey.",
        "/resources/goblin_shark.png",
        3.8
    ));

    creatureList.add(new BigCreature(
        "Frilled Shark",
        "A 'living fossil' with a prehistoric appearance and rows of needle-like teeth.",
        "/resources/frilled_shark.png",
        2.0
    ));

    // =======================================================
    //     SMALL CREATURES (sub class of creature)
    //  Demonstrates passing specific data (Diet) to the super constructor
    // =======================================================

    creatureList.add(new SmallCreature(
        "Humpback Anglerfish",
        "Famous for the bioluminescent lure on its head used to attract prey in pitch darkness.",
        "/resources/anglerfish.png",
        "Ambush Carnivore"
    ));

    creatureList.add(new SmallCreature(
        "Vampire Squid",
        "Not a true squid or octopus. When threatened, it turns inside out to show spiky filaments.",
        "/resources/vampire_squid.png",
        "Marine Snow (Detritus)"
    ));

    creatureList.add(new SmallCreature(
        "Giant Isopod",
        "A massive crustacean related to the pill bug. It roams the sea floor looking for fallen food.",
        "/resources/isopod.png",
        "Scavenger"
    ));

    creatureList.add(new SmallCreature(
        "Dumbo Octopus",
        "Named for the ear-like fins on its head. It is the deepest living of all known octopuses.",
        "/resources/dumbo_octopus.png",
        "Worms & Crustaceans"
    ));

    creatureList.add(new SmallCreature(
        "Barreleye Fish",
        "It has a transparent head! Its green tubular eyes rotate to look upward through its own skull.",
        "/resources/barreleye.png",
        "Jellyfish Thief"
    ));

    creatureList.add(new SmallCreature(
        "Pacific Viperfish",
        "It has teeth so large that they do not fit inside its mouth. It impales prey at high speed.",
        "/resources/viperfish.png",
        "Small Fish & Shrimp"
    ));

    creatureList.add(new SmallCreature(
        "Gulper Eel",
        "Also known as the Pelican Eel. Its mouth is massive and can swallow prey larger than itself.",
        "/resources/gulper_eel.png",
        "Opportunistic Feeder"
    ));

    creatureList.add(new SmallCreature(
        "Yeti Crab",
        "A crab with 'furry' arms. The fur grows bacteria which the crab then eats.",
        "/resources/yeti_crab.png",
        "Bacteria Farmer"
    ));
    
    creatureList.add(new SmallCreature(
        "Blobfish",
        "Often called the world's ugliest animal. Its gelatinous body floats just above the sea floor.",
        "/resources/blobfish.png",
        "Edible Matter"
    ));
    
    creatureList.add(new SmallCreature(
        "Sea Pig",
        "A type of sea cucumber with tube feet. They march in herds across the abyssal plain.",
        "/resources/sea_pig.png",
        "Organic Particles"
    ));
    }

    private void updateCreatureDisplay() {
        int index = creatureComboBox.getSelectedIndex();

        if (index >= 0 && index < creatureList.size()) {
            Creature selected = creatureList.get(index);

            // Update Text
            String text = selected.getDescription() + "\n\n" + selected.getStats();
            descriptionTextArea.setText(text);
            descriptionTextArea.setCaretPosition(0); 

            // Update Image / Error handling
            String path = selected.getImagePath();
            java.net.URL imgURL = getClass().getResource(path);

            if (imgURL != null) {
                javax.swing.ImageIcon icon = new javax.swing.ImageIcon(imgURL);
                java.awt.Image img = icon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), java.awt.Image.SCALE_SMOOTH);
                imageLabel.setIcon(new javax.swing.ImageIcon(img));
                imageLabel.setText("");
            } else {
                imageLabel.setIcon(null);
                imageLabel.setForeground(java.awt.Color.RED);
                imageLabel.setText("Image missing: " + path);
            }
        }
    }
    
    /**
     * File Input Reading
     * Ensures questions are loaded from the txt file
     */
    private void loadQuiz() {
    quizList = new java.util.ArrayList<>();
    
    // Read from the file "questions.txt" in the project root
    try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("questions.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String qText = line;
            String[] opts = new String[4];
            opts[0] = br.readLine(); // Option A
            opts[1] = br.readLine(); // Option B
            opts[2] = br.readLine(); // Option C
            opts[3] = br.readLine(); // Option D
            
            // Parsing logic to convert string to integer
            int correctIndex = Integer.parseInt(br.readLine());
            
            // INSTANTIABLE CLASS: Creating new QuizQuestion objects
            quizList.add(new QuizQuestion(qText, opts, correctIndex));
        }
    } catch (Exception e) {
        quizTextArea.setText("Error loading quiz: " + e.getMessage());
        }
    }
    
    // GUI visual changes for displaying questions / Validation for cheating
    private void displayQuestion() {
        // Check if quiz is running
        if (currentQuestionIndex < quizList.size()) {
            QuizQuestion q = quizList.get(currentQuestionIndex);

            // Text Setup
            quizTextArea.setText("Q" + (currentQuestionIndex + 1) + ": " + q.getQuestion());
            radioOption1.setText(q.getOptions()[0]);
            radioOption2.setText(q.getOptions()[1]);
            radioOption3.setText(q.getOptions()[2]);
            radioOption4.setText(q.getOptions()[3]);

            // Clear previous selection
            quizButtonGroup.clearSelection(); 

            // Restore selection
            switch (q.getUserSelection()) {
                case 0: 
                    radioOption1.setSelected(true); 
                    break;
                case 1: 
                    radioOption2.setSelected(true); 
                    break;
                case 2: 
                    radioOption3.setSelected(true); 
                    break;
                case 3: 
                    radioOption4.setSelected(true); 
                    break;
            }

            // Update Labels
            scoreLabel.setText("Score: " + score);
            questionCounterLabel.setText("Question " + (currentQuestionIndex + 1) + " / " + quizList.size());
            
        if (q.isLocked()) {
            // If the question is locked (already answered), disable inputs.
            radioOption1.setEnabled(false);
            radioOption2.setEnabled(false);
            radioOption3.setEnabled(false);
            radioOption4.setEnabled(false);
            submitQuizButton.setEnabled(false);
        } else {
            // If not locked, let the user choose
            radioOption1.setEnabled(true);
            radioOption2.setEnabled(true);
            radioOption3.setEnabled(true);
            radioOption4.setEnabled(true);
            submitQuizButton.setEnabled(true);
        }

        } else {
            // Game Over logic
            quizTextArea.setText("GAME OVER!\nFinal Score: " + score + " / " + quizList.size());
            questionCounterLabel.setText("Quiz Complete");
            submitQuizButton.setEnabled(false);
            deleteQuestionButton.setEnabled(false);
            radioOption1.setEnabled(false);
            radioOption2.setEnabled(false);
            radioOption3.setEnabled(false);
            radioOption4.setEnabled(false);
        }
    }
    
    /**
     * File Output Writing
     * This ensures add/delete questions are saved permanently
     */
    private void saveQuizToFile() {
        // Open the file "questions.txt" for writing
        // This essentially wipes the old file and gets ready to write the new list
        try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter("questions.txt"))) {

            // Loop through every question
            for (QuizQuestion q : quizList) {

                // Write Question data
                bw.write(q.getQuestion());
                bw.newLine(); // Move to next line

                // Write Options loop
                String[] opts = q.getOptions();
                for (String opt : opts) {
                    bw.write(opt);
                    bw.newLine();
                }

                // Write Answer index
                bw.write(String.valueOf(q.getCorrectAnswerIndex()));
                bw.newLine();
            }

        } catch (java.io.IOException e) {
            // If the file is locked or missing
            javax.swing.JOptionPane.showMessageDialog(this, "Error saving file: " + e.getMessage());
        }
    }
    
    /**
     * Question choice management
     * This saves the users radio button selection to the object in memory before navigating away
     */
    private void saveCurrentSelection() {
        if (quizList.isEmpty()) return;
        
        // Prevents IndexOutOfBoundsException if game is over
        if (currentQuestionIndex >= quizList.size()) {
            return;
        }

        // Get the current question object
        QuizQuestion q = quizList.get(currentQuestionIndex);

        // Check what is currently selected
        if (radioOption1.isSelected()) q.setUserSelection(0);
        else if (radioOption2.isSelected()) q.setUserSelection(1);
        else if (radioOption3.isSelected()) q.setUserSelection(2);
        else if (radioOption4.isSelected()) q.setUserSelection(3);
        else q.setUserSelection(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quizButtonGroup = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        creaturePanel1 = new oopproj.CreaturePanel();
        creatureComboBox = new javax.swing.JComboBox<>();
        imageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        pressurePanel1 = new oopproj.PressurePanel();
        jLabel1 = new javax.swing.JLabel();
        depthField = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();
        quizPanel1 = new oopproj.QuizPanel();
        questionCounterLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        quizTextArea = new javax.swing.JTextArea();
        radioOption1 = new javax.swing.JRadioButton();
        radioOption2 = new javax.swing.JRadioButton();
        radioOption3 = new javax.swing.JRadioButton();
        radioOption4 = new javax.swing.JRadioButton();
        submitQuizButton = new javax.swing.JButton();
        scoreLabel = new javax.swing.JLabel();
        deleteQuestionButton = new javax.swing.JButton();
        addQuestionButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        prevButton = new javax.swing.JButton();
        abyssBackToMain = new javax.swing.JButton();
        exitAtlantis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        creaturePanel1.setBackground(new java.awt.Color(10, 10, 40));

        creatureComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        creatureComboBox.setToolTipText("Choose Creature...");

        imageLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descriptionTextArea);

        javax.swing.GroupLayout creaturePanel1Layout = new javax.swing.GroupLayout(creaturePanel1);
        creaturePanel1.setLayout(creaturePanel1Layout);
        creaturePanel1Layout.setHorizontalGroup(
            creaturePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creaturePanel1Layout.createSequentialGroup()
                .addGroup(creaturePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creaturePanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(creaturePanel1Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(creatureComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(creaturePanel1Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        creaturePanel1Layout.setVerticalGroup(
            creaturePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creaturePanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(creatureComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Creature Viewer", creaturePanel1);

        pressurePanel1.setBackground(new java.awt.Color(10, 10, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter depth (meters):");

        depthField.setColumns(10);

        calculateButton.setText("Calculate Pressure");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        resultLabel.setForeground(new java.awt.Color(255, 255, 255));
        resultLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pressurePanel1Layout = new javax.swing.GroupLayout(pressurePanel1);
        pressurePanel1.setLayout(pressurePanel1Layout);
        pressurePanel1Layout.setHorizontalGroup(
            pressurePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pressurePanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(pressurePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pressurePanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(depthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pressurePanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pressurePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calculateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        pressurePanel1Layout.setVerticalGroup(
            pressurePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pressurePanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(pressurePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(depthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculateButton)
                .addGap(18, 18, 18)
                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(355, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Pressure Calculator", pressurePanel1);

        quizPanel1.setBackground(new java.awt.Color(10, 10, 40));

        questionCounterLabel.setForeground(new java.awt.Color(255, 255, 255));
        questionCounterLabel.setText("Question 1/5");

        quizTextArea.setEditable(false);
        quizTextArea.setColumns(20);
        quizTextArea.setLineWrap(true);
        quizTextArea.setRows(5);
        quizTextArea.setText("What is the common name for the 'Chauliodus' fish?");
        quizTextArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(quizTextArea);

        quizButtonGroup.add(radioOption1);
        radioOption1.setForeground(new java.awt.Color(255, 255, 255));
        radioOption1.setText("Option A");
        radioOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOption1ActionPerformed(evt);
            }
        });

        quizButtonGroup.add(radioOption2);
        radioOption2.setForeground(new java.awt.Color(255, 255, 255));
        radioOption2.setText("Option B");

        quizButtonGroup.add(radioOption3);
        radioOption3.setForeground(new java.awt.Color(255, 255, 255));
        radioOption3.setText("Option C");

        quizButtonGroup.add(radioOption4);
        radioOption4.setForeground(new java.awt.Color(255, 255, 255));
        radioOption4.setText("Option D");

        submitQuizButton.setText("Submit Answer");
        submitQuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitQuizButtonActionPerformed(evt);
            }
        });

        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        deleteQuestionButton.setText("Delete Question");
        deleteQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteQuestionButtonActionPerformed(evt);
            }
        });

        addQuestionButton.setText("Add New");
        addQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuestionButtonActionPerformed(evt);
            }
        });

        restartButton.setText("Restart");
        restartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartButtonActionPerformed(evt);
            }
        });

        nextButton.setText(">");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        prevButton.setText("<");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quizPanel1Layout = new javax.swing.GroupLayout(quizPanel1);
        quizPanel1.setLayout(quizPanel1Layout);
        quizPanel1Layout.setHorizontalGroup(
            quizPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quizPanel1Layout.createSequentialGroup()
                .addGroup(quizPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quizPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(quizPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(quizPanel1Layout.createSequentialGroup()
                                .addComponent(addQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteQuestionButton))
                            .addGroup(quizPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(quizPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioOption2)
                                    .addComponent(radioOption1)
                                    .addComponent(radioOption3)
                                    .addComponent(radioOption4)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(quizPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(submitQuizButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(quizPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(restartButton))
                    .addGroup(quizPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questionCounterLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(372, Short.MAX_VALUE))
        );
        quizPanel1Layout.setVerticalGroup(
            quizPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quizPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(quizPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addQuestionButton)
                    .addComponent(deleteQuestionButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quizPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionCounterLabel)
                    .addComponent(nextButton)
                    .addComponent(prevButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(quizPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(quizPanel1Layout.createSequentialGroup()
                        .addComponent(radioOption1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioOption2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioOption3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioOption4)
                        .addGap(18, 18, 18)
                        .addComponent(submitQuizButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(restartButton))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Deep Sea Quiz", quizPanel1);

        abyssBackToMain.setText("Back to Main Menu");
        abyssBackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abyssBackToMainActionPerformed(evt);
            }
        });

        exitAtlantis.setText("Exit Atlantis");
        exitAtlantis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitAtlantisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(abyssBackToMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitAtlantis)
                .addGap(253, 253, 253))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abyssBackToMain)
                    .addComponent(exitAtlantis))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOption1ActionPerformed

    private void abyssBackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abyssBackToMainActionPerformed
        // TODO add your handling code here:
        new MainMenuGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_abyssBackToMainActionPerformed

    private void exitAtlantisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitAtlantisActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitAtlantisActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        // Get the text from the box
        String input = depthField.getText();

        try {
            // Parsing string to double
            double depth = Double.parseDouble(input);

            // Validation: Depth cannot be negative
            if (depth < 0) {
                resultLabel.setText("Depth cannot be negative!");
                resultLabel.setForeground(java.awt.Color.RED);
                return; 
            }

            // The Math: 1 atm (surface air) + 1 atm for every 10 meters
            double pressure = 1 + (depth / 10.0);

            // Display Result (Formatted to 2 decimal places)
            String resultText = String.format("Pressure at %.1fm is %.2f Atmospheres", depth, pressure);

            resultLabel.setText(resultText);
            resultLabel.setForeground(java.awt.Color.CYAN);

        } catch (NumberFormatException e) {
            // Handle errors (if user types letters or nothing)
            resultLabel.setText("Please enter a valid number.");
            resultLabel.setForeground(java.awt.Color.RED);
        }
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void submitQuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitQuizButtonActionPerformed
        // TODO add your handling code here:
        if (quizList.isEmpty()) return;

        QuizQuestion q = quizList.get(currentQuestionIndex);

        // Check if locked
        if (q.isLocked()) {
            javax.swing.JOptionPane.showMessageDialog(this, "You have already answered this question!");
            return;
        }

        // Check Selection
        int selected = -1;
        if (radioOption1.isSelected()) selected = 0;
        else if (radioOption2.isSelected()) selected = 1;
        else if (radioOption3.isSelected()) selected = 2;
        else if (radioOption4.isSelected()) selected = 3;

        if (selected == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select an answer!");
            return;
        }

        // Save & Lock
        q.setUserSelection(selected);
        q.setLocked(true);

        // Scoring
        if (selected == q.getCorrectAnswerIndex()) {
            score++;
            javax.swing.JOptionPane.showMessageDialog(this, "Correct!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Wrong! The answer was: " + q.getOptions()[q.getCorrectAnswerIndex()]);
        }

        // Search algorithm
        // Instead of index +1, the list is scanned to find next unanswered question
        int nextUnansweredIndex = -1;

        // Scan through all questions to find one that isn't locked
        for (int i = 1; i <= quizList.size(); i++) {
            // Circular search
            int checkIndex = (currentQuestionIndex + i) % quizList.size();

            if (!quizList.get(checkIndex).isLocked()) {
                nextUnansweredIndex = checkIndex;
                break;
            }
        }

        if (nextUnansweredIndex != -1) {
            // If found an unanswered question, it goes to it
            currentQuestionIndex = nextUnansweredIndex;
            displayQuestion();
        } else {
            currentQuestionIndex = quizList.size(); // Force Game Over state
            displayQuestion();

            javax.swing.JOptionPane.showMessageDialog(this, "Congratulations! You have finished the quiz.");
        }
    }//GEN-LAST:event_submitQuizButtonActionPerformed

    private void deleteQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteQuestionButtonActionPerformed
        // TODO add your handling code here:
        // Checks if list empty
        if (quizList.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No questions to delete!");
            return;
        }
        
        // Boundary Protection
        // If user is at game over screen it resets to last valid item
        if (currentQuestionIndex >= quizList.size()) {
            currentQuestionIndex = quizList.size() - 1;
        }

        // Confirm deletion message
        int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to delete this question?", 
            "Confirm Delete", 
            javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {

            // Remove from the array
            quizList.remove(currentQuestionIndex);

            // Adjust Index to prevent out of bounds after deleting
            if (currentQuestionIndex >= quizList.size()) {
                currentQuestionIndex = 0; // Go back to start
            }

            // Save to the file
            saveQuizToFile();

            // Update the UI
            if (quizList.isEmpty()) {
                quizTextArea.setText("No questions available.");
                questionCounterLabel.setText("0/0");
                submitQuizButton.setEnabled(false);
                deleteQuestionButton.setEnabled(false);
            } else {
                displayQuestion(); // Show the new current question
                javax.swing.JOptionPane.showMessageDialog(this, "Question Deleted.");
            }
        }
    }//GEN-LAST:event_deleteQuestionButtonActionPerformed

    private void addQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuestionButtonActionPerformed
        // TODO add your handling code here:
        // Create Input Fields for GUI
        javax.swing.JTextField qField = new javax.swing.JTextField();
        javax.swing.JTextField opt1Field = new javax.swing.JTextField();
        javax.swing.JTextField opt2Field = new javax.swing.JTextField();
        javax.swing.JTextField opt3Field = new javax.swing.JTextField();
        javax.swing.JTextField opt4Field = new javax.swing.JTextField();

        // Dropdown for correct answer
        String[] indices = {"Option 1", "Option 2", "Option 3", "Option 4"};
        javax.swing.JComboBox<String> ansBox = new javax.swing.JComboBox<>(indices);

        // Arrange fields in a list
        Object[] message = {
            "Question:", qField,
            "Option 1:", opt1Field,
            "Option 2:", opt2Field,
            "Option 3:", opt3Field,
            "Option 4:", opt4Field,
            "Correct Answer:", ansBox
        };

        // Show the Dialog
        int option = javax.swing.JOptionPane.showConfirmDialog(this, message, "Add New Question", javax.swing.JOptionPane.OK_CANCEL_OPTION);

        if (option == javax.swing.JOptionPane.OK_OPTION) {
            // Validate (Stop the user from leaving an input empty)
            if (qField.getText().trim().isEmpty() || opt1Field.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Fields cannot be empty!");
                return;
            }

            // Create the new Question Object
            String[] newOpts = {
                opt1Field.getText(), 
                opt2Field.getText(), 
                opt3Field.getText(), 
                opt4Field.getText()
            };

            int correctIndex = ansBox.getSelectedIndex(); 
            
            // Instantiable class - creating the object
            QuizQuestion newQ = new QuizQuestion(qField.getText(), newOpts, correctIndex);

            // Add to List and SAVE
            quizList.add(newQ);
            saveQuizToFile(); // updates actual txt file in root

            // Jump to the new question to show it
            currentQuestionIndex = quizList.size() - 1;
            displayQuestion();

            submitQuizButton.setEnabled(true);
            javax.swing.JOptionPane.showMessageDialog(this, "Question Added Successfully!");
        }
    }//GEN-LAST:event_addQuestionButtonActionPerformed

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        // TODO add your handling code here:
        if (quizList.isEmpty()) return;

        // Shuffle questions order
        java.util.Collections.shuffle(quizList);

        // Reset questions logic
        for (QuizQuestion q : quizList) {
            q.setUserSelection(-1);
            q.setLocked(false);
        }

        // Reset counters
        currentQuestionIndex = 0;
        score = 0;

        // Re-enable UI
        submitQuizButton.setEnabled(true);
        deleteQuestionButton.setEnabled(true);
        radioOption1.setEnabled(true);
        radioOption2.setEnabled(true);
        radioOption3.setEnabled(true);
        radioOption4.setEnabled(true);

        displayQuestion();

        javax.swing.JOptionPane.showMessageDialog(this, "Quiz Restarted & Shuffled!");
    }//GEN-LAST:event_restartButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        // TODO add your handling code here:
        if (quizList.isEmpty()) return;
        
        // Save state before navigating
        saveCurrentSelection();

        // Move Backwards (navigation)
        currentQuestionIndex--;

        // Loop around logic
        if (currentQuestionIndex < 0) {
            currentQuestionIndex = quizList.size() - 1;
        }

        // Update UI
        displayQuestion();
    }//GEN-LAST:event_prevButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        if (quizList.isEmpty()) return;
        
        saveCurrentSelection();

        // Move Forwards (navigation)
        currentQuestionIndex++;

        // Loop around logic
        if (currentQuestionIndex >= quizList.size()) {
            currentQuestionIndex = 0;
        }

        // Update UI
        displayQuestion();
    }//GEN-LAST:event_nextButtonActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new LowLvlGUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abyssBackToMain;
    private javax.swing.JButton addQuestionButton;
    private javax.swing.JButton calculateButton;
    private javax.swing.JComboBox<String> creatureComboBox;
    private oopproj.CreaturePanel creaturePanel1;
    private javax.swing.JButton deleteQuestionButton;
    private javax.swing.JTextField depthField;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JButton exitAtlantis;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton nextButton;
    private oopproj.PressurePanel pressurePanel1;
    private javax.swing.JButton prevButton;
    private javax.swing.JLabel questionCounterLabel;
    private javax.swing.ButtonGroup quizButtonGroup;
    private oopproj.QuizPanel quizPanel1;
    private javax.swing.JTextArea quizTextArea;
    private javax.swing.JRadioButton radioOption1;
    private javax.swing.JRadioButton radioOption2;
    private javax.swing.JRadioButton radioOption3;
    private javax.swing.JRadioButton radioOption4;
    private javax.swing.JButton restartButton;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton submitQuizButton;
    // End of variables declaration//GEN-END:variables
}
