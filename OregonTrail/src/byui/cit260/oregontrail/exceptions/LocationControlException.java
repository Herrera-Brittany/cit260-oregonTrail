/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.exceptions;

/**
 *
 * @author cbald
 */
public class LocationControlException extends Exception {

    public LocationControlException() {
    }

    public LocationControlException(String string) {
        super(string);
    }

    public LocationControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public LocationControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public LocationControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
