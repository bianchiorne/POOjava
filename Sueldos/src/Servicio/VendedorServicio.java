package Servicio;


import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class VendedorServicio {
    public Vendedor altaVendedor(){
        
        Vendedor v1 = new Vendedor();
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el dia en que comenzo a trabajar");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes en que comenzo a trabajar");
        int mes = leer.nextInt();
        System.out.println("Ingrese el anho en que comenzo a trabajar");
        int anho = leer.nextInt();
        Date fecha = new Date(anho-1900, mes-1,dia);
        v1.setFechaInicio(fecha);
        return v1;      
    }
    public void SueldoMensual(Vendedor v1){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese las ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor es: " +v1.getNombre() + "es de $" + v1.getSueldoMensual());
        
    }
    public void vacaciones(Vendedor v1){
        Date hoy = new Date();
        int antiguedad = hoy.getYear()-v1.getFechaInicio().getYear();
        
        if (antiguedad<5){
            System.out.println("Le corresponde 14 dias de vacaciones");
        }else if (antiguedad<10){
            System.out.println("Le corresponden 21 dias");
        } else if (antiguedad<20){
            System.out.println("Le corresponden 28 dias");
        } else if(antiguedad>20){
            System.out.println("Le corresponde 35 dias");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }
}
