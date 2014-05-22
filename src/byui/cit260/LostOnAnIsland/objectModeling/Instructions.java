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
public class Instructions implements Serializable {
    
     private String gameInstructions;
    private String instructionType;

    public String getGameInstructions() {
        return gameInstructions;
    }

    public void setGameInstructions(String gameInstructions) {
        this.gameInstructions = gameInstructions;
    }

    public String getInstructionType() {
        return instructionType;
    }

    public void setInstructionType(String instructionType) {
        this.instructionType = instructionType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.gameInstructions);
        hash = 37 * hash + Objects.hashCode(this.instructionType);
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
        final Instructions other = (Instructions) obj;
        if (!Objects.equals(this.gameInstructions, other.gameInstructions)) {
            return false;
        }
        if (!Objects.equals(this.instructionType, other.instructionType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Instructions{" + "gameInstructions=" + gameInstructions + ", instructionType=" + instructionType + '}';
    }
    
    
   
    
    
    
}
