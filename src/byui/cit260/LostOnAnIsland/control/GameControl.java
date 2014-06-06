
package byui.cit260.LostOnAnIsland.control;

import byui.cit260.LostOnAnIsland.objectModeling.Game;
import byui.cit260.LostOnAnIsland.objectModeling.IslandLocation;
import byui.cit260.LostOnAnIsland.objectModeling.Player;


  /*** @author olinhuffman*/
 
public class GameControl {

    
    public static void createNewGame() {
        Game game = new Game(); //created timeRemaining, Player, Map
        IslandLocation islandLocation = new IslandLocation(); //gets and sets the player's location on the island
        
        
        
    }
    
    public static void createLogList() {
        
        int[] logList = new int[]{3, 2, 4, 2, 0};
        
        int forrest = logList[0]; 
        int cave = logList[1];
        int river = logList[2];
        int volcano = logList[3];
        int shore = logList[4];
        
        
        
    }
    
    public static void sortLogList(int[] logList) {
     
        int i, j, first, temp; 
        for ( i = logList.length - 1; i > 0; i-- ) 
        {
             first = 0;   //initialize to subscript of first element
            for(j = 1; j <= i; j ++)   //locate smallest element between positions 1 and i.
            {
                if( logList[j] < logList[first] )         
                    first = j;
            }
            temp = logList[first];   //swap smallest found with element in position i.
            logList[first] = logList[i];
            logList[i] = temp; 
        }           
}
     
    
   
    
    public static Player createNewPlayer(String playerName) {
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
       

