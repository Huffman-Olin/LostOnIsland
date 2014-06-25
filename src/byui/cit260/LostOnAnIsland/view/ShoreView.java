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
public class ShoreView extends View{
    
    public void ShoreView() {

    }
    
     public void run(){
        super.run();
        
    }

    @Override
    public void display() {
        System.out.println("************************************************\n"
                + "You're at the shore.  What would you like to do?\n"
                + "\nM-Map"
                + "\nD-Drop off Logs"
                + "\nB-Build Fire"
                + "\nI-Inventory");
    }
    

    @Override
    public char getInput() {

        char choice = super.getInput();

        return choice;

    }

    @Override
    public void doAction(char choice) {
        
       
        do {
            switch (choice) {
                case 'M':
                    return;
                case 'D':
                    System.out.println("You are not carrying any logs");
                    break;    
                case 'B':
                    System.out.println("This function needs to check if \nthey have enough logs and build a fire\n if not, they need to go get more logs.");
                    break;
                case 'I':
                    System.out.println("This function needs to display inventory");
                    break;
                default:
                    System.out.println("Invalid selection");
            }

            //display();
            choice = getInput();

        } 
       while (true); 
    }
}
