/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.objectModeling;

import byui.cit260.LostOnAnIsland.control.Constant;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author olinHuffman
 */
public class IslandLocation implements Serializable {
    
    private int row;
    private int column;
    private boolean visited;
    /*private Scene scene;*/
    
    private String location;
    
    public IslandLocation(){
    }
    
    public IslandLocation(int row, int column){
     
    if (row < 1 || column < 1) {
        System.out.println("Number of row and columns must be > zero");
        return;
    }
    
    this.row = row;
    this.column = column;
    //creates a 2D array
    IslandLocation map[][] = new IslandLocation[Constant.MAP_ROW_COUNT][Constant.MAP_COLUMN_COUNT];
    
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
        final IslandLocation other = (IslandLocation) obj;
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
