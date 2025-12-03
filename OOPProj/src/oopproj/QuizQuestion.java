/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

/**
 *
 * @author glenn
 */
public class QuizQuestion {
    
    // Variables
    private String question;
    private String[] options;
    private int correctAnswerIndex;
    private int userSelectedOption = -1;
    private boolean locked = false;

    // Constructor
    public QuizQuestion(String q, String[] opts, int ans) {
        this.question = q;
        this.options = opts;
        this.correctAnswerIndex = ans;
    }

    // Getters
    public String getQuestion() { return question; }
    public String[] getOptions() { return options; }
    public int getCorrectAnswerIndex() { return correctAnswerIndex; }
    public int getUserSelection() { return userSelectedOption; }
    public boolean isLocked() { return locked; }
    
    // Setters
    public void setQuestion(String q) { this.question = q; }
    public void setOptions(String[] opts) { this.options = opts; }
    public void setCorrectAnswerIndex(int index) { this.correctAnswerIndex = index; }
    public void setUserSelection(int selection) { this.userSelectedOption = selection; }
    public void setLocked(boolean locked) { this.locked = locked; }
    
}
