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
    
    private char displayChar; //holds character that will be displayed
    private int row;
    private int column;
    private boolean visited;
    /*private Scene scene;*/

    private String location;

    public IslandLocation() {
        
        displayChar = '-'; //default character to display on all map locations
    }

    public IslandLocation(int row, int column) {

        /*if (row < 1 || column < 1) {
            System.out.println("Number of row and columns must be > zero");
            return;
        }*/

        this.row = row;
        this.column = column;
        
        displayChar = '-'; //default character to display on all map locations
    }
    
    public char getDisplayChar() {
        return displayChar;
    }

    public void setDisplayChar(char displayChar) {
        this.displayChar = displayChar;
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
