package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 * Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
 * Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
 * máxima. Método servirTaza(int): se pide el tamaño de una taza vacía, el
 * método recibe el tamaño de la taza y simula la acción de servir la taza con
 * la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar
 * la taza, se sirve lo que quede. El método le informará al usuario si se llenó
 * o no la taza, y de no haberse llenado en cuanto quedó la taza. Método
 * vaciarCafetera(): pone la cantidad de café actual en cero. Método
 * agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
 * recibe y se añade a la cafetera la cantidad de café indicada.
 *
 *
 * @author elias
 */
public class CafeteraServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cafetera cafetera = new Cafetera();

    public Cafetera llenarCafetera() {

        System.out.println("Ingrese la capidad maxima de la cafetera: ");
        cafetera.setCapacidadMaxima(leer.nextDouble());
        System.out.println("Ingrese la cantidad actual de la cafetera");
        cafetera.setCantidadActual(leer.nextDouble());

        return cafetera;
    }

    public void servirTaza(Cafetera cafetera) {
        int op;
        System.out.println("Ingrese el tamaño de cafe deseado: ");
        System.out.println("Tamaño 1: 100ml ");
        System.out.println("Tamaño 2: 355ml");
        System.out.println("Tamaño 3: 500ml");
        op = leer.nextInt();
        switch (op)
        {
            case 1:
                if (cafetera.cantidadActual > 0.1)
                {
                    System.out.println("Se sirvio su cafe");
                    cafetera.setCantidadActual(cafetera.cantidadActual - 0.1);
                } else
                {
                    System.out.println("Se sirvio su cafe con: " + cafetera.cantidadActual);
                    System.out.println("Su taza no se lleno por completo");
                    cafetera.setCantidadActual(cafetera.cantidadActual - cafetera.cantidadActual);

                }
                break;

            case 2:
                if (cafetera.cantidadActual > 0.355)
                {
                    System.out.println("Se sirvio su cafe");
                    cafetera.setCantidadActual(cafetera.cantidadActual - 0.355);

                } else
                {
                    System.out.println("Se sirvio su cafe con: " + cafetera.cantidadActual);
                    System.out.println("Su taza no se lleno por completo");
                    cafetera.setCantidadActual(cafetera.cantidadActual - cafetera.cantidadActual);

                }
                break;

            case 3:
                if (cafetera.cantidadActual > 0.5)
                {
                    System.out.println("Se sirvio su cafe");
                    cafetera.setCantidadActual(cafetera.cantidadActual - 0.5);

                } else
                {
                    System.out.println("Se sirvio su cafe con: " + cafetera.cantidadActual);
                    System.out.println("Su taza no se lleno por completo");
                    cafetera.setCantidadActual(cafetera.cantidadActual - cafetera.cantidadActual);

                }
                break;
            default:
                System.out.println("No es una opcion valida");
        }

    }

    public void vaciarCafetera(Cafetera cafetera) {
        System.out.println("La cafetera se va a vaciar.");
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera) {
        double ag;
        System.out.println("Indique la cantidad de cafe que desea agregar:");
        ag = leer.nextDouble();
        if (ag<=cafetera.capacidadMaxima)
        {
            cafetera.setCantidadActual(cafetera.cantidadActual + ag);
        }else{
            System.out.println("Excedio la capidad maxima: " + cafetera.capacidadMaxima);
        }

    }

//    public void mostraC(Cafetera cafetera) {
//        System.out.println(cafetera.getCapacidadMaxima());
//        System.out.println(cafetera.getCantidadActual());
//
//    }
}
