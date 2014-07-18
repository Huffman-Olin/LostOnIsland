package byui.cit260.LostOnAnIsland.control;

import byui.cit260.LostOnAnIsland.exceptionHandling.ChallengeControlExceptions;
import byui.cit260.LostOnAnIsland.exceptionHandling.GameControlException;
import byui.cit260.LostOnAnIsland.objectModeling.Player;
import java.util.Scanner;

/**
 * * @author olinhuffman
 */
public class GameControl {

    private static double average;

    /*
     public static void createNewGame() {
     Game game = new Game(); //created timeRemaininIslandLocatiIslandLocationlayer, Map
     game.setCurrentTime(12);
     //create map
     //save map in game
     GameRun.setGame(game);
     }
     */
    public static int[] sortLogList(int[] logList) {

        int i, j, first, temp;

        for (i = logList.length - 1; i > 0; i--) {
            first = 0;   //initialize to subscript of first element
            for (j = 1; j <= i; j++) //locate smallest element between positions 1 and i.
            {
                if (logList[j] < logList[first]) {
                    first = j;
                }
            }
            temp = logList[first];   //swap smallest found with element in position i.
            logList[first] = logList[i];
            logList[i] = temp;

        }

        return logList;

    }

    public static double averageAltitudes(int[] altiList) {

        int sum = 0;

        for (int i = 0; i < altiList.length; i++) {
            /*Check to see if all spots in array are full in order to average*/
            if (altiList[i] == ' ') {
                System.out.println("Some spots in the array are blank\n Can not calculate average");
            }

            /*Check to see if any of the numbers in the array are negative*/
            if (altiList[i] < 0) {
                System.out.println("Some of the numbers are negative\n Can not calculate average");
            }
            sum = sum + altiList[i];

        }
        double average = sum / altiList.length;

        return average;
    }

    public static double findAverageScore(double[] playerScores)  {
        
        double totalScores = 0;
        for (int i = 0; i < playerScores.length; i++) {
            totalScores += playerScores[i];
        }
        double average = totalScores / playerScores.length;
        return average;        
    }
        
      

    public static Player createNewPlayer(String playerName) {

        //System.out.println("\n**** createPlayer function called ****");
        return null;
    }

}
