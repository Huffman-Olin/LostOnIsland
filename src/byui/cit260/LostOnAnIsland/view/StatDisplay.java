/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LostOnAnIsland.view;

import byui.cit260.LostOnAnIsland.control.GameControl;
import byui.cit260.LostOnAnIsland.exceptionHandling.GameControlException;
import byui.cit260.LostOnAnIsland.objectModeling.Game;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bethanytaylor
 */
public class StatDisplay extends View {

    public void displayLogList() {

        //Game.createLogList();
        int[] logList = Game.getLogList();
        int[] sortedList = GameControl.sortLogList(logList);

        for (int list : sortedList) {

            System.out.print(list + " ");

        }
        System.out.print("\n\n");

    }

    public void displayAverageAltitudes() {

        int[] altiList = Game.getAltiList();
        double average = GameControl.averageAltitudes(altiList);

        for (int altitudes : altiList) {

            System.out.print(altitudes + " ");
        }
        System.out.print("\n\n");

        System.out.println("This is the average altitude\nfound on the island:");
        System.out.println(average);

    }

    public void displayAverageScore() {
        double[] playerScores = new double[5];
        int score;
        try {
        for (int i = 0; i < playerScores.length; i++) {
            
            int count = i + 1;

            System.out.println("Enter score # " + count + ": ");
            String value = this.getInput();
            try {
                score = Integer.parseInt(value);    
            } catch (Exception e) {
                throw new GameControlException("Invalid. You must enter a number between 1 and 499");
            }
 
            if (playerScores[i] < 0 || playerScores[i] > 500) {
                    throw new GameControlException("Invalid. Number must be between 1 and 499");
                
            }
            playerScores[i] = score;
        }
        } catch (GameControlException ex) {
            System.out.println(ex.getMessage());
        }

        double average = GameControl.findAverageScore(playerScores);
        
        System.out.println("The average score = " + average);
        
    }

    @Override
    public void doAction(String value) {
        switch (value) {
            case "DAS": this.displayAverageScore();   
                break;
            case "DAA": this.displayAverageScore();   
                break;
            case "DLL": this.displayAverageScore();   
                break;    
            default:
                System.out.println("Invalid action.");
        }
    }
}



    
        

