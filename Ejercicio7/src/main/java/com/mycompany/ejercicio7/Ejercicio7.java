/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

/**
 *
 * @author mmaye
 */
import javax.swing.JOptionPane;
public class Ejercicio7 {

    public static void main(String[] args) {
        String radius;
        double Radio;
        
        radius=JOptionPane.showInputDialog("Ingrese el radio de la circunferencia");
        
        Radio=Double.parseDouble(radius);
        
        double AreaC=Math.PI* Radio * Radio;
        double SuperficieEsfera= 4 *Math.PI* Radio *Radio;
        double VolumenEsfera= (4.0/3.0) * Math.PI* Radio * Radio * Radio;
        
        
        
        JOptionPane.showMessageDialog(null, "Los resultados  con el radio "+Radio+"cm :"+" \n El área del círculo: "+ AreaC +"cm²"+"\n La superficie de la esfera: "+ SuperficieEsfera+"cm²"+"\n Volumen de la esfera: "+VolumenEsfera+"cm³",  "Resultados", JOptionPane.PLAIN_MESSAGE);
      System.exit (0);
    }
}
