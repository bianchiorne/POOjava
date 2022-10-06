/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class cadenaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        System.out.println("Ingrese una frase ");
        String frase = leer.next();

        int longFrase = frase.length();

        return new Cadena(frase, longFrase);

    }

    public void mostrarVocales(Cadena cad) {
        String frase = cad.getFrase();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int k = 0; k < frase.length(); k++) {
            switch (frase.charAt(k)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }

            System.out.println();
            System.out.println("La frase tiene " + a + " vocales A");
            System.out.println("La frase tiene " + e + " vocales E");
            System.out.println("La frase tiene " + i + " vocales I");
            System.out.println("La frase tiene " + o + " vocales O");
            System.out.println("La frase tiene " + u + " vocales U");

        }
    }

    public String invertirFrase(Cadena cad) {
        String invertir = " ";

        for (int i = cad.getFrase().length() - 1; i >= 0; i--) {
            invertir = invertir + cad.getFrase().charAt(i);
        }
        return invertir;

    }

    public void vecesRepetido(Cadena cad, char letra) {
        int contador = 0;

        for (int i = 0; i < cad.getFrase().length(); i++) {

            if (cad.getFrase().charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("El caracter " + letra + " se repite " + contador + " veces");
    }

    public void comprarLongitud(Cadena cad, String frase2) {
        if (cad.getLongCadena() == frase2.length()) {

            System.out.println("Las dos frases tienen la misma longitud");
        } else {
            System.out.println("La longitud de las dos frases es de distinta longitud");
        }

    }

    public void unirFrase(Cadena cad, String frase2) {
        String unir = cad.getFrase().concat(frase2);
        System.out.println("La frase resultantes es: " + unir);

    }

    public void reemplazar(Cadena cad, String letra2) {
        String nuevaFrase = cad.getFrase().replace("a", letra2);
        System.out.println("La frase ingresada con los caracteres reemplazados  es " + nuevaFrase);

    }
}
