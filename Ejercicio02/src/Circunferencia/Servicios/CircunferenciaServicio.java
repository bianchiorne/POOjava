/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia.Servicios;

import Circunferencia.Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CircunferenciaServicio {
 
    Scanner leer = new Scanner (System.in);
    
    public void  crearCircunferencia(Circunferencia circObjeto){
        System.out.println("Ingrese el radio");
        circObjeto.setRadio(leer.nextDouble());
          System.out.println(circObjeto.getRadio());     
    }
            
    public void area(Circunferencia circObjeto){
        double area= Math.PI*(circObjeto.getRadio()*circObjeto.getRadio());
         //double area= Math.PI*(Math.pow(circObjeto.getRadio(), 2));
         System.out.println(area);
        
    }
    
     public void perimetro(Circunferencia circObjeto){
         double perimetro=2* Math.PI*(circObjeto.getRadio());
         System.out.println(perimetro);
    }
}

