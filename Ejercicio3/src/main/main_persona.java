package main;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class main_persona {

    public static void main(String[] args) {
        PersonaServicio pe1 = new PersonaServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de personas.");
        int N = leer.nextInt();
        Persona[] person1 = new Persona[N];
        int[] iMC = new int[N];
        boolean[] mayor = new boolean[N];
        double pesOi = 0;
        double pesOb = 0;
        double pesOa = 0;
        double pMayor = 0;
        double pMenor = 0;
        for (int i = 0; i < N; i++)
        {
            person1[i] = pe1.crearPersona();
            iMC[i] = pe1.calcularImc(person1[i]);
            switch (iMC[i])
            {
                case 0:
                    System.out.println("La persona tiene peso ideal: ");

                    pesOi++;

                    break;
                case 1:
                    System.out.println("La persona tiene sobre peso:");
                    pesOa++;
                    break;
                default:
                    System.out.println("La persona esta bajo su peso:");
                    pesOb++;
                    break;
            }

            mayor[i] = pe1.esMayorDeEdad(person1[i]);
            if (mayor[i])
            {
                pMayor++;
            } else
            {
                pMenor++;
            }
        }

        System.out.println("El promedio de personas con peso alto es: " +"%"+ ((pesOa / N) * 100));
        System.out.println("El promedio de personas con peso bajo es: "+"%" + ((pesOb / N) * 100));
        System.out.println("El promedio de personas con peso ideal es: "+"%" + ((pesOi / N) * 100));

        System.out.println("El porcentaje de peronas mayores es " +"%"+(( pMayor/N)*100));
        System.out.println("El porcentaje de peronas menores es "+"%"+(( pMenor/N)*100));
    }

}
