/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

import Entidades.Rectangulo;
import Servicios.rectanguloServicio;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Rectangulo r1 =  rectanguloServicio.crearRectangulo();
      
        System.out.println("La superficie del rectangulo " + r1.calcularSuperficie());
        System.out.println("El perimetro del rectangulo " + r1.calcularPerimetro());

        System.out.println();
        
        r1.dibujarRectangulo();
    }
    
}
