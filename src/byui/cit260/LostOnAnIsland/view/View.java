/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LostOnAnIsland.view;

import byui.cit260.LostOnAnIsland.Lost.GameRun;
import byui.cit260.LostOnAnIsland.control.ChallengeControl;
import byui.cit260.LostOnAnIsland.control.GameControl;
import byui.cit260.LostOnAnIsland.objectModeling.Player;
import java.util.Scanner;

/**
 *
 * @author bethanytaylor
 */
public abstract class View implements ViewInterface {

    public void run() {
        /*int challengeTime = run();*/
        display();
        String value = getInput();
        doAction(value);
    }

    public void display() {

    }

    public String getInput() {

        boolean valid = true;
        String menuInput;
        do {
            valid = true;

            Scanner input = new Scanner(System.in);

            menuInput = input.nextLine();
            if (menuInput.length() < 1) {
                System.out.println("Invalid input.");
                valid = false;

            }

        } while (!valid);

        menuInput = menuInput.toUpperCase(); //string function 1

        String choice = menuInput; //string function 2

        return choice;

    }


    public void printTime() {
        int time = GameRun.getGame().getCurrentTime();

        if (time == 1) {
            System.out.println("You have " + time + " hour left.");
        } else {
            System.out.println("You have " + time + " hours left.");

        }

    }

}
