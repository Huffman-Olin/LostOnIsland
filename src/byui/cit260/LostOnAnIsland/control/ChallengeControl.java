
package byui.cit260.LostOnAnIsland.control;

import java.text.DecimalFormat;

  /*** @author olinhuffman*/
 
public class ChallengeControl {

        public static boolean calcTime(double playerGuess){
            
    DecimalFormat numFormat = new DecimalFormat("#.0");
            
            /*
            BEGIN
                GET input	
                CHECK input
                IF(input < 0) THEN
                        RETURN -1
                IF(input > 2) THEN
                        RETURN -1

                CALC minuteTime (t); distance/speed = t
                ASSIGN t to var = correctTime
                COMPARE correctTime to input
                IF (correctTime == input)
                        RETURN true
                IF (correctTime != input)
                        RETURN false

                RETURN boolean value; var = answer
            END
            */
            
            boolean result;
            
            if (playerGuess < 0 || playerGuess > 2){
                 result = false;
            }
            else{
            
                
            
            //Generate random numbers for distance and speed   
            // Can not be 0
            // Round number to one decimal place
            
            int speed = (int) (Math.random() * 10);
            if (speed == 0){
                speed = (int) (Math.random() * 10);
            }
                
            System.out.println("Speed is " + speed);
            
            
            int dist = (int) (Math.random() * 8);
            if (dist == 0){
                dist = (int) (Math.random() * 8);
            }
            
            System.out.println("Distance is " + dist);
               
            
            
            //Calculate minuteTime
            
            double hourTime = (double)dist/(double)speed;
            int minuteTime = (int)(hourTime * 60.0);
            System.out.println("Time is " + minuteTime);
            
            if (minuteTime == playerGuess){
                result = true;
            }
            else{
                result = false;
            }
            
            }
            
            System.out.println(result);
            return result;
            
        }
        
        
        public double calcPhysics(double input, double answer){
            
        /*    
        BEGIN
            GET input
            CHECK input
            IF (input > 0) THEN
                    RETURN -1 (incorrect)
            IF(input > 20) THEN
                    RETURN -1

            CALC minuteTime (t) Formula: t = (vf - vi) / a
            ASSIGN (t) to var = correctTime
            COMPARE correctTime to input
            IF(correctTime == input) THEN
                    RETURN true
            IF(correctTime != input) THEN
                    RETURN = false

            RETURN Boolean value; var = answer
        END
        */

            return answer;
        }
        
}
