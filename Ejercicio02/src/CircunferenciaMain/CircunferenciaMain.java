package CircunferenciaMain;


import Circunferencia.Entidades.Circunferencia;
import Circunferencia.Servicios.CircunferenciaServicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class CircunferenciaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia circ = new Circunferencia();
        CircunferenciaServicio servicio = new CircunferenciaServicio();
        
      
        servicio.crearCircunferencia(circ);
       servicio.area(circ);
       servicio.perimetro(circ);
        
        
    }
    
}
