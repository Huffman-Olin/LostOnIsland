
package byui.cit260.LostOnAnIsland.Lost;

import byui.cit260.LostOnAnIsland.objectModeling.Game;
import byui.cit260.LostOnAnIsland.view.ForrestChallenge;
import byui.cit260.LostOnAnIsland.view.MainMenu;
import byui.cit260.LostOnAnIsland.view.NewGameView;


public class GameRun {
    private static Game game;

    public static Game getGame() {
        return game;
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

    public static double calcTimeRemaining() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
