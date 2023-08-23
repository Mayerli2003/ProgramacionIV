/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author mmaye
 */
import javax.swing.JOptionPane;
public class Ejercicio5 {

    public static void main(String[] args) {
       String primerNumero;
       String segundoNumero;
       String tercerNumero;
        
       double numero1;
       double numero2;
       double numero3;
       
       primerNumero = JOptionPane.showInputDialog( "Escriba el primer numero");
       segundoNumero = JOptionPane.showInputDialog( "Escriba el segundo numero");
       tercerNumero = JOptionPane.showInputDialog( "Escriba el tercer numero");
       
       numero1 = Double.parseDouble(primerNumero);
       numero2 = Double.parseDouble(segundoNumero);
       numero3 = Double.parseDouble(tercerNumero);
       
       String Respuesta= "";
       if (numero1 > numero2){
           if(numero1 > numero3)
           {
               String Resultado1= "El numero " + primerNumero +" es el mayor";
               Respuesta += Resultado1;
           }
       }
       if (numero2 > numero1){
           if(numero2 > numero3)
           {
               String Resultado2= "El numero " + segundoNumero +" es el mayor";
               Respuesta += Resultado2;
           }
       }
       if (numero3 > numero2){
           if(numero3 > numero1)
           {
               String Resultado3 = "El numero " + tercerNumero +" es el mayor";
               Respuesta += Resultado3;
           }
       }
       if (numero1 == numero2){
           if(numero1 == numero3)
           {
               String Resultado4= "Los numeros son iguales";
               Respuesta += Resultado4;
           }
       }
       JOptionPane.showMessageDialog(null, "Resultado de los numeros "+primerNumero+", "+segundoNumero+" y "+tercerNumero+": \n"+Respuesta,  "Resultados", JOptionPane.PLAIN_MESSAGE);
      System.exit (0);
    }
}
