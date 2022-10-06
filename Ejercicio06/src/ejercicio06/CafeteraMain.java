/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

import Entidades.Cafetera;
import Servicios.CafeteraServicios;

/**
 *
 * @author Usuario
 */
public class CafeteraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicios servicio = new CafeteraServicios();
        Cafetera c1= servicio.crearCafetera();
        
       // servicio.llenarCafetera(c1);
        servicio.servirTaza(c1);
        servicio.agregarCafe(c1);
        servicio.vaciarCafetera(c1);
        
    }
    
}
