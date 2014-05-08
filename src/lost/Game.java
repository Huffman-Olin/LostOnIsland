/*
 * Lost Game
 */

package lost;

import java.io.Serializable;

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
   
}


