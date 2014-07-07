/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.LostOnAnIsland.exceptionHandling;

/**
 *
 * @author bethanytaylor
 */
    
    public class GameControlException extends Exception {

    public GameControlException() {

    }

    public GameControlException(String message) {
        super(message);
    }

    public GameControlException(Throwable cause) {
        super(cause);
    }

    public GameControlException(String message, Throwable cause) {
        super(message, cause);
    }
}
