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
public class Map implements Serializable {
    
    private int row;
    private int column;
    private boolean visited;
    /*private Scene scene;*/
    
    private String location;
    
    public Map(){
    }
    
    public Map(int row, int column){
        this.row = row;
        this.column = column;
    
    
    if (row < 1 || column < 1) {
    System.out.println("number of row and columns must be > zero");
    return;
    }
    
    this.row = row;
    this.column = column;
    
    //this.IslandLocation = new IslandLocation[row][column];
    
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }


    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.location);
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
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "IslandLocation{" + "location=" + location + '}';
    }
   
   
   
   
   
    
}
