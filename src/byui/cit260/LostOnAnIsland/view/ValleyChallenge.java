/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.view;

/**
 *
 * @author bethanytaylor
 */
public class ValleyChallenge extends View{
    public ValleyChallenge() {

    }
    
    
    public void run() {
        
        super.run();
        
    }
    
    


    @Override
    public void display() {
        System.out.println("It took you over 4 hours to hike to the valley."
                + "\nYou just passed out on the soft grass and are dreaming."
                + "\nWhich chemical in the brain causes dreams?"
                + "\n"
                + "\n"
                + "A) Dimethyltryptamine\n"
                + "B) Hydrocortisone\n"
                + "C) Testosterone\n"
                + "D) Morphine\n");

    }

    @Override
    public char getInput() {

        char choice = super.getInput();

        return choice;

    }

    public void doAction(char choice) {

        while (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
            System.out.println("Invalid selection");
            choice = getInput();
        }

        if (choice == 'A') {
            System.out.println("\nCorrect! You just recieved one log.");
        } else {
            System.out.println("\nSorry that is not the correct chemical"
                    + "\n have fun walking back to shore with NOTHIN!");
        }
}
}