/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Mes;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class mesServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void adivinarMes(Mes mes){
        String mesRandom;
        mesRandom = mes.getMeses()[(int) (Math.random()*11)+1];
        
        System.out.println("Adivine el mes secreto");
        mes.setMesSecreto(leer.next().toLowerCase());
        
        System.out.println(mesRandom);
        
        while (!(mesRandom.equals(mes.getMesSecreto()))){
            System.out.println("No ha acertado, ingrese nuevamente el mes a adivinar");
            mes.setMesSecreto(leer.next().toLowerCase());
        }
        System.out.println("Acerto!");
    }
}
