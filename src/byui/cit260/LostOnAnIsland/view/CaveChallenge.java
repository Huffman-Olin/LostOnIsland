/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.view;

import byui.cit260.LostOnAnIsland.control.ChallengeControl;
import java.util.Scanner;

/**
 *
 * @author bethanytaylor
 */
public class CaveChallenge extends View{
 
     public CaveChallenge(){
        
    }
    
    public void run(){
        int speed, distance;
        do {
            speed = (int) (Math.random() * 10);
        } while (speed == 0);

        do {
            distance = (int) (Math.random() * 10);
        } while (distance == 0);

        display(speed, distance);

        float choice = getInputFloat();
        doAction(choice, speed, distance);
        
    }
    
    
    
     public void display(int speed, int distance){
       
         System.out.println("Rain just started pouring down on you! "
                            + "\nHow long will it take for you to get "
                            + "\nto the cave, " + distance + " miles away, if you "
                            + "\nare running at " + speed + " mph?\n\n"
                            + "**************************************"
                            + "\nEnter your anwer in minutes and round "
                            + "\nyour answer to one decimal place");
     }
     
     
    
    public float getInputFloat() {

        System.out.println("Please enter your answer:");

        //get input
        Scanner input = new Scanner(System.in);
        //round answer to one decimal place
        return Float.parseFloat(input.nextLine());

    }
    
    
    public void doAction(float choice, int speed, int distance){  
     
        boolean correct = ChallengeControl.calcTime(choice, speed, distance);
        if (correct){
            System.out.println("Correct! You just earned 4 logs!");
        }
        else{
            System.out.println("Wrong. Sorry, you have to walk back to the shore without any more logs");
            

        }
    }
}
