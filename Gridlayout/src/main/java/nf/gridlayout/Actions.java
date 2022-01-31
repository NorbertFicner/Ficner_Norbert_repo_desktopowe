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
    private double number1, number2,equal;
    private String charOfAction;

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getEqual() {
        return equal;
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
    public double equal(){
        switch(charOfAction){
            case "+":
                equal = number1 + number2;
                break;
            case "-":
                equal = number1 - number2;
                break;
            case "*":
                equal = number1 * number2;
                break;
            case "/":
                equal = number1 / number2;
                break;
                
        }
        
        return equal;
    }
    
    public void clear(){
        number1 = 0;
        number2 = 0;
    }
    
    
    
    
    
    
    
    
}
