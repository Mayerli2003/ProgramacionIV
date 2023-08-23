/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author mmaye
 */
import java.util.*;
import javax.swing.JOptionPane;
public class Ejercicio2 {

    public static void main(String[] args) {
        String nombre;
        String apellido;
    
      nombre = JOptionPane.showInputDialog( "Escriba el nombre");
      apellido = JOptionPane.showInputDialog( "Escriba el apellido");
    
      JOptionPane.showMessageDialog(null,   nombre + " "+ apellido +" "+ new Date(), "Resultados", JOptionPane.PLAIN_MESSAGE);
      System.exit (0);
    }
}
