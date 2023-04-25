package servicio;

import entidad.Raiz;
import java.util.Scanner;
//import java.util.Scanner;

/**
 * Luego, en RaicesServicio las operaciones que se podrán realizar son las
 * siguientes: Método getDiscriminante(): devuelve el valor del discriminante
 * (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c Método
 * tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
 * que esto ocurra, el discriminante debe ser mayor o igual que 0. Método
 * tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
 * que esto ocurra, el discriminante debe ser igual que 0. Método
 * obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
 * posibles soluciones. Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́
 * true imprime una única raíz. Es en el caso en que se tenga una única solución
 * posible. Método calcular(): esté método llamará tieneRaices() y a
 * tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene
 * nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
 * que devuelvan nuestros métodos y en caso de no existir solución, se mostrará
 * un mensaje. Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo
 * varía el signo delante de -b
 *
 * @author elias
 */
public class ServicioRaiz {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
//    Raiz nR = new Raiz();
//
//    public Raiz crearRaiz() {
//        System.out.print("Ingrese el valor de a: ");
//        nR.setA(leer.nextDouble());
//        System.out.print("Ingrese el valor de b: ");
//        nR.setB(leer.nextDouble());
//        System.out.print("Ingrese el valor de c: ");
//        nR.setC(leer.nextDouble());
//
//        return nR;
//    }

    public static double getDiscriminante(Raiz raiz) {
        return Math.pow(raiz.getB(), 2) - (4 * raiz.getA()) * raiz.getC();
    }

    public static boolean tieneRaices(Raiz raiz) {
        return (getDiscriminante(raiz) > 0);
    }

    public static boolean tieneRaiz(Raiz raiz) {
        return (getDiscriminante(raiz) == 0);
    }

    public static void obtenerRaices(Raiz raiz) {
        if (tieneRaices(raiz))
        {
//            (-b±√((b^2)-(4*a*√((bc)))/(2*a) 
            double rD = Math.sqrt(getDiscriminante(raiz));
            double r1 = (-raiz.getB() + -rD) / (2 * raiz.getA());
            double r2 = (+raiz.getB() + -rD) / (2 * raiz.getA());

            System.out.println("La dos raices son: " + r1 + " y " + r2);
        }
    }

    public static void obtenerRaiz(Raiz raiz) {
        if (tieneRaiz(raiz))
        {
            double r3 = -raiz.getB() / (2 * raiz.getA());
            System.out.println("La unica raiz es: " + r3);
        }
    }

    public static void calcularRaiz(Raiz raiz) {
        if (tieneRaices(raiz))
        {
            obtenerRaices(raiz);
        } else if (tieneRaiz(raiz))
        {
            obtenerRaiz(raiz);
        } else
        {
            System.out.println("No hay solucion real para esta ecuacion.");
        }
    }
}
