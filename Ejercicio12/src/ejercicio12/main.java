/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import Entidades.Persona;
import Servicio.personaServicio;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personaServicio pers = new personaServicio();

        Persona p1 = pers.crearPersona();
        Persona p2 = pers.crearPersona();

        pers.mostrarPersona(p1);
        pers.mostrarPersona(p2);

        System.out.println(p1.getNombre() + "tiene" + pers.cacularEdad(p1) + "anos");
        System.out.println(p2.getNombre() + "tiene" + pers.cacularEdad(p2) + "anos");

        if (pers.menorQue(p1, pers.cacularEdad(p2)) == true) {
            System.out.println(p1.getNombre() + " es menor que " + p2.getNombre());

        } else {
            System.out.println(p2.getNombre() + "es menor que " + p1.getNombre());
        }
    }

       
    }
    

