/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LostOnAnIsland.view;

import byui.cit260.LostOnAnIsland.control.GameControl;
import byui.cit260.LostOnAnIsland.objectModeling.Game;

/**
 *
 * @author bethanytaylor
 */
public class StatDisplay {

    public static void displayLogList() {

        //Game.createLogList();
        int[] logList = Game.getLogList();
        int[] sortedList = GameControl.sortLogList(logList);

        for (int i = 0; i < sortedList.length; i++) {
            System.out.println(sortedList[i]);
        }
        
           
        
        }
    }
