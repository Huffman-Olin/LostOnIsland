/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LostOnAnIsland.view;

import Frames.CaveFrame;
import Frames.RiverFrame;

/**
 *
 * @author bethanytaylor
 */
public class RiverChallenge extends View {
       
    private RiverFrame rc = null;
    
    public static double playerTime = 4.5;

    public RiverChallenge() {

    }

      public void run() {
         RiverFrame rc = new RiverFrame();
         rc.setVisible(true);
         display();
    }

    @Override
    public void display() {
        String riverDesc = "You just tripped over a bunny and fell into"
                + "\nthe river.  True or False, the river will help you "
                + "\nfloat better, than if you had fallen into the ocean."
                + "\n"
                + "\n"
                + "T) True\n"
                + "F) False\n";
        
        rc.getRiverDesc().setText(riverDesc);
    }


    public void doAction(String value) {
        char choice = value.toUpperCase().charAt(0);

        while (choice != 'F' && choice != 'T') {
            System.out.println("Invalid selection");
            choice = getInput().toUpperCase().charAt(0);
        }

        if (choice == 'F') {
            System.out.println("Congratulations, that is the correct answer!");
        } else {
            System.out.println("Sorry, that is the wrong answer.");
        }

    }

}
