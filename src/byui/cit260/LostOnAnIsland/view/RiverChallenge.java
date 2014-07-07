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
public class RiverChallenge extends View {
    
       public static double playerTime = 4.5;

    public RiverChallenge() {

    }

      public void run() {
        super.run();

    }

    @Override
    public void display() {
        System.out.println("You just tripped over a bunny and fell into"
                + "\nthe river.  True or False, the river will help you "
                + "\nfloat better, than if you had fallen into the ocean."
                + "\n"
                + "\n"
                + "T) True\n"
                + "F) False\n");
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
