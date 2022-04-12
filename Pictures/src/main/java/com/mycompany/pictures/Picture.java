/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pictures;

import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author norbertficner
 */

public class Picture {
    
    private File f;
    private String info;
    private ImageIcon icon;
        
    public Picture(File f, String info, ImageIcon icon) {
        this.f = f;
        this.info = info;
        this.icon = icon;
    }
    
    public File getF() {
        return f;
    }

    public String getInfo() {
        return info;
    }

    

    
}
