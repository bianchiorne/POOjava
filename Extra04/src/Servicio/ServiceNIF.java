/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiceNIF {
    Scanner input = new Scanner(System.in);

    public void crearNif(NIF nif) {

        System.out.print("Ingrese su numero de DNI: ");
        nif.setDNI(input.nextLong());

        while (String.valueOf(nif.getDNI()).length() != 8) {
            System.out.print("Error. Ingrese su numero de DNI de 8 digitos: ");
            nif.setDNI(input.nextLong());
        }

        int resultado = (int) (nif.getDNI() % 23);

        nif.setNIF(nif.getLetraNIF()[resultado]);
        //nif.setNIF(nif.getLetraNIF()[(int)(nif.getDNI()%23)]);
    }

    public void mostrar(NIF nif) {
        System.out.println(nif.getDNI() + "" + "-" + nif.getNIF());
    }
}
