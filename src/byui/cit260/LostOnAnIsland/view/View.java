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
public abstract class View implements ViewInterface{
    
    public void run(){
        display();
        char choice = getInput();
        doAction(choice);

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
