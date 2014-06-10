/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.control;

import byui.cit260.LostOnAnIsland.objectModeling.Challenge;
import byui.cit260.LostOnAnIsland.objectModeling.IslandLocation;
import byui.cit260.LostOnAnIsland.objectModeling.Map;

/**
 *
 * @author bethanytaylor
 */
public class MapControl {
    
     private static void createMap() {
        
        //create instance of IslandLocation class
        IslandLocation map[][] = new IslandLocation[Constant.MAP_ROW_COUNT][Constant.MAP_COLUMN_COUNT];
        
      
        /*for (int row = 0; row < Constant.MAP_ROW_COUNT; row++) {
        
            for (int column = 0; column < Constant.MAP_COLUMN_COUNT; column++) {
            
            IslandLocation location = new IslandLocation();
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);
            map[row][column] = location;
            }
            */
        
        
        //assign locations to 2D map array
        /*
        map[0][0] = Challenge.setName("shore");
        map[0][4] = Challenge.setName("volcano");
        map[2][3] = Challenge.setName("forrest");
        map[0][3] = Challenge.setName("river");
        map[0][1] = Challenge.setName("cave");
        */
  
            
     }
  
    
     
     private static void setLocation(Map location, int row, int column) {
         
        
         //IslandLocation[1][2] = 
     }
}
