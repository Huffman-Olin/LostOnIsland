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
            
            System.out.println(list);
        }
        
    }
    
    public static void displayAverageAltitudes() {
        
        int[] altiList = Game.getAltiList();
        double average = GameControl.averageAltitudes(altiList);

        for (int altitudes: altiList) {
            
            System.out.println(altitudes);
        }
                
        System.out.println("This is the average altitude\nfound on the island");
        System.out.println(average);
        
        
    }

    
    public static /*int[]*/void InputScores(){
        Scanner scores = new Scanner(System.in);
        int[] playerScores = new int[5];
        
        for (int i = 0; i < playerScores.length; i++){
        int count = i + 1;
      
        System.out.println("Enter score # " + count + ": " );
        playerScores[i] = scores.nextInt();
        if( playerScores[i] < 0 ||  playerScores[i] > 500){
            System.out.println("Invalid Score entry");
        }
        System.out.println("");
       
         
    }
        //for each loop
     for (int userScores: playerScores) {
            
            System.out.println(userScores); 
           
       
        }
         int sum = 0;
 for(int printer = 0; printer < playerScores.length; printer++){
        
        sum = sum + playerScores[printer];
    
       double avg = sum / playerScores[printer];
  System.out.println("Average player score is " + avg);
}
}
}


    
