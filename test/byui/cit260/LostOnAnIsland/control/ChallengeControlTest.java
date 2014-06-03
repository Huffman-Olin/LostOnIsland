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
    public void testCalcTime1() {
        System.out.println("calcTime Text #1");
        double playerGuess = 120;

        int expResult = 1;
        int result = ChallengeControl.calcTime(playerGuess);

        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
       

        
    }
    
     @Test
    public void testCalcTime2() {
        System.out.println("calcTime Text #2");
        double playerGuess = 0;
        int expResult = -1;
        int result = ChallengeControl.calcTime(playerGuess);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testCalcTime3() {
        System.out.println("calcTime Text #3");
        double playerGuess = -140;
        int expResult = -1;
        int result = ChallengeControl.calcTime(playerGuess);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testCalcTime4() {
        System.out.println("calcTime Text #4");
        double playerGuess = 1;
        int expResult = 1;
        int result = ChallengeControl.calcTime(playerGuess);
        assertEquals(expResult, result);
        
    }

     @Test
    public void testCalcTime5() {
        System.out.println("calcTime Text #5");
        double playerGuess = 501;
        int expResult = -1;
        int result = ChallengeControl.calcTime(playerGuess);
        assertEquals(expResult, result);
        

    }
  

    
     /*Test of calcPhysics method, of class ChallengeContrProgramControl */         
   
     @Test
    public void testCalcPhysics1() {
        System.out.println("calcPhysics Test #1");
        int playerGuess = 200;
        int expResult = 1;
        int result = ChallengeControl.calcPhysics(playerGuess);
        assertEquals(expResult, result, 0.0); 
    }
    
    /**
     *
     */
   
    @Test
    public void testCalcPhysics2() {
        System.out.println("calcPhysics Test #2");
        int playerGuess = -120;
        int expResult = -1;
        int result = ChallengeControl.calcPhysics(playerGuess);
        assertEquals(expResult, result, 0.0); 
    }
    
       @Test
    public void testCalcPhysics3() {
        System.out.println("calcPhysics Test #3");
        int playerGuess = 0;
        int expResult = -1;
        int result = ChallengeControl.calcPhysics(playerGuess);
        assertEquals(expResult, result, 0.0); 
    }
    
    
     @Test
    public void testCalcPhysics4() {
        System.out.println("calcPhysics Test #4");
        int playerGuess = 1;
        int expResult = 1;
        int result = ChallengeControl.calcPhysics(playerGuess);
        assertEquals(expResult, result, 0.0); 
    }
    
       @Test
    public void testCalcPhysics5() {
        System.out.println("calcPhysics Test #5");
        int playerGuess = 200;
        int expResult = 1;
        int result = ChallengeControl.calcPhysics(playerGuess);
        assertEquals(expResult, result, 0.0); 
    }
    
    
     /* Test of calcWaterNeeded method, of class ChallengeControl.*/
     
    @Test

    public void testCalcWaterNeeded1() {
        System.out.println("Test 1");
        double playerGuess = 5;
        boolean expResult = false;
        boolean result = ChallengeControl.calcWaterNeeded(playerGuess);
        assertEquals(expResult, result);
        
    
}
    @Test
      public void testCalcWaterNeeded2() {
        System.out.println("Test 2");
        double playerGuess = 25;
        boolean expResult = false ;
        boolean result = ChallengeControl.calcWaterNeeded(playerGuess);
        assertEquals(expResult, result);
        
    
}
     public void testCalcWaterNeeded3() {
        System.out.println("Test 3");
        double playerGuess = 0;
        boolean expResult = false ;
        boolean result = ChallengeControl.calcWaterNeeded(playerGuess);
        assertEquals(expResult, result);
        
    
}
       public void testCalcWaterNeeded4() {
        System.out.println("Test 4");
        double playerGuess = -2;
        boolean expResult = false;
        boolean result = ChallengeControl.calcWaterNeeded(playerGuess);
        assertEquals(expResult, result);
}

    public void testCalcWaterNeeded5() {
        
        System.out.println("Test 5");
        double playerGuess = 2;
        boolean expResult = false;
        boolean result = ChallengeControl.calcWaterNeeded(playerGuess);
        assertEquals(expResult, result);
        
    }
}

