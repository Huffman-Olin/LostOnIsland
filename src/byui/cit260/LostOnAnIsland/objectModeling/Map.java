/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.objectModeling;

import byui.cit260.LostOnAnIsland.control.Constant;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author olinHuffman
 */
public class Map implements Serializable {

    private IslandLocation map[][];

    public Map() {
        //creates a 2D array
        map = new IslandLocation[Constant.MAP_ROW_COUNT][Constant.MAP_COLUMN_COUNT];
        
        
         
        for (int row = 0; row < Constant.MAP_ROW_COUNT; row++) {

            for (int column = 0; column < Constant.MAP_COLUMN_COUNT; column++) {
                map[row][column] = new IslandLocation(row, column);
                
            }
        }
        map[4][0].setDisplayChar('S');
        map[0][4].setDisplayChar('V');
        map[1][1].setDisplayChar('C');
        map[2][3].setDisplayChar('R');
        map[4][3].setDisplayChar('F');
    }

    private String playerLocation;
    private boolean displayMap;
    
    public char getDisplayCharAt(int row, int column) {
        
        if (row < 0 || row >= Constant.MAP_ROW_COUNT && 
            (column < 0 || column >= Constant.MAP_COLUMN_COUNT)) {
            return 0; //out of bounds
        }
            
            
        return map[row][column].getDisplayChar();
        
    }

    public String getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(String playerLocation) {
        this.playerLocation = playerLocation;
    }

    public boolean isDisplayMap() {
        return displayMap;
    }

    public void setDisplayMap(boolean displayMap) {
        this.displayMap = displayMap;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.playerLocation);
        hash = 53 * hash + (this.displayMap ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.playerLocation, other.playerLocation)) {
            return false;
        }
        if (this.displayMap != other.displayMap) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "playerLocation=" + playerLocation + ", displayMap=" + displayMap + '}';
    }

}
