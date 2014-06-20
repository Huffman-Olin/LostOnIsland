
package byui.cit260.LostOnAnIsland.control;

import byui.cit260.LostOnAnIsland.objectModeling.Game;
import byui.cit260.LostOnAnIsland.objectModeling.Player;
import byui.cit260.LostOnAnIsland.view.MainMenu;

import byui.cit260.LostOnAnIsland.view.NewGameView;
import byui.cit260.LostOnAnIsland.view.View;
import java.util.Scanner;


  /*** @author olinhuffman*/
 
public class GameControl {
    private static double average;
    

    
    public static void createNewGame() {
        Game game = new Game(); //created timeRemaininIslandLocatiIslandLocationlayer, Map
//IslandLocation     Map islandLocation = new Map(); //gets and sets the player's location on the island
    }
    
   
    
    public static int[] sortLogList(int[] logList) {
     
        int i, j, first, temp; 
        
        for ( i = logList.length - 1; i > 0; i-- ) 
        {
             first = 0;   //initialize to subscript of first element
            for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
            {
                if( logList[j] < logList[first] )         
                    first = j;
            }
            temp = logList[first];   //swap smallest found with element in position i.
            logList[first] = logList[i];
            logList[i] = temp;
            
        }
        
    return logList;
 
}
     
    public static double averageAltitudes(int[] altiList){
        
       
        int sum = 0;
 
        for (int i = 0; i < altiList.length; i++) {
            /*Check to see if all spots in array are full in order to average*/
            if (altiList[i] == ' '){
                System.out.println("Some spots in the array are blank\n Can not calculate average");
            }
            
            /*Check to see if any of the numbers in the array are negative*/
            if (altiList[i] < 0){
                System.out.println("Some of the numbers are negative\n Can not calculate average");
            }
            sum = sum + altiList[i]; 
            
        }
        double average = sum / altiList.length;
        
        return average;
    }
    
      public static double findAverageScore(){
        Scanner scores = new Scanner(System.in);
        double[] playerScores = new double[5];
        
        for (int i = 0; i < playerScores.length; i++){
        int count = i + 1;
      
        System.out.println("Enter score # " + count + ": " );
        playerScores[i] = scores.nextInt();
        if( playerScores[i] < 0 ||  playerScores[i] > 500){
            System.out.println("Invalid Score entry");
            
        }
    }
        //for each loop
        System.out.println("");
     for (double userScores: playerScores) {
           
       System.out.println("Player Score entered:\t" + userScores);
        }
         double sum = 0;
 for(int counter = 0; counter < playerScores.length; counter++){
        
        sum = sum + playerScores[counter];
}
 double avg = sum / playerScores.length;
   
return avg;
}
    
   
    
    public static Player createNewPlayer(String playerName) {
            
        
        System.out.println("\n**** createPlayer function called ****");
            return null;
    }

   
}
       

