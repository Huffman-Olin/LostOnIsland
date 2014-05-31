
package byui.cit260.LostOnAnIsland.objectModeling;

import byui.cit260.LostOnAnIsland.control.GameControl;
import byui.cit260.LostOnAnIsland.view.MainMenuView;


public class GameTest {

  public static void main(String[] args) {
      

     MainMenuView.startProgram(); 
     String playerName = MainMenuView.getUserName();
     MainMenuView.displayDescription();
     MainMenuView.runMainMenu();
     MainMenuView.changeMapLocation();

     
     /*MainMenuView.getMenuInput();
     GameControl.createPlayer(null);

     MainMenuView.runMainMenu();
     */
     
   
    }
}
