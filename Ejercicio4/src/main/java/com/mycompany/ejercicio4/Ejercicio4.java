/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author mmaye
 */
import javax.swing.JOptionPane;
public class Ejercicio4 {

    public static void main(String[] args) {
        String primerNumero;
        String segundoNumero;
        
        
        double numero1;
        double numero2;
        double division;
        double resta;
        double multiplicacion;
        double suma;
      primerNumero = JOptionPane.showInputDialog( "Escriba el primer numero");
      segundoNumero = JOptionPane.showInputDialog( "Escriba el segundo numero");
      
      
      numero1 = Double.parseDouble(primerNumero);
      numero2 = Double.parseDouble(segundoNumero);
      
      suma = numero1 + numero2;
      resta = numero1 - numero2;
      multiplicacion= numero1 * numero2;
      
      String Resultados="";
      
      if(numero2 != 0){
          division= numero1 / numero2;
          Resultados += "\n La division: "+ division;
        
      }
      else{
          JOptionPane.showMessageDialog(null, "No es posible dividir entre 0","Resultados", JOptionPane.PLAIN_MESSAGE);
      }
      
      JOptionPane.showMessageDialog(null, "Los resultados de los dos valores ingresados son los siguientes: \n La suma: "+ suma +"\n La resta: "+ resta + "\n La multiplicacion: "+ multiplicacion + Resultados,  "Resultados", JOptionPane.PLAIN_MESSAGE);
      System.exit (0);
    }
}
