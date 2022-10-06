/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import Entidades.Cuenta;
import Servicios.cuentaServicio;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       cuentaServicio servicio = new cuentaServicio();
       
       Cuenta cuenta1 = servicio.crearCuenta();
       
       cuenta1.consultarDatos();
       cuenta1.consultarSaldo();
       
       servicio.ingresarDinero(0);
       servicio.retirarDinero(0);
       
       
       //no funciona
       
        }
    
        
    }