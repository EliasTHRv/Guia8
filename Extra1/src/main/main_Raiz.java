package main;

import entidad.Raiz;
import servicio.ServicioRaiz;

/**
 *
 * @author elias
 */
public class main_Raiz {
public static void main(String[] args) {
    
    ServicioRaiz raiz1 = new ServicioRaiz();
    
        Raiz nR1 = new Raiz();
        
        nR1 = raiz1.crearRaiz();
        
        ServicioRaiz.calcularRaiz(nR1);
        
        
    }
    
}