package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano. Metodo crearPersona(): el método crear persona, le pide
 * los valores de los atributos al usuario y después se le asignan a sus
 * respectivos atributos para llenar el objeto Persona. Además, comprueba que el
 * sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
 * deberá mostrar un mensaje
 *
 *
 * Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 *
 * @author elias
 */
public class PersonaServicio {

    Persona persona = new Persona();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona:");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona: ");
        persona.setEdad(leer.nextInt());
        String sP;
        do
        {
            System.out.println("Ingrese el sexo de la perona: F,H,O ");
            sP = leer.next();

        } while (sP != "F" || sP != "H" || sP != "O");
        persona.setSexo(sP);
        System.out.println("Ingrese el peso de la persona:");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona: ");
        persona.setAltura(leer.nextDouble());
        return persona;
    }

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public int calcularImc(Persona persona) {
        double pesoId = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        if (pesoId < 20)
        {
            return -1;
        } else if (pesoId>19 &&pesoId < 26)
        {
            return 0;
        } else
        {
            return 1;
        }

    }

    
    
}
