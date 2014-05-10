/*
 * Lost Game
 */

package lost;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author bethanytaylor and Olin Huffman
 */
public class Game implements Serializable{
    
    private String gameName;
    private double timeRemaining;
    
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
    
    /**************************************************************************/
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        System.out.println("I just want to print out something!");
        Player playerOne = new Player();
    }
   
}


