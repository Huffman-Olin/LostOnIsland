
package byui.cit260.LostOnAnIsland.objectModeling;

import byui.cit260.LostOnAnIsland.control.GameControl;
import byui.cit260.LostOnAnIsland.view.MainMenuView;


public class GameTest {

  public static void main(String[] args) {
      

     MainMenuView.startProgram(); 
     MainMenuView.getUserName(null);
     GameControl.createPlayer(null);

     MainMenuView.displayMainMenu();
     
    }
}
