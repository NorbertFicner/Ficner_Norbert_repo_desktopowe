/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listazakupow;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author zalman
 */
public class HowManyProducts {
    
    private String file_name = "lista_zakupow.csv";
    public void ileProduktow(){
        int ileproduktow = 0;
        try{
          String message = "";
          Scanner sc = new Scanner(new File(file_name));
          while(sc.hasNext()){
              sc.nextLine();
              ileproduktow++;
          }
            System.out.print("W liscie jest : " + ileproduktow + " produktow");
      }
      catch(FileNotFoundException ex){
          System.out.print(ex.toString());
      }
        
    }
    
    
}
