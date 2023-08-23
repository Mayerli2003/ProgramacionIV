/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

/**
 *
 * @author mmaye
 */
import javax.swing.JOptionPane;
public class Ejercicio6 {

    public static void main(String[] args) {
       String altura;
       String base;
       
       double Altura;
       double Base;
       
       altura=JOptionPane.showInputDialog("Ingrese la altura del rectangulo en centimetros");
       base=JOptionPane.showInputDialog("Ingrese la base del rectangulo en centimetros");
       
       Altura=Double.parseDouble(altura);
       Base=Double.parseDouble(base);
       
       double Area= Base * Altura;
       double Perimetro= 2*(Base + Altura);
       
       JOptionPane.showMessageDialog(null, "Los resultados del rectángulo con: base "+Base+"cm"+" y altura "+Altura+"cm"+" \n El área: "+ Area +"cm²"+"\n El perímetro: "+ Perimetro+"cm",  "Resultados", JOptionPane.PLAIN_MESSAGE);
      System.exit (0);
    }
}


