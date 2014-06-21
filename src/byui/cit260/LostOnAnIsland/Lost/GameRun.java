
package byui.cit260.LostOnAnIsland.Lost;

import byui.cit260.LostOnAnIsland.view.MainMenu;
import byui.cit260.LostOnAnIsland.view.NewGameView;


public class GameRun {

  public static void main(String[] args) {
      
        runNewGame(); 
    }

   
    public static void runNewGame() {
        NewGameView.mainMenuDisplay();
        String playerName = NewGameView.getUserName();
        MainMenu.displayDescription();
        //MainMenu.runMainMenu();
        MainMenu menu = new MainMenu();
        menu.runMainMenu();
        
    }
}