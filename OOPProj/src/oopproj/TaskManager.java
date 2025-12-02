/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproj;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

    public class TaskManager {

    // list of all the tasks in memory
    ArrayList<CleanupTask> tasks = new ArrayList<>();
    private int nextId = 1;

    private final String FILE_NAME = "cleanup_tasks.txt";

    public void addTask(CleanupTask t) {
        tasks.add(t);
        nextId++;
    }

    public boolean deleteById(int id) {
        return tasks.removeIf(t -> t.getId() == id);
    }

    public CleanupTask searchByLocation(String loc) {
        for (CleanupTask t : tasks) {
            if (t.getLocation().equalsIgnoreCase(loc)) {
                return t;
            }
        }
        return null;
    }

    public int getNextId() {
        return nextId;
    }

    

    public void refreshTable(DefaultTableModel model) {
        model.setRowCount(0); // clear

        for (CleanupTask t : tasks) {
            model.addRow(new Object[]{
                t.getId(),
                t.getLocation(),
                t.getWasteType(),
                t.getDifficulty(),
                t.isDone() ? "Yes" : "No"
            });
        }
    }

    

    // saves all my curremt tasks to the text file
    public void saveToFile() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME));

            for (CleanupTask t : tasks) {
                pw.println(
                    t.getId() + "," +
                    t.getLocation() + "," +
                    t.getWasteType() + "," +
                    t.getDifficulty() + "," +
                    t.isDone()
                );
            }

            pw.close();
        } catch (Exception e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public void loadFromFile() {
        tasks.clear();

        try {
            File f = new File(FILE_NAME);
            if (!f.exists()) {
                // nothing saved yet
                return;
            }

            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] p = line.split(",");

                if (p.length < 5) continue;

                int id = Integer.parseInt(p[0]);
                String loc = p[1];
                String waste = p[2];
                String diff = p[3];
                boolean done = Boolean.parseBoolean(p[4]);

                CleanupTask t;

                if (diff.equals("Easy")) {
                    t = new EasyCleanupTask(id, loc, waste);
                } else if (diff.equals("Medium")) {
                    t = new MediumCleanupTask(id, loc, waste);
                } else {
                    t = new HardCleanupTask(id, loc, waste);
                }

                if (done) {
                    t.markDone();
                }

                tasks.add(t);

                // keep nextId ahead of the largest existing ID
                if (id >= nextId) {
                    nextId = id + 1;
                }
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }



    // mark a task as done using its ID
    public boolean markDoneById(int id) {
        for (CleanupTask t : tasks) {
            if (t.getId() == id) {
                t.markDone();
                return true;
            }
        }
        return false;
    }

   
    public int getTaskCount() {
        return tasks.size();
    }

    // number og completed tasks
    public int getDoneCount() {
        int count = 0;
        for (CleanupTask t : tasks) {
            // count each task that is already done
            if (t.isDone()) {
                count++;
            }
        }
        return count;
    }
    }
