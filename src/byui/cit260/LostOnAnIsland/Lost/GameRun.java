
package byui.cit260.LostOnAnIsland.Lost;

import byui.cit260.LostOnAnIsland.view.MainMenu;
import byui.cit260.LostOnAnIsland.view.NewGameView;
import byui.cit260.LostOnAnIsland.view.QuestionView;


public class GameRun {

  public static void main(String[] args) {
      
        runNewGame(); 
    }

   
    public static void runNewGame() {
      QuestionView question = new QuestionView();
      
      question.display();
      char input = question.getInput();
      question.doAction(input);
  
        
        /*
        NewGameView.mainMenuDisplay();
        String playerName = NewGameView.getUserName();
        MainMenu.displayDescription();
        //MainMenu.runMainMenu();
        MainMenu menu = new MainMenu();
        menu.runMainMenu();
                
                */
        
    }
}
