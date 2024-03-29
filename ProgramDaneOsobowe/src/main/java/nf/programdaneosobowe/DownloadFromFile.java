/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nf.programdaneosobowe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zalman
 */
public class DownloadFromFile {
    private File f = new File("data.csv");
    private String data,name, surname, classOfSchool, yearOfStartEducation;
     
    public ArrayList<Data> downloadFromFile() throws FileNotFoundException{
        ArrayList<Data> list = new ArrayList();
        Scanner sc = new Scanner(f);
        while(sc.hasNext()){
           data = sc.nextLine();
           String[]dataTab = data.split(";");
  
           name = dataTab[0];
           surname = dataTab[1];
           classOfSchool = dataTab[2];
           yearOfStartEducation = dataTab[3];
           
           String nametab[] = name.split(" - ");
           String surnametab[] = surname.split(" - ");
           String classofSchooltab[] = classOfSchool.split(" - ");
           String yearOfStarEducationtab[] = yearOfStartEducation.split(" - ");

           Data data = new Data(nametab[1], surnametab[1], classofSchooltab[1], yearOfStarEducationtab[1]);
           
           list.add(data);
        }
        
        return list;
    }

}

