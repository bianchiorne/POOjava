/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class rectanguloServicio {

    private static Scanner leer = new Scanner(System.in);

    public static Rectangulo crearRectangulo() {
        System.out.println("Ingrese la base del rectangulo");
        int base = leer.nextInt();

        System.out.println("Ingrese la altura del rectangulo");
        int altura = leer.nextInt();

        return new Rectangulo(base, altura);

    }
}
