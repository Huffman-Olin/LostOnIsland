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
public class SwampChallenge extends View{
    
    public SwampChallenge() {

    }

    public void run() {
        super.run();

    }


    @Override
    public void display() {
        System.out.println("You tried to get over the swamp by walking on a small"
                + "\nlog but you slipped and now your feet are stuck in the mud."
                + "\nIf you want to free yourself quickly, you must sacrifice one of"
                + "\nyour inventory items. If you wish to keep your items it will"
                + "\n take you longer to get free."
                + "\n"
                + "\n"
                + "A) Sacrifie a log, kindling, or stone and free yourself now.\n"
                + "B) Don't use an item and take 2 hours to free yourself.\n");

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

        if (choice == 'B') {
            System.out.println("\nCall the function that will take 2 hours off current time");
        } else {
            System.out.println("\nCall the function that will take away an item of inventory:"
                    + "\nIF they have a log, take it away"
                    + "\nELSE IF they have kindling, take it away"
                    + "\nELSE IF they have a stone, take it away"
                    + "\nELSE Print out, you don't have an inventory item to sacrifice "
                    + "\nso it took you two hours to free yourself.");
        }

       
    }
}
