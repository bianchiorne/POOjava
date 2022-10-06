/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class personaServicio {
    private Scanner leer = new Scanner (System.in);
    
    
    public Persona crearPersona() {
        System.out.println("\nIngrese nombre");
        String nombre = leer.nextLine();
       
        System.out.println("Ingrese la fecha de su nacimiento");

        System.out.println("Anio");
        int anio = Integer.parseInt(leer.nextLine());
        System.out.println("Mes");
        int mes = Integer.parseInt(leer.nextLine());
        System.out.println("Dia");
        int dia = Integer.parseInt(leer.nextLine());
        
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        
        return new Persona(nombre,fechaNacimiento);

}
    public void mostrarPersona (Persona persona1){
        
        System.out.println(persona1.toString());
        
    }
        
        public int cacularEdad(Persona persona1){
            
        LocalDate fechaNacimiento = persona1.getFechaNacimiento();
        LocalDate fechaActual = LocalDate.now();
        
        int calcularEdad = (int) ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
        
        return calcularEdad;
    }
        
        public boolean menorQue(Persona persona1, int edad){
          
        boolean esMenor = false;
        int edadPersona = cacularEdad(persona1);

        if (edadPersona < edad) {
            esMenor = true;

        } else {
            esMenor = false;
        }
        return esMenor;
    }
    
}