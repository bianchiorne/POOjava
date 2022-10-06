/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;

import Entidades.Cadena;
import Servicios.cadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        cadenaServicio service = new cadenaServicio();
        
        Cadena cadena1 = service.crearCadena();
        
        service.mostrarVocales(cadena1);    

        System.out.println("\nLa frase invertida es" + service.invertirFrase(cadena1));
        
        
        System.out.println("\nIngrese el caracter que desea  buscar en la frase");
        char letra = leer.next().charAt(0);
        
        service.vecesRepetido(cadena1, letra);
        
        System.out.println("Ingrese una nueva frase para coparar la longitud de las mismas");
        String nuevaFrase = leer.next();
        
        service.comprarLongitud(cadena1, nuevaFrase);
        
        System.out.println("\nIngrese la frase que desea concatenar");
        nuevaFrase = leer.next();
        
        service.unirFrase(cadena1, nuevaFrase);
        
        
        System.out.println("\nIngrese el nuevo caracter con el que desea reemplazar las letras A");
        String letra2= leer.next();
        
        service.reemplazar(cadena1, letra2);

    }
    
}
