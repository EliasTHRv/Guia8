package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 * Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga
 * Método para crear cuenta pidiéndole los datos al usuario. Método
 * ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al
 * saldo actual. Método retirar(double): recibe una cantidad de dinero a retirar
 * y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero
 * a retirar se retirará el máximo posible hasta dejar la cuenta en 0. Método
 * extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el
 * usuario no saque más del 20%. Método consultarSaldo: permitirá consultar el
 * saldo disponible en la cuenta. Método consultarDatos: permitirá mostrar todos
 * los datos de la cuenta.
 *
 * @author elias
 */
public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CuentaBancaria cuenta1 = new CuentaBancaria();

    public CuentaBancaria crearCuenta(){

        System.out.println("Ingrese el numero de cuenta");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el dni del cliente");
        cuenta1.setDniCliente(leer.nextLong());
        System.out.println("Ingrese el saldo");
        cuenta1.setSaldoActual(leer.nextDouble());
        
        return cuenta1;
       
    }
    
    public void inGresar(CuentaBancaria cuenta){
        System.out.println("Ingrese el monto a ingresar: ");
        cuenta1.setSaldoActual(leer.nextInt()+cuenta1.getSaldoActual());
    
    }
    
    
}