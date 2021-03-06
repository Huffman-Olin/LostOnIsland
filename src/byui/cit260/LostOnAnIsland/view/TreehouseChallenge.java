/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.view;

import Frames.TreehouseFrame;

/**
 *
 * @author bethanytaylor
 */
public class TreehouseChallenge extends View{
    
     private TreehouseFrame tf; 
    
       public TreehouseChallenge() {

    }

    public void run() {
        tf = new TreehouseFrame();
        this.display();
        tf.setVisible(true);
        
    }


    @Override
    public void display() {
        String treeDesc = "You are inside a tree house you found on the island."
                + "\nYou found a cantine half filled with water and an old flashlight."
                + "\nThe tree house is made of wood you can use to burn, back at the"
                + "\nshore. As you tried prying some wood off the house, you got a "
                + "\nnasty cut on your forearm.  What will stop the bleeding the "
                + "\nquickest?"
                + "\n"
                + "\n"
                + "A) Pouring water on the cut\n"
                + "B) Take the flashlight and shine the light into the cut\n"
                + "C) Put your hand over the cut to cover it\n"
                + "D) Rip a piece of your shirt and bandage your arm above the elbow\n";
                
        tf.getTreeDesc().setText(treeDesc);

    }


    public void doAction(String value) {
        
        char choice = value.toUpperCase().charAt(0);

        while (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'D') {
            System.out.println("Invalid selection");
            choice = getInput().toUpperCase().charAt(0);
        }

        if (choice == 'D') {
            System.out.println("\nCorrect! You recovered quickly and now you have another log");
        } else {
            System.out.println("\nSorry that is not the correct way to stop the"
                    + "\nbleeding quickly. You were not able to pull the wood free."
                    + "\nNow you have to walk back to shore with NOTHIN!");
        }
}
}
