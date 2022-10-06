/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double arrayA[] = new double[50];
        double arrayB[] = new double[20];

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = Math.round(Math.random() * 1000);
        }

        Arrays.sort(arrayA);

        arrayB = Arrays.copyOf(arrayA, 20);

        Arrays.fill(arrayB, 10, 20, 0.5);

        System.out.println("+++++++++++++++++++++++++");
        System.out.println("El arreglo A queda asi: ");
        System.out.println("+++++++++++++++++++++++++");
        System.out.println();
        
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("[" + arrayA[i] + "]");
        }

        System.out.println();

        System.out.println("+++++++++++++++++++++++++");
        System.out.println("El arreglo B queda asi: ");
        System.out.println("+++++++++++++++++++++++++");
        System.out.println();
        
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println("[" + arrayB[i] + "]");
        }

    }
}
