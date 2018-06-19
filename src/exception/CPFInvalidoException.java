/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author jesp
 */
public class CPFInvalidoException extends Exception {

    public CPFInvalidoException() {
        
    }
    public CPFInvalidoException(String message) {
        super(message);
    }

}
