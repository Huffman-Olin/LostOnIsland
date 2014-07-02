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
public class Game implements Serializable {

    private int currentTime;
    private int logs;
    private Player player; //Create player object
    private Map gameMap;
    private static int[] logList = new int[]{0, 5, 2, 4, 3};
    private static int[] altiList = new int[]{0, 2093, 456, 12, 330};

    //create array to store how many logs are at each location
    //assign initial numbers to each slot
    //Shore=0, Cave=5, Forrest=2, Volcano=4, River=3
    public Game() {
        currentTime = 12;
        logs = 0;
    }

    public void setLogs(int logs) {
        this.logs = logs;
    }

    public int getLogs() {
        return logs;
    }
    /*public static void createLogList() {

     logList = new int[]{0, 5, 2, 4, 3};

     /*int shore = logList[0]; 
     int cave = logList[1];
     int forrest = logList[2];
     int volcano = logList[3];
     int river = logList[4];
     }
     */

    public static int[] getAltiList() {
        return altiList;
    }

    public static int[] getLogList() {
        return logList;
    }

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

    public int getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(int remainingTime) {

        this.currentTime = remainingTime;
    }

    @Override
    public String toString() {
        return "Game{" + "timeRemaining=" + currentTime + ", player=" + player + ", gameMap=" + gameMap + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.currentTime) ^ (Double.doubleToLongBits(this.currentTime) >>> 32));
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
        if (Double.doubleToLongBits(this.currentTime) != Double.doubleToLongBits(other.currentTime)) {
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
