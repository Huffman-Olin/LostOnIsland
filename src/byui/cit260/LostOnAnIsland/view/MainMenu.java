/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.view;

import static byui.cit260.LostOnAnIsland.view.MainMenuView.changeName;
import static byui.cit260.LostOnAnIsland.view.MainMenuView.displayDescription;
import static byui.cit260.LostOnAnIsland.view.MainMenuView.displayHelp;
import static byui.cit260.LostOnAnIsland.view.MainMenuView.displayInstructions;
import static byui.cit260.LostOnAnIsland.view.MainMenuView.runMapMenu;
import static byui.cit260.LostOnAnIsland.view.MainMenuView.runQuitMenu;
import java.util.Scanner;

/**
 *
 * @author bethanytaylor
 */
public class MainMenu extends View{
    
    public MainMenu(){
        
    }

    public void runMainMenu() {
        display();
        char choice = getInput();
        doAction(choice);
    }

    @Override
    public void display() {
        
        System.out.println("\n*****************************\n"
                + "          Main Menu\n"
                + "*****************************"
                + "\n");

        System.out.println("\tI-Instructions \n"
                + "\tM-Map\n"
                + "\tS-Storyline\n"
                + "\tH-Help\n"
                + "\tA-Average Score\n"
                + "\tC-Change Name\n"
                + "\tQ-Quit");
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
                case 'I': //instructions
                    displayInstructions(); //displays instructions
                    break;
                case 'M': //map
                    runMapMenu(); //displays the map menu options, calls getMenuInput(), then calls changeMapLocation()
                    break;
                case 'S':  //story line
                    displayDescription(); //displays story line
                    break;
                case 'H': // Help
                    displayHelp();
                    System.out.println("Sorted Log List");
                    StatDisplay.displayLogList();
                    System.out.println("List of Map Altitudes");
                    StatDisplay.displayAverageAltitudes();
                    break;
                case 'C': //change name
                    changeName();
                    break;
                case 'Q': //quit
                    runQuitMenu();
                    break;
                case 'A'://Average score
                    StatDisplay.displayAverageScore();
                default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;

            }
            display();
            choice = getInput();

        } while (true);
    }
    
}
