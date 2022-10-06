/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02;

import Entidades.Puntos;
import Servicio.puntosServicio;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        puntosServicio service = new puntosServicio();
        Puntos punto1 = new Puntos();
        
        service.crearPuntos(punto1);
        System.out.println(service.medirDistancia(punto1));
       
        
        
    }
    
}
