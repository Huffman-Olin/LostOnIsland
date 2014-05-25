
package byui.cit260.LostOnAnIsland.control;

  /*** @author olinhuffman*/
 
public class ChallengeControl {

        public static int calcTime(double playerGuess){
            


  /*** @author olinhuffman*/            
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
            
            int result;
            
            if (playerGuess <= 0 || playerGuess > 500){
                 result = -1;
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
                    result = 1;
                }   
                else{
                    result = 1;
                }
            
            
            }
            System.out.println(result);
            return result;
            
        }

    static double calcWaterNeeded() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        public int calcPhysics(double playerGuess){
            
        /*BEGIN
            GET input
            CHECK input
            CALC minuteTime (t) Formula: t = (vf - vi) / a
            ASSIGN (t) to var = correctTime
            COMPARE correctTime to input
            RETURN Boolean value; var = answer
        END*/
             int result;
            
            if (playerGuess <= 0 || playerGuess > 500){
                 result = -1;
            }
            
            else{
                
                
            int finalVel = (int) (Math.random() * 25);
            
            if (finalVel == 0){
                    
                finalVel = (int) (Math.random() * 25);
            }
            
            System.out.println("FinalVelocity = " + finalVel);
                
            double time = finalVel / 9.8;
            
            System.out.println("Time = " + time);
            
            if (time == playerGuess){
                
                result = 1;
            }
            
            else {
                result = 1;
            }

            }
            return result;
        }

        public static boolean calcWaterNeeded(double playerGuess){
        boolean result;
            
            if (playerGuess < 0 || playerGuess > 25){
                 result = false;
            }
            
            else{
                
                
            int berrieEaten = (int) (Math.random() * 15);
            System.out.println("Berries Eaten = " + berrieEaten);
                
            double waterToDrink = (berrieEaten / 3) * 5;
            
            System.out.println("Water to drink = " + waterToDrink);
            
            if (waterToDrink == playerGuess){
                
                result = true;
            }
            
            else {
                result = false;
            }

            }
            return result;
        }   
            } 


