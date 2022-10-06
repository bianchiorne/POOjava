

import Operacion.Entidades.Operacion;
import Operacion.Servicios.operacionServicio;


public class OperacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    operacionServicio service = new operacionServicio();
    Operacion nuevaop = service.crearOperacion();
    
        System.out.println("El resultado de la suma es " + service.sumar(nuevaop.getNumero1(), nuevaop.getNumero2()));
        System.out.println("El resultado de la resta es " + service.restar(nuevaop.getNumero1(), nuevaop.getNumero2()));
        System.out.println("El resultado de la multiplicación es " + service.multiplicar(nuevaop.getNumero1(), nuevaop.getNumero2()));
        System.out.println("El resultado de la división es " + service.dividir(nuevaop.getNumero1(), nuevaop.getNumero2()));

    
    }
    
}
