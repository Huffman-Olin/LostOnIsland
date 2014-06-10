
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
    
    
    private double timeRemaining;
    private Player player; //Create player object
    private Map gameMap;
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getGameMap() {
        return gameMap;
    }

    public void setGameMap(Map gameMap) {
        this.gameMap = gameMap;
    }
    
     public Game() {
    }


    public double getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(double timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    @Override
    public String toString() {
        return "Game{" + "timeRemaining=" + timeRemaining + ", player=" + player + ", gameMap=" + gameMap + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.timeRemaining) ^ (Double.doubleToLongBits(this.timeRemaining) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.player);
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
        if (Double.doubleToLongBits(this.timeRemaining) != Double.doubleToLongBits(other.timeRemaining)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.gameMap, other.gameMap)) {
            return false;
        }
        return true;
    }

    
   
}
