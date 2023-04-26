package servicio;

import entidad.Nif;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class NifServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public  Nif crearNif(Nif nif) {

        System.out.print("Introduce el número de DNI: ");
        nif.setDni(leer.nextLong());
        nif.setLetra(calcularLetra(nif.getDni()));
        return  nif;
    }

    private static char calcularLetra(long Dni) {
        char[] letras =
        {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };
        int resto = (int) (Dni % 23); 
        return letras[resto];
    }
    
     public void  mosTrar(Nif nif) {
            System.out.println("0" + nif.getDni()+"-"+ nif.getLetra()  ); 
        
    }
}
