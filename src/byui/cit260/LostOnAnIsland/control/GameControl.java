
package byui.cit260.LostOnAnIsland.control;

import byui.cit260.LostOnAnIsland.objectModeling.IslandLocation;
import byui.cit260.LostOnAnIsland.objectModeling.Player;


  /*** @author olinhuffman*/
 
public class GameControl {

    
    public static void startNewGame() {
        
        
        
    }
    
    public static void createChallengeList() {
        
    }
    
        public static Player createPlayer(String playerName) {
            System.out.println("\n**** createPlayer function called ****");
            return null;
        }

    /* 
    Syntax for creating an array
        private static String[] createBlankList() {
            String[] Blank = new String[Constant.NUMBER_OF_BLANK];
        }
        
    How to create the Map
        Location[][] map = new Location[rows][clumns];
        
    How to create each slot in the map
        2 for-statements are needed
       */ 
    private static void createMap() {
        IslandLocation[][] map = new IslandLocation[Constant.MAP_ROW_COUNT][Constant.MAP_COLUMN_COUNT];
        
        for (int row = 0; row < Constant.MAP_ROW_COUNT; row++) {
        
            for (int column = 0; column < Constant.MAP_COLUMN_COUNT; column++) {
            IslandLocation location = new IslandLocation();
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);
            map[row][column] = location;
        }
        }
        
        }
}
       

