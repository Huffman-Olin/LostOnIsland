/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.view;

import byui.cit260.LostOnAnIsland.Lost.GameRun;
import byui.cit260.LostOnAnIsland.control.ChallengeControl;
import byui.cit260.LostOnAnIsland.control.GameControl;
import byui.cit260.LostOnAnIsland.objectModeling.Player;
import java.util.Scanner;

/**
 *
 * @author bethanytaylor
 */
public abstract class View implements ViewInterface{
    public double playerTime;

    public void setPlayerTime(double playerTime) {
        this.playerTime = 3;
    }

    public double getPlayerTime() { 
        return playerTime;
    }
    
    
    
    
    
    public void run(){
        /*int challengeTime = run();*/
        display();
        char choice = getInput();
        doAction(choice);
    }
       
        
        
        public int time(){
           int remainTime = 6;
            
            if(remainTime <= 0){
            System.out.println("Time has run out and you have died. Too bad...");
        }
        else{
            System.out.println("Lucky you, you still have time.");
        }
           
        
       return remainTime; 
        
    }
    
  
    

    
    public void display(){
       
                
    }
    
  

    
    public char getInput(){
      
        System.out.println("Please enter your choice:");

        Scanner input = new Scanner(System.in);
        String menuInput = input.nextLine();
        menuInput = menuInput.toUpperCase(); //string function 1

        char choice = menuInput.charAt(0); //string function 2

        return choice;
    }
        
    
    
    public void doAction(char choice){  
        
    }
    
}
