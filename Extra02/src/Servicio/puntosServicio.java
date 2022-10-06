/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class puntosServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPuntos(Puntos point){
        System.out.println("Ingrese la coordenada x1");
        point.setX1(leer.nextInt());
        System.out.println("Ingrese la coordenada y1");
        point.setY1(leer.nextInt());
        System.out.println("Ingrese la coordenada x2");
        point.setX2(leer.nextInt());
        System.out.println("Ingrese la coordenada y2");
        point.setY2(leer.nextInt());
        
        
    }
    
    public double medirDistancia(Puntos point){
        return Math.sqrt(Math.pow(point.getX2() - point.getX1(),2) + Math.pow(point.getY2()-point.getY1(), 2));
    }
}
