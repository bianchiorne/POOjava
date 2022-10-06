/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int dia;
      int mes;
      int anio;
      Scanner leer = new Scanner (System.in);
      
        System.out.println("Ingrese la fecha de su nacimiento");
        
        System.out.println("Anio");
        anio = leer.nextInt();
        System.out.println("Mes");
        mes = leer.nextInt();
        System.out.println("Dia");
        dia = leer.nextInt();
        
        leer.close();
        
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        
        LocalDate fechaActual = LocalDate.now();
        
        System.out.println("La fecha ingresada es " + fechaNacimiento);
        System.out.println("La fecha actual es " + fechaActual);
        
        System.out.println("Hay " + ChronoUnit.YEARS.between(fechaNacimiento,fechaActual) + " anos de diferencia, entre la fecha ingresada y la fecha actual");
    }
    
}
