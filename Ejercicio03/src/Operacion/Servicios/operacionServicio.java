package Operacion.Servicios;

import Operacion.Entidades.Operacion;
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
public class operacionServicio {
    Scanner leer = new Scanner (System.in);
    
    
    public Operacion crearOperacion(){
        System.out.println("Ingrese el primer número");
        int n1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número");
        int n2 = leer.nextInt(); 
        
        return new Operacion (n1,n2);
    }
    
    
   public int sumar(int n1, int n2){
       int suma = n1+n2;
       return suma;
       
   }
     public int restar(int n1, int n2){
       int resta = n1-n2;
       return resta;
   }
   
   
    public int multiplicar(int n1, int n2) {
        int multiplicacion = 0;
        if (n1 != 0 && n2 != 0) {
            multiplicacion = n1 * n2;
        } else {
            System.out.println("No se puede multiplicar entre 0");
        }

        return multiplicacion;
    }
 
 
    public double dividir(int n1, int n2) {
        double division = 0;
        if (n1 != 0 && n2 != 0) {
            division = n1 / n2;
        } else {
            System.out.println("No se puede dividir entre 0");
        }
       return division;
   }
         
}
