
package byui.cit260.LostOnAnIsland.control;

import java.util.Scanner;


  /*** @author olinhuffman*/
 
public class MenuControl {

     public static void startProgram(){
         
         MenuControl.mainMenuDisplay();
         
    }
     
     
     
     public static void mainMenuDisplay(){
         
         System.out.println("Welcome to Lost on an Island");
         
         
    }
     
     public static String getUserName(){
        
            boolean valid = false;
            String playerName = null;
            Scanner keyboard = new Scanner(System.in);

          
        while(!valid){ 
            
            System.out.println
                       ("\n***********************"
                    +   "\nPlease enter your name:"
                       +"\n***********************");
            
           
            
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
                    "Thank you, " + playerName);
        }
            
             
         return playerName;
         
     }

}
