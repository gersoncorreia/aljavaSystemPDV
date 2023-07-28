/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aljava.model.entities;

import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author Gerson
 */
public class Utilitarios {
    public void limpaTela(JPanel container){
        Component components[] = container.getComponents();
        for(Component component: components){
            if(component instanceof JTextField){
                ((JTextField) component).setText(null);
            }
            
            if(component instanceof JComboBox){
                ((JComboBox) component).setSelectedItem(null);
            }
            if(component instanceof JSpinner){
                ((JSpinner) component).setValue(0);
            }
        }
    }
}
