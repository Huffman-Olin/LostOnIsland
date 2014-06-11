/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.view;

import byui.cit260.LostOnAnIsland.control.Constant;
import byui.cit260.LostOnAnIsland.objectModeling.Map;

/**
 *
 * @author bethanytaylor
 */
public class MapDisplay {
    
    private Map map;
    
    public MapDisplay(){
        
        map = new Map();
    }
    
    public void display(){
         for (int row = 0; row < Constant.MAP_ROW_COUNT; row++) {

            for (int column = 0; column < Constant.MAP_COLUMN_COUNT; column++) {
                System.out.print(map.getDisplayCharAt(row, column));
                System.out.print(" ");
                
            }
            System.out.print("\n");
        }
    }
    
    
    
}
