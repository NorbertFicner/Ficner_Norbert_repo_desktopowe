/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf.gridlayout;

/**
 *
 * @author zalman
 */
public class Actions {
    private double number1, number2;
    private String charOfAction;

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }
    
    public void plus(){
        charOfAction = "+";
    }
    
    public void minus(){
        charOfAction = "-";
    }
    public void multiple(){
        charOfAction = "*";
    }
    public void divide(){
        charOfAction = "/";
    }
    
    
    
    
    
    
    
    
}
