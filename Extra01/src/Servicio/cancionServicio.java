/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class cancionServicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Cancion crearCancion() {
        String autor;
        String titulo;

        System.out.println("Ingrese el autor de la cancion");
        autor = leer.next();

        System.out.println("Ingrese el titulo de la cancion");
        titulo = leer.next();

        return new Cancion(autor, titulo);
    }
    
    
}