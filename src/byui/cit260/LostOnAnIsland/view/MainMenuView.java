/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LostOnAnIsland.view;

import byui.cit260.LostOnAnIsland.control.MenuControl;
import java.util.Scanner;

/**
 *
 * @author bethanytaylor
 */
public class MainMenuView {

    public static void runNewGame() {

        MainMenuView.mainMenuDisplay();
        String playerName = MainMenuView.getUserName();
        MainMenuView.displayDescription();
        MainMenuView.runMainMenu(); 
    }

    public static void mainMenuDisplay() {

        System.out.println("\n****************************\n"
                + "Welcome to Lost on an Island\n"
                + "****************************");

    }

    public static String getUserName() {

        boolean valid = false;
        String playerName = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {

            System.out.println("Please enter your name:");

            playerName = keyboard.nextLine();
            playerName = playerName.trim();

            if (playerName.toUpperCase().equals("Q")) {

                return null;
            }

            if (playerName.length() < 2) {

                System.out.println("Invalid input, please enter your name.  The "
                        + "name must be greater than one character in length.");

            } else {
                valid = true;
            }
            System.out.println("\n"
                    + "Welcome, " + playerName + "!");
        }

        return playerName;

    }

    public static void displayDescription() {

        System.out.println("\n"
                + "\n"
                + "\n"
                + "\n************************************************************************************"
                + "\n You are an experienced pilot who was traveling to your cabin several hundred "
                + "        \n miles from home. Unfortunately, you experienced plane troubles and had to make"
                + "        \n an emergency landing on a remote island. With only a small knife and a limited "
                + "        \n supply of food and water, you must find 10 pieces of wood to create a signal "
                + "        \n fire and get rescued."
                + "\n You have 12 hours before the sun goes down and all is lost! Explore the island"
                + "         \n to find the wood. Be careful, wild beasts lurk all around the island, and it "
                + "         \n is not often that a delicious, “free” meal wanders their way."
                + "\n As you travel around to different locations to gather wood, time will be"
                + "\n added as “payment” for the wood. There are several places to gather wood"
                + "\n from, and once wood has been gathered from a location, there no longer is"
                + "\n there. If your time reaches 12 hours and you do not have enough wood, the game"
                + "\n ends and you lose."
                + "\n"
                + "\n"
                + "\n In the beginning of the game, you will start out with 3 lives.\n"
                + "\n At each location to collect wood, in order to pick up the wood, you must correctly"
                + "         \n answer a question. If you incorrectly answer a question, you loose a life and do not"
                + "         \n pick up the wood.\n"
                + "\n"
                + "\n The game is over when one of the following occurs :"
                + "\n"
                + "\n A)\tYou are able to collect enough wood in the allotted time (You win)"
                + "\n B)\tYou are attacked and killed by a wild animal (You lose)"
                + "\n C)\tYour timer exceeds 12 hours (You lose)"
                + "\n D)\tYou are poisoned by wild berries"
                + "\n E)\tYou run out of lives"
                + "\n**************************************************************************************");

    }

    public static void runMainMenu() {
        printMainMenu();

        char choice = getMenuInput();
        mainMenuChoices(choice);

    }

    public static void printMainMenu() {

        System.out.println("\n*****************************\n"
                + "          Main Menu\n"
                + "*****************************"
                + "\n");

        System.out.println("\tI-Instructions \n"
                + "\tM-Map\n"
                + "\tS-Storyline\n"
                + "\tH-Help\n"
                + "\tC-Change Name\n"
                + "\tQ-Quit");

    }

    public static char getMenuInput() {
        System.out.println("Please enter your choice:");

        Scanner input = new Scanner(System.in);
        String menuInput = input.nextLine();
        menuInput = menuInput.toUpperCase(); //string function 1

        char choice = menuInput.charAt(0); //string function 2

        return choice;
    }

