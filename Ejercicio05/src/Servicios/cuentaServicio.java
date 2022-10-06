/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class cuentaServicio {
     private Scanner leer = new Scanner(System.in);
     
     Cuenta nuevaCuenta= new Cuenta();
     
     public Cuenta crearCuenta(){
         System.out.println("Ingresa número de cuenta: ");
         int numCuenta = leer.nextInt();
         System.out.println("Ingresa DNI: ");
         int dni = leer.nextInt();
         System.out.println("Ingresa el saldo actual: ");
         int saldo = leer.nextInt();
         
         nuevaCuenta.setNumeroCuenta(numCuenta);
         nuevaCuenta.setDniCliente(dni);
         nuevaCuenta.setSaldoActual(saldo);
         
         return nuevaCuenta;
         
         
     }
     
     public void ingresarDinero(double ingreso){
         int saldo = nuevaCuenta.getSaldoActual();
         saldo += ingreso;
         nuevaCuenta.setSaldoActual(saldo);
     }
     
     public void retirarDinero(double retiro){
         int saldo =nuevaCuenta.getSaldoActual();
         
         if (retiro <= saldo){
             saldo -= retiro;
             nuevaCuenta.setSaldoActual(saldo);
             System.out.println("Ha retirado: $" + retiro + " de su cuenta, saldo actual: $" + nuevaCuenta.getSaldoActual());
         }
       
         



}
    
        
    }
