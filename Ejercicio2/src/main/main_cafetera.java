package main;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class main_cafetera {

    public static void main(String[] args) {
        int op1;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CafeteraServicio c1 = new CafeteraServicio();

        Cafetera c3 = c1.llenarCafetera();

//        c1.servirTaza(c3);
        do
        {
            System.out.println("---------------");
            System.out.println("Opcion 1: Servir cafe");
            System.out.println("Opcion 2: Agregar cafe");
            System.out.println("Opcion 3:  Vaciar cafetera");
            System.out.println("Opcion 4: Salir");
            System.out.println("---------------");
            System.out.println("Ingrese su opcion:");
            op1 = leer.nextInt();

            switch (op1)
            {
                case 1:
                    c1.servirTaza(c3);
                    break;
                case 2:
                    c1.agregarCafe(c3);
                    break;
                case 3:
                    c1.vaciarCafetera(c3);
                    break;

//                case 4:
//                    break;
                default:
                    System.out.println("No es una opcion valida.");
            }

        } while (op1!=4);

    }

}
