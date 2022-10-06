/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class personaServicio {
    
    Scanner leer = new Scanner (System.in);
    
    public void crearPersona(Persona persona1){
        System.out.println("Ingrese su nombre");
        persona1.setNombre(leer.next());
        
        System.out.println("Ingrese su edad");
        persona1.setEdad(leer.nextInt());
        
        System.out.println("Ingrese su sexo");
        String sexo = leer.next();
        
        if(sexo.equals("m") || sexo.equals("h") || sexo.equals("o")){
            persona1.setSexo(sexo);

       } else {
            System.out.println("Incorrecto al ingresar el sexo");
        }
        
        System.out.println("Ingrese su peso");
        persona1.setPeso(leer.nextInt());
        
        System.out.println("Ingrese su altura");
        persona1.setAltura(leer.nextInt());
    }
    
    public double calcularIMC(Persona persona1){
        int altura = persona1.getAltura();
        int peso = persona1.getPeso();
        int resultado = 0;
        double imc = peso / (altura*altura);
        
        
        if (imc<20) {
            System.out.println("Está debajo del peso ideal");
         
            
        } else if (imc >=20 && imc <=25){
            System.out.println("Está en su peso ideal ");
  
            
        } else if (imc >25){
            
         System.out.println("Tiene sobrepeso");
   
           }

        return resultado;
        }
    
    public boolean esMayorDeEdad(Persona persona1){
        boolean mayor=false;
        int edad = persona1.getEdad();
        
        
        if (edad >= 18){
            mayor = true;
            System.out.println("Es mayor de edad");
            
        } else {
    
            System.out.println("Es menor de edad");
        }
        return mayor;
    }
    
    
    
}
