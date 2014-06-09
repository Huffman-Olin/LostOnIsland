/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.objectModeling;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author olinHuffman
 */
public class IslandLocation implements Serializable {
    
    public IslandLocation(){
        
    }

      private String playerLocation;
    private boolean displayMap;
    
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
        final IslandLocation other = (IslandLocation) obj;
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
