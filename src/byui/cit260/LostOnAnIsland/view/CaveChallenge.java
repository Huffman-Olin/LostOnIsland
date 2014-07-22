/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LostOnAnIsland.view;

import Frames.CaveFrame;
import Frames.CaveFrame;
import byui.cit260.LostOnAnIsland.control.ChallengeControl;
import byui.cit260.LostOnAnIsland.exceptionHandling.ChallengeControlExceptions;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bethanytaylor
 */
public class CaveChallenge extends View {

    private CaveFrame CF;
    private int speed, distance;

    public CaveChallenge() {
        CF = new CaveFrame();
        CF.setVisible(true);

    }
    //private MapMenu mm;
    // MapMenu mm = new MapMenu();
    //mm.doAction("C");

    public void displayStartFrame() {

    }

    @Override
    public void run() {

        do {
            speed = (int) (Math.random() * 10);
        } while (speed == 0);

        do {
            distance = (int) (Math.random() * 10);
        } while (distance == 0);

        display(speed, distance);

    }

    public void checkInput() {
        boolean valid = false;
        do {

            try {
                float choice = getInputFloat();

                doAction(choice, speed, distance);
                valid = true;
            } catch (ChallengeControlExceptions ex) {
                JOptionPane.showMessageDialog(CF, "The disatance must be a number", "Invalid distance", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } while (!valid);

    }

    public void display(int speed, int distance) {

        String caveDesc = "Rain just started pouring down on you! "
                + "\nHow long will it take for you to get "
                + "\nto the cave, " + distance + " miles away, if you "
                + "\nare running at " + speed + " mph?\n\n"
                + "**************************************"
                + "\nEnter your anwer in minutes and round "
                + "\nyour answer to one decimal place";

        CF.getCaveDesc().setText(caveDesc);

    }

    public float getInputFloat() {

        //System.out.println("Please enter your answer:");
        //get input
        String value = CF.getCaveInput().getText();
        //round answer to one decimal place
        try {
            return Float.parseFloat(value);
        }
        
        catch(NumberFormatException ex) {
            //JOptionPane.showMessageDialog(CF, "Please enter in a valid number", "Invalid number", JOptionPane.ERROR_MESSAGE);
            CF.getMessage().setText("Please enter a valid number");
            return -1.0f;
        }

    }

    public void doAction(float value, int speed, int distance) throws ChallengeControlExceptions {

        boolean correct = ChallengeControl.calcTime(value, speed, distance);
        if (correct) {
            String message = "Correct! You just earned 4 logs!";
            CF.getMessage().setText(message);

        } else {
            String message = "Wrong. Sorry, you have to walk back to the shore without any more logs";
            CF.getMessage().setText(message);

        }
    }

    @Override
    public void doAction(String choice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
