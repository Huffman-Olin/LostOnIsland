/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lost;

import java.io.Serializable;

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
    
    
    
    
}
