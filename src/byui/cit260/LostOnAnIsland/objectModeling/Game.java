
package byui.cit260.LostOnAnIsland.objectModeling;

/*
 * Lost Game
 */


import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author bethanytaylor and Olin Huffman
 */
public class Game implements Serializable{
    
    private String gameName;
    private double timeRemaining;
    private Player player; //Create player object
    private Instructions instructions;// Create instructions objcet
    private Map gameMap;//Create map object

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Instructions getInstructions() {
        return instructions;
    }

    public void setInstructions(Instructions instructions) {
        this.instructions = instructions;
    }

    public Map getGameMap() {
        return gameMap;
    }

    public void setGameMap(Map gameMap) {
        this.gameMap = gameMap;
    }
    
     public Game() {
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(double timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    @Override
    public String toString() {
        return "Game{" + "gameName=" + gameName + ", timeRemaining=" + timeRemaining + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.gameName);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.timeRemaining) ^ (Double.doubleToLongBits(this.timeRemaining) >>> 32));
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.gameName, other.gameName)) {
            return false;
        }
        return Double.doubleToLongBits(this.timeRemaining) == Double.doubleToLongBits(other.timeRemaining);
    }
   
}
