/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JButton;

/**
 *
 * @author North_PC
 */
public class CustomButton extends JButton{    
    private int tag;

    public CustomButton(String name) {
        super(name);       
        this.tag = 0;        
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getTag() {
        return tag;
    }
    
    
    
}
