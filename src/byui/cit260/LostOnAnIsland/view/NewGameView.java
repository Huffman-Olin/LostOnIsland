/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.view;

import byui.cit260.LostOnAnIsland.control.MenuControl;
import byui.cit260.LostOnAnIsland.exceptionHandling.MainExceptions;
import java.util.Scanner;

/**
 *
 * @author bethanytaylor
 */
public class NewGameView {

    
    
    public static void mainMenuDisplay() {
        System.out.println("\n****************************\n" + "Welcome to Lost on an Island\n" + "****************************");
    }
    
    public static String getUserName() throws MainExceptions {
        boolean valid = false;
        String playerName = null;
        Scanner keyboard = new Scanner(System.in);
        while (!valid) {
            System.out.println("Please enter your name:");
            playerName = keyboard.nextLine();
            playerName = playerName.trim();
            if (playerName.toUpperCase().equals("Q")) {
                MenuControl.quitGame();
            }
            if (playerName.length() < 2) {
                throw new MainExceptions("Invalid input, please enter your name.  "
                        + "The " + "name must be greater than two character in length.");
            } else {
                valid = true;
            }
            System.out.println("\n" + "Welcome, " + playerName + "!");
        }
        return playerName;
    }

    
    
}
