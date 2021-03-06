package byui.cit260.LostOnAnIsland.control;

import Frames.LoseFrame;
import byui.cit260.LostOnAnIsland.Lost.GameRun;
import byui.cit260.LostOnAnIsland.exceptionHandling.ChallengeControlExceptions;
import java.awt.Frame;

/**
 * * @author olinhuffman
 */
public class ChallengeControl {

    public static boolean calcTime(float playerGuess, int speed, int distance) throws ChallengeControlExceptions {

        /**
         * * @author olinhuffman
         */
        /*
         BEGIN
         GET input	
         CHECK input
    
         CALC minuteTime (t); distance/speed = t
         ASSIGN t to var = correctTime
         COMPARE correctTime to input
   
         RETURN boolean value; var = answer
         END
         */
        boolean result;

        if (playerGuess < 0 || playerGuess > 500) {
            throw new ChallengeControlExceptions("Invalid answer");
        } else {

            //Generate random numbers for distance and speed   
            // Can not be 0
            // Round number to one decimal place
            //Calculate minuteTime
            float hourTime = (float) distance / (float) speed;
            float minuteTime = (hourTime * 60.0f);
            minuteTime = Math.round(minuteTime * 10) / 10.0f;

            result = (minuteTime == playerGuess);

        }
        /*System.out.println(result);*/
        return result;

    }

    public static int calcPhysics(double playerGuess) {

        /*BEGIN
         GET input
         CHECK input
         CALC minuteTime (t) Formula: t = (vf - vi) / a
         ASSIGN (t) to var = correctTime
         COMPARE correctTime to input
         RETURN Boolean value; var = answer
         END*/
        int result;

        if (playerGuess <= 0 || playerGuess > 500) {
            result = -1;
        } else {

            int finalVel = (int) (Math.random() * 25);

            if (finalVel == 0) {

                finalVel = (int) (Math.random() * 25);
            }

            System.out.println("FinalVelocity = " + finalVel);

            double time = finalVel / 9.8;

            System.out.println("Time = " + time);

            if (time == playerGuess) {

                result = 1;
            } else {
                result = 1;
            }

        }
        return result;
    }

    public static boolean calcWaterNeeded(double playerGuess) {
        boolean result;

        if (playerGuess < 0 || playerGuess > 25) {
            result = false;
        } else {

            int berrieEaten = (int) (Math.random() * 15);
            System.out.println("Berries Eaten = " + berrieEaten);

            double waterToDrink = (berrieEaten / 3) * 5;

            System.out.println("Water to drink = " + waterToDrink);

            if (waterToDrink == playerGuess) {

                result = true;
            } else {
                result = false;
            }

        }
        return result;
    }
    
    public static int calcTimeRemaining(int challengeTime){
       
        int currentTime = GameRun.getGame().getCurrentTime();
        currentTime -= challengeTime;
        GameRun.getGame().setCurrentTime(currentTime);
        
       
            
        if(currentTime <= 0){
            //this.dispose();
            Frame[] frames = Frame.getFrames();
            for (Frame frame : frames) {
                frame.dispose();
                //frame.setVisible(true);
            }
            LoseFrame lf = new LoseFrame();
            lf.setVisible(true);
            
        }
        
        
        return currentTime;
        
    }

    public static void addLogs(int i) {
        
        GameRun.getGame().setLogs(GameRun.getGame().getLogs() + i);
    }
    
    
}
