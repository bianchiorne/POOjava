/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra05;

import Entidades.Mes;
import Servicio.mesServicio;

/**
 *
 * @author Usuario
 */
public class Extra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Mes mes1 = new Mes();
        mesServicio service = new mesServicio();
        
        service.adivinarMes(mes1);
        
    }
    
}
