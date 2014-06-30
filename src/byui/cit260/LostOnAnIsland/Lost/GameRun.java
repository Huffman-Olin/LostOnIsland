
package byui.cit260.LostOnAnIsland.Lost;

import byui.cit260.LostOnAnIsland.control.ChallengeControl;
import byui.cit260.LostOnAnIsland.objectModeling.Game;
import byui.cit260.LostOnAnIsland.view.ForrestChallenge;
import byui.cit260.LostOnAnIsland.view.MainMenu;
import byui.cit260.LostOnAnIsland.view.NewGameView;


public class GameRun {
    private static Game game = new Game();

    public static Game getGame() {
        return GameRun.game;
    }

    public static void setGame(Game game) {
        GameRun.game = game;
    }
    
    

  public static void main(String[] args) {
        runNewGame();
      
    }
  

   
    public static void runNewGame() {
    
        NewGameView.mainMenuDisplay();
        String playerName = NewGameView.getUserName();
        MainMenu.displayDescription();
        //MainMenu.runMainMenu();
        MainMenu menu = new MainMenu();
        menu.run();
    }

   
}