    public static void mainMenuChoices(char choice) {

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
                    break;
                case 'C': //change name
                    changeName();
                    break;
                case 'Q': //quit
                    runQuitMenu();
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;

            }
            printMainMenu();
            choice = getMenuInput();

        } while (true);
    }

    public static void displayInstructions() {
        System.out.println("*********************************************************"
        +                  "\nThe objective of the game is to collect enough wood "
        +                  "\nto start a signal fire and be rescued. Decide on a "
        +                  "\nmap location to go to. Once there, attempt to collect"
                +          "\nthe wood. In order to collect that wood, you must"
                +          "\nanswer the trivia question correctly. If you are able "
                +          "\nto answer the question correctly, you will pick up that"
                +          "\npiece of wood. Your timer starts at 12 hours, and each"
                +          "\nwood pile has a time amount assigned to it. If your time"
                +          "\nruns out before you have collected the right amount of"
                +          "\nwood, then you will loose the game."
                +          "*********************************************************");
    }

   public static void runMapMenu(){
        displayMap();
        char choice = getMenuInput();
        getMapInput(choice);
        
    }

    public static void displayMap() {
        
      MapDisplay map = new MapDisplay();
      map.display();
      
      System.out.println("\n"
              +          "\tMap Locations"
              +          "\n"
              +          "\n\tS-Shore \t3 hours"
              +          "\n\tV-Volcano \t5 hours"
              +          "\n\tF-Forest \t.5 hours"
              +          "\n\tR-River \t4 hours"
              +          "\n\tC-Cave          2 hours");
    }
    
    public static void getMapInput(char choice){
        do{
            switch (choice) {
                case 'S':
                    ChallengeDisplay.displayShoreChallenge();
                    break;
                case 'V':
                    ChallengeDisplay.displayVolcanoChallenge();
                    break;
                case 'F':
                    ChallengeDisplay.displayForestChallenge();
                    break;
                case 'R':
                    ChallengeDisplay.displayRiverChallenge();
                    break;
                case 'C':
                    ChallengeDisplay.displayCaveChallenge();
                    break;
                case 'M': 
                    return;
                default:
                    System.out.println("Invalid selection. Try again or go away!");
            }
        
          displayMap();
            choice = getMenuInput();

        } while (true);
    }
    

    public static void displayHelp() {
        System.out.println("\n**********************************************************"
                + "\nEach menu will take you through the game.  By selecting "
                + "\na choice, you will be prompted to give more "
                + "\ninput based on your choice.  You will complete the game "
                + "\nonce you have completed enough challenges to recieve an "
                + "\nadequate amount of wood and brought it back to camp. Once "
                + "\nyou have taken enough logs of wood to camp, you will be "
                + "\nable to make a fire and be rescued. Once this has happened the"
                + "\ngame will end.  Or you can quit using the main menu option \"quit\" "
                + "\n**************************************************************");

    }

    public static void changeName() {
        System.out.println("We understand that some people suffer from multiple "
                + "personality disorder. Which one are you?");
        
        boolean valid = false;
        String playerName = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {

            System.out.println("Please enter this personalities name:");

            playerName = keyboard.nextLine();
            playerName = playerName.trim();

            if (playerName.toUpperCase().equals("Q")) {

                return;
            }

            if (playerName.length() < 2) {

                System.out.println("Invalid input, please enter your name.  The "
                        + "name must be greater than one character in length.");

            } else {
                valid = true;
            }
            System.out.println("\n"
                    + "Thank you, " + playerName + "!");
        }
        
        //this sets the new name of the player
       //Player.setName(playerName);

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

    public static void runQuitMenu() {
        printQuitMenu();

        char choice = getMenuInput();
        quitMenuChoices(choice);
    }

    public static void quitMenuChoices(char choice) {

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

            choice = getMenuInput();

        } while (true);

    }

    public static void displayCredits() {

        System.out.println("\nThis game is the property of Olin Huffman and Bethany Larsen."
                + "\nIn no way, shape, or form can this game be tampered with."
                + "\nBut on the off chance that you should attempt such a thing,"
                + "\nknow that it will result in your complete termination. "
                + "\nAnd we're not taking about the player in the game, we're talking"
                + "\nabout you. Beware and watch your back.... Thanks for playing!\n\n");

    }

}
