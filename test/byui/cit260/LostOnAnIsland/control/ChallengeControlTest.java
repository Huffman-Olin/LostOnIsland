/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author olinhuffman
 */
public class ChallengeControlTest {
    
    public ChallengeControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcTime method, of class ChallengeControl.
     */
    @Test
    public void testCalcTime() {
        System.out.println("calcTime Text #1");
        double speed = 6;
        double distance = 3;
        double playerGuess = 120;
        boolean expResult = true;
        boolean result = ChallengeControl.calcTime(playerGuess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcPhysics method, of class ChallengeControl.
     */
    @Test
    public void testCalcPhysics() {
        System.out.println("calcPhysics");
        double input = 0.0;
        double answer = 0.0;
        ChallengeControl instance = new ChallengeControl();
        double expResult = 0.0;
        //double result = ChallengeControl.calcPhysics(playerGuess);
        //assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcWaterNeeded method, of class ChallengeControl.
     */
    @Test
    public void testCalcWaterNeeded() {
        System.out.println("calcWaterNeeded");
        double expResult = 0.0;
        double result = ChallengeControl.calcWaterNeeded();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
