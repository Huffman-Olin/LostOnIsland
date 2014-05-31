/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.view;

import java.util.Scanner;

/**
 *
 * @author bethanytaylor
 */
public class MainMenuView {
    
     public static void startProgram(){
         
         MainMenuView.mainMenuDisplay();
         
     }

     public static void mainMenuDisplay(){
         
         System.out.println
                            ("\n****************************\n"
                          + "Welcome to Lost on an Island\n"
                          + "****************************");
         
         
    }
     
     public static String getUserName(String playerName){
        
            boolean valid = false;
            playerName = null;
            Scanner keyboard = new Scanner(System.in);

          
        while(!valid){ 
            
            System.out.println("Please enter your name:");
            
           
            
            playerName = keyboard.nextLine();
            playerName = playerName.trim();

            if (playerName.toUpperCase().equals("Q")) {

                return null;
            } 
         
            if (playerName.length() < 2){
                
                System.out.println("Invalid input, please enter your name.  The "
                        + "name must be greater than one character in length.");
            
            }
            
            else{
                valid = true;
            }
            System.out.println("\n" + 
                    "Welcome, " + playerName + "!");
        }

             
         return playerName;
         
     }
     
     public static void displayDescription(String playerName){
         
         System.out.println( "\n"
                 + "\n"
                 + "\n" 
                 +
                 "\n************************************************************************************"
              
                 +
                           "\n You are an experienced pilot who was traveling to your cabin several hundred "
                 + "        \n miles from home. Unfortunately, you experienced plane troubles and had to make"
                 + "        \n an emergency landing on a remote island. With only a small knife and a limited "
                 + "        \n supply of food and water, you must find 10 pieces of wood to create a signal "
                 + "        \n fire and get rescued." +

                            "\n You have 12 hours before the sun goes down and all is lost! Explore the island"
                 + "         \n to find the wood. Be careful, wild beasts lurk all around the island, and it "
                 + "         \n is not often that a delicious, “free” meal wanders their way." +
 
                            "\n As you travel around to different locations to gather wood, time will be" + 
                            "\n added as “payment” for the wood. There are several places to gather wood" +
                            "\n from, and once wood has been gathered from a location, there no longer is" +
                            "\n there. If your time reaches 12 hours and you do not have enough wood, the game"
                       +    "\n ends and you lose." +
                            "\n" +
                            "\n" +
                            "\n In the beginning of the game, you will start out with 3 lives.\n" +
                            "\n At each location to collect wood, in order to pick up the wood, you must correctly"
                 + "         \n answer a question. If you incorrectly answer a question, you loose a life and do not"
                 + "         \n pick up the wood.\n" +
                            "\n" +
                            "\n The game is over when one of the following occurs :" +
                            "\n" +
                            "\n A)\tYou are able to collect enough wood in the allotted time (You win)" +
                            "\n B)\tYou are attacked and killed by a wild animal (You lose)" +
                            "\n C)\tYour timer exceeds 12 hours (You lose)" +
                            "\n D)\tYou are poisoned by wild berries" +
                            "\n E)\tYou run out of lives" +
                            "\n**************************************************************************************");

     }
     
     public static void displayMainMenu(){
     
         System.out.println("\n*****************************\n" 
                          + "          Main Menu\n" 
                             + "*****************************"
         + "\n\n");
          
         System.out.println("        I-Instructions \n" +
                            "        M-Map\n" +
                            "        S-Storyline\n" +
                            "        H-Help\n" +
                            "        Q-Quit");
         
         System.out.println("Please enter your choice:");
      
         char choice = getMenuInput();
         mainMenuChoices(choice);
     
     }
     
     public static char getMenuInput() {
        Scanner input = new Scanner(System.in);
        String menuInput = input.nextLine();
        menuInput = menuInput.toUpperCase();

        char choice = menuInput.charAt(0);
        
        return choice;
    }
     
     public static void mainMenuChoices(char choice) {

        switch (choice) {
            case 'I': //instructions
                printInstructions();
                break;
            case 'M': //map
                System.out.println("Here is the map");
                break;
            case 'S':  //story line
                printStoryLine();
                break;
            case 'H': // Help
                System.out.println("Here is the help menu");
                break;
            case 'Q': //quit
                System.out.println("Quitting");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;

        }          
     }
     
     public static void printInstructions(){
         System.out.println("***The print instruction method has been called.***"); 
     }
     
     public static char inputMapLocation(){
         Scanner mapInput = new Scanner(System.in);
         String input = mapInput.nextLine();
         input = input.trim();
         input = input.toUpperCase();
         char userInput = input.charAt(0);
         
         return userInput;
     }
                 
     public static char changeMapLocation(){
         char userInput = inputMapLocation();
         System.out.println("You have selected " + userInput);
         return userInput;
         //System.out.println("***The map method has been called***");
     }
     
     public static void printStoryLine(){
         System.out.println("***The game background story method has been called***");
     }
    
      public static void displayInstructions(){

        }
      public int chooseMapLocation(int playerSelection){

          return playerSelection;
      }
    }





