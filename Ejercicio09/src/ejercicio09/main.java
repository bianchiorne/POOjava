/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;

import Entidades.Matematica;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Matematica matematica1 = new Matematica();
     
     int numMax =20;
     int numMin = 5;
     
     matematica1.setNum1(Math.random()*(numMin-numMax)+numMax);
     matematica1.setNum2(Math.random()*(numMin-numMax)+numMax);
            
        System.out.println("El valor asignado al numero 1 es " + matematica1.getNum1());
        System.out.println("El valor asignado al numero 2 es " + matematica1.getNum2());
        
        matematica1.devolverMayor();
        matematica1.calcularPotencia();
        matematica1.calcularRaiz();
        
    }
    
}
