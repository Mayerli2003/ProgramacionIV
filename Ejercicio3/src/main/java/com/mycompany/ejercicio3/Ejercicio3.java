/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author mmaye
 */
import javax.swing.JOptionPane;
public class Ejercicio3 {

    public static void main(String[] args) {
        String palabra;
        String numero1;
        int numero;
        
        palabra = JOptionPane.showInputDialog( "Escriba una palabra");
        numero1 = JOptionPane.showInputDialog( "Ingrese el número de repeticiones deseadas para imprimir la palabra");
        numero = Integer.parseInt(numero1);
        
        StringBuilder Mensaje= new StringBuilder();
        for(int i = 1; i <= numero; i ++){
            Mensaje.append(i).append(".").append(palabra).append("\n");
       
        }
         JOptionPane.showMessageDialog(null,  Mensaje, "Resultados", JOptionPane.PLAIN_MESSAGE);
    }
}
