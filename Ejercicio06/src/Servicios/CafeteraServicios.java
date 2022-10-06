/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CafeteraServicios {
    Scanner leer = new Scanner(System.in);
    
   
    public Cafetera crearCafetera(){
        System.out.println("Ingrese la cantidad maxima de la cafetera: ");
        int cantMaxima = leer.nextInt();
        
        System.out.println("Ingrese la cantidad actual de la cafetera: ");
        int cantActual=leer.nextInt();
        
        return new Cafetera(cantMaxima, cantActual);
        
    }
    
    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
           System.out.println("Se llenó por completo la cafetera");
    }
    
    public void servirTaza(Cafetera cafetera){
        
        
        System.out.println("Ingrese el tamaño de la taza");
        int tamTaza = leer.nextInt();
        
        int cActual = cafetera.getCantidadActual();
        int calculo = cActual-tamTaza;
        
        if (cActual < tamTaza){
            System.out.println("La cantidad de cafe que hay no alcanza a llenar la taza, se pudo llenar " + cActual);
            
            cafetera.setCantidadActual(0);
            
        } else if (cActual == tamTaza){
            System.out.println("Se lleno la taza");
            System.out.println("La cafetera quedo vacia");
            
            cafetera.setCantidadActual(0);
            
        } else {
            System.out.println("La taza se lleno completamente");
            System.out.println("La cafetera quedó con una cantidad actual de " + calculo );
           cafetera.setCantidadActual(calculo);
                         
           }
    }
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
        System.out.println("Se vacio la cafetera");
    }
    
    public void agregarCafe(Cafetera cafetera){
        System.out.println("Ingrese la cantidad de cafe que desea agregar");
        int cantidad = leer.nextInt();
        int actual = cafetera.getCantidadActual();
        int carga = actual+cantidad;
        
        if (carga<cafetera.getCapacidadMaxima()){
            cafetera.setCantidadActual(carga);
            System.out.println("Se ha cargado " + cantidad + "milimetros a la cafetera");
            System.out.println("La cantidad actual es " + cafetera.getCantidadActual());
                        
        } else {
            System.out.println("La canitdad que desea agregar supera la maxima");
        }
    }
}
