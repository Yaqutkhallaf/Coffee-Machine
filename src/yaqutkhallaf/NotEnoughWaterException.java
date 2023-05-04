

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaqutkhallaf;

/**
 *
 * @author student
 */
public class NotEnoughWaterException extends Exception{

    @Override
    public String getMessage() {
        return  "Sorry there is no enough water int the tank,please fill it";
    }
    
}
