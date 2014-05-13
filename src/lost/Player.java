



package lost;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author bethanytaylor
 */


public class Player implements Serializable{
    
    private String name;
    private int score;
    private int woodCamp;
    private int woodCarrying;
    
    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getWoodCamp() {
        return woodCamp;
    }

    public void setWoodCamp(int woodCamp) {
        this.woodCamp = woodCamp;
    }

    public int getWoodCarrying() {
        return woodCarrying;
    }

    public void setWoodCarrying(int woodCarrying) {
        this.woodCarrying = woodCarrying;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", score=" + score + ", woodCamp=" + woodCamp + ", woodCarrying=" + woodCarrying + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.score;
        hash = 29 * hash + this.woodCamp;
        hash = 29 * hash + this.woodCarrying;
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.score != other.score) {
            return false;
        }
        if (this.woodCamp != other.woodCamp) {
            return false;
        }
        return this.woodCarrying == other.woodCarrying;
    }
    
    
    
    
}
