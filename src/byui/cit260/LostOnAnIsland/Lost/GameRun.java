
package byui.cit260.LostOnAnIsland.Lost;

import byui.cit260.LostOnAnIsland.view.MainMenu;
import byui.cit260.LostOnAnIsland.view.NewGameView;
import byui.cit260.LostOnAnIsland.view.ForrestChallenge;


public class GameRun {

  public static void main(String[] args) {
      
        runNewGame(); 
    }

   
    public static void runNewGame() {
      /*ForrestChallenge question = new ForrestChallenge();
      
      question.display();
      char input = question.getInput();
      question.doAction(input);*/
  
        NewGameView.mainMenuDisplay();
        String playerName = NewGameView.getUserName();
        MainMenu.displayDescription();
        //MainMenu.runMainMenu();
        MainMenu menu = new MainMenu();
        menu.run();
                
                
        
    }
}
