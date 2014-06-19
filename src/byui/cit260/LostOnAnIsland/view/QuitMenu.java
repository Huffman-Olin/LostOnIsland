/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.view;

import byui.cit260.LostOnAnIsland.control.MenuControl;
import static byui.cit260.LostOnAnIsland.view.MainMenu.displayCredits;

/**
 *
 * @author bethanytaylor
 */
public class QuitMenu extends View{
    
    public QuitMenu(){
        
    }
    
    public void runQuitMenu(){
         display();
        char choice = getInput();
        doAction(choice);
        
    }
    
    @Override
    public void display() {
     System.out.println("\n*****************************\n"
                + "          Quit Menu\n"
                + "*****************************"
                + "\n\n");

        System.out.println("        R-Return to game \n"
                + "        S-Save and quit\n"
                + "        Q-Quit without saving game\n"
                + "        C-Credits\n");
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
                case 'R': //return to game
                    return; //displays main menu 
                case 'S': //save the game by storing data away, and quit by cancelling game
                    MenuControl.saveGame();
                    MenuControl.quitGame();
                    break;
                case 'Q':  //cancels game
                    MenuControl.quitGame();
                    break;
                case 'C': // display credits 
                    displayCredits();
                    printQuitMenu();
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;

            }

            choice = getInput();

        } while (true);

    }
     
     
    public static void printQuitMenu() {
        System.out.println("\n*****************************\n"
                + "          Quit Menu\n"
                + "*****************************"
                + "\n\n");

        System.out.println("        R-Return to game \n"
                + "        S-Save and quit\n"
                + "        Q-Quit without saving game\n"
                + "        C-Credits\n");
    }

}
