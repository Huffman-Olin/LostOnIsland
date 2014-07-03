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
public class MainExceptions extends Exception {

    public MainExceptions() {

    }

    public MainExceptions(String message) {
        super(message);
    }

    public MainExceptions(Throwable cause) {
        super(cause);
    }

    public MainExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
