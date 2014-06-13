/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LostOnAnIsland.view;

import byui.cit260.LostOnAnIsland.control.GameControl;
import byui.cit260.LostOnAnIsland.objectModeling.Game;
import java.util.Scanner;

/**
 *
 * @author bethanytaylor
 */
public class StatDisplay {

    public static void displayLogList() {

        //Game.createLogList();
        int[] logList = Game.getLogList();
        int[] sortedList = GameControl.sortLogList(logList);

        for (int list: sortedList) {
            
            System.out.print(list + " ");
            

        }
        System.out.print("\n\n");
        
    }
    
    public static void displayAverageAltitudes() {
        
        int[] altiList = Game.getAltiList();
        double average = GameControl.averageAltitudes(altiList);

        
        for (int altitudes: altiList) {
            
            System.out.print(altitudes + " ");
        }
        System.out.print("\n\n");
                
        System.out.println("This is the average altitude\nfound on the island:");
        System.out.println(average);
        
        
    }
    public static void displayAverageScore(){
        double avgScore = GameControl.findAverageScores();
        System.out.println("The average score is " + avgScore);
    }

    
  
}


    
