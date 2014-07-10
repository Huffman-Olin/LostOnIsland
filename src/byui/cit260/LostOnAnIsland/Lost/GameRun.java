package byui.cit260.LostOnAnIsland.Lost;

import Frames.StartGameFrame;
import byui.cit260.LostOnAnIsland.control.ChallengeControl;
import byui.cit260.LostOnAnIsland.exceptionHandling.MainExceptions;
import byui.cit260.LostOnAnIsland.objectModeling.Game;
import byui.cit260.LostOnAnIsland.view.ForrestChallenge;
import byui.cit260.LostOnAnIsland.view.MainMenu;
import byui.cit260.LostOnAnIsland.view.NewGameView;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GameRun {

    private static Game game = new Game();

    public static Game getGame() {
        return GameRun.game;
    }

    public static void setGame(Game game) {
        GameRun.game = game;
    }

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(
            new Runnable() {
                public void run() {
                    StartGameFrame MMF = new StartGameFrame();
                    MMF.setVisible(true);
                    
                }
            });
        
        //runNewGame();

    }

    public static void runNewGame() {

        NewGameView.mainMenuDisplay();

        boolean valid = false;
        do {
            try {
                String playerName = NewGameView.getUserName();
                NewGameView.getUserName();
                valid = true;

            } catch (MainExceptions ex) {
                System.out.println(ex.getMessage());
            }
        } while (!valid);

        MainMenu.displayDescription();
        //MainMenu.runMainMenu();
        MainMenu menu = new MainMenu();

        menu.run();
    }
}
