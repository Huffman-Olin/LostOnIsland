
package byui.cit260.LostOnAnIsland.control;


  /*** @author olinhuffman*/
 
public class ChallengeControl {

        public static boolean calcTime(double playerGuess){
            
  
            
            /*
            BEGIN
                GET input	
                CHECK input
                IF(input < 0) THEN
                        RETURN -1
                IF(input > 2) THEN
                        RETURN -1

                CALC time (t); distance/speed = t
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
            
            //Generate random distance and speed
            
            double speed = Math.floor(Math.random() * 5);
            System.out.println(speed);
            double dist = Math.floor(Math.random() * 4);
            System.out.println(dist);
            
            //Calculate time
            
            double time = (dist/speed) / 60;
            
            if (time == playerGuess){
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

            CALC time (t) Formula: t = (vf - vi) / a
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
