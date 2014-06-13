/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.view;

import byui.cit260.LostOnAnIsland.control.ChallengeControl;
import byui.cit260.LostOnAnIsland.control.GameControl;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author bethanytaylor
 */
public class StatDisplayTest {
    
    public StatDisplayTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of displayLogList method, of class StatDisplay.
     */
    

    /**
     * Test of displayAverageAltitudes method, of class StatDisplay.
     */
    @Test
    public void testDisplayAverageAltitudes() {
        System.out.println("displayAverageAltitudesTest1");
        StatDisplay.displayAverageAltitudes();
        // TODO review the generated test code and remove the default call to fail.
        
        int expResult = 3;
        int[] altiList = null;
        double result = GameControl.averageAltitudes(altiList);
    }
    
    
    
    /**
     * Test of InputScores method, of class StatDisplay.
     
    @Test
    public void testInputScores() {
        System.out.println("InputScores");
        StatDisplay.InputScores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAverageScore method, of class StatDisplay.
     
    @Test
    public void testFindAverageScore() {
        System.out.println("findAverageScore");
        StatDisplay instance = new StatDisplay();
        instance.findAverageScore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   */ 
}
