/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

import Entidades.Persona;
import Servicios.personaServicio;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      personaServicio service = new personaServicio();
      
      Persona pers1 = new Persona();
     // Persona pers2 = new Persona();
      //Persona pers3 = new Persona();   
     // Persona pers4 = new Persona();
            
       service.crearPersona(pers1);
       //service.crearPersona(pers2);
       //service.crearPersona(pers3);
       //service.crearPersona(pers4);
      
      service.calcularIMC(pers1);
      //service.calcularIMC(pers2);
     // service.calcularIMC(pers3);
      //service.calcularIMC(pers4);
       
    
      
    }
    
}
