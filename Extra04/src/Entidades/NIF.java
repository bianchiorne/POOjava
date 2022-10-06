/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class NIF {

    private long DNI;
    private char[] letraNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    private char NIF;

    public NIF() {
    }

    public NIF(long DNI, char NIF) {
        this.DNI = DNI;
        this.NIF = NIF;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char[] getLetraNIF() {
        return letraNIF;
    }

    public void setLetraNIF(char[] letraNIF) {
        this.letraNIF = letraNIF;
    }

    public char getNIF() {
        return NIF;
    }

    public void setNIF(char NIF) {
        this.NIF = NIF;
    }

}
