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
public class Matematica {
    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void devolverMayor(){
      this.num1=Math.round(num1);
      this.num2=Math.round(num2);
      
      if(this.num1>this.num2){
          System.out.println("El numero mayor es el numero 1 = " + num1);
        } else if (this.num2>this.num1){
            System.out.println("El numero mayor es el numero 2 = " +num2 );
        }else {
            System.out.println("Los numeros son iguales \nnum1 = " +num1+ "\nnum2 = " +num2);
        }
    }
    
    public void calcularPotencia() {
        double potencia=0;
        
        this.num1 = Math.round(num1);
        this.num2 = Math.round(num2);
        
        if(this.num1>this.num2){
            potencia=Math.pow(num1, num2);
            System.out.println("La potencia del nnumero mayor es: " + potencia);
            
        } else if (this.num2>this.num1){
            potencia=Math.pow(num2, num1);
            System.out.println("La potencia del numero mayor es: " + potencia);
        }
    }
        
        

    public void calcularRaiz() {
        double raiz = 0;

        this.num1 = Math.abs(num1);
        this.num2 = Math.abs(num2);
        
         if(this.num1 < this.num2){
           raiz = Math.sqrt(num1);
            System.out.println("La raiz cuadrada del numero " + num1 + " es " + raiz);
            
        } else if (this.num2 < this.num1){
          raiz = Math.sqrt(num2);
            System.out.println("La raiz cuadrada del numero " + num1 + " es " + raiz);
            
        }
        
    }
    }
           
            

