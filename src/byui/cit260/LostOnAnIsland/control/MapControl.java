/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.control;

import byui.cit260.LostOnAnIsland.objectModeling.IslandLocation;
import byui.cit260.LostOnAnIsland.objectModeling.Map;

/**
 *
 * @author bethanytaylor
 */
public class MapControl {
    
     private static void createMap() {
        Map[][] map = new Map[Constant.MAP_ROW_COUNT][Constant.MAP_COLUMN_COUNT];
        
        for (int row = 0; row < Constant.MAP_ROW_COUNT; row++) {
        
            for (int column = 0; column < Constant.MAP_COLUMN_COUNT; column++) {
            
            Map location = new Map();
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);
            map[row][column] = location;
            }
        }
        
        
 
        
    }
     
     private static void setLocation(IslandLocation location, int row, int column) {
         
        
         //IslandLocation[1][2] = 
     }
}
