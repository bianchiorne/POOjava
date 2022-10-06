package Libro.Servicios;


import Libro.entidades.LibroEntidades;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class LibroServicio {
    
     private Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
     
     public LibroEntidades crearLibro(){
         System.out.println("Introducir ISBN");
         int ISBN = leer.nextInt();
         System.out.println("Introducir Titulo");
         String titulo = leer.next();
         System.out.println("Introducir autor");
         String autor = leer.next();
         System.out.println("Introducir la cantidad de paginas");
         int paginas = leer.nextInt();
         
         return new LibroEntidades (ISBN, titulo, autor, paginas);
         
     }
     
     public LibroEntidades mostrarLibro(LibroEntidades l1)
     {
         System.out.println("El libro ingresado es: " + l1.getISBN() + l1.getAutor() + l1.getTitulo() + l1.getPaginas());
         
         return l1;
         
             
      }
}
