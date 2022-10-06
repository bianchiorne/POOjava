/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra04;

import Entidades.NIF;
import Servicio.ServiceNIF;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIF nif = new NIF();
        ServiceNIF serv = new ServiceNIF();
        
        serv.crearNif(nif);
        serv.mostrar(nif);
        
  

       
        
        
    }
}

