/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagementproject;

/**
 *
 * @author Rachu
 */
public class NegativeStockException extends Exception{

    public NegativeStockException(String msg) {
        super(msg);
    }
    
    
}
