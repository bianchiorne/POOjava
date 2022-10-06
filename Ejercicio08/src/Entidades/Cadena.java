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
public class Cadena {
    private String frase;
    private int longCadena;

    public Cadena() {
    }

    public Cadena(String frase, int longCadena) {
        this.frase = frase;
        this.longCadena = longCadena;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongCadena() {
        return longCadena;
    }

    public void setLongCadena(int longCadena) {
        this.longCadena = longCadena;
    }

    
    
    
}
