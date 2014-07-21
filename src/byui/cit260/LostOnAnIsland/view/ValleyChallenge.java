/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.view;

import Frames.ValleyFrame;

/**
 *
 * @author bethanytaylor
 */
public class ValleyChallenge extends View{
    
    private ValleyFrame vf;
    
    public ValleyChallenge() {

    }
    
    
    public void run() {
        
        vf = new ValleyFrame();
        this.display();
        vf.setVisible(true);
        
    }
    
    


    @Override
    public void display() {
        String valleyDesc = "It took you over 4 hours to hike to the valley."
                + "\nYou just passed out on the soft grass and are dreaming."
                + "\nWhich chemical in the brain causes dreams?"
                + "\n"
                + "\n"
                + "A) Dimethyltryptamine\n"
                + "B) Hydrocortisone\n"
                + "C) Testosterone\n"
                + "D) Morphine\n";
        
         vf.getValleyDesc().setText(valleyDesc);

    }



    public void doAction(String value) {
        char choice = value.toUpperCase().charAt(0);
        while (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
            System.out.println("Invalid selection");
            choice = getInput().toUpperCase().charAt(0);
        }

        if (choice == 'A') {
            System.out.println("\nCorrect! You just recieved one log.");
        } else {
            System.out.println("\nSorry that is not the correct chemical"
                    + "\n have fun walking back to shore with NOTHIN!");
        }
}
}