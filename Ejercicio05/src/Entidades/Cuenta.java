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
public class Cuenta {
 private int numeroCuenta;
 private long dniCliente;
 private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniCliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo es: $" + getSaldoActual());
    }
       
    public void consultarDatos(){
        System.out.println("Su numero de cuenta es: " + getNumeroCuenta());
        System.out.println("Su DNI es " + getDniCliente());
        System.out.println("El total de su cuenta es " + getSaldoActual());
    }
    
    }