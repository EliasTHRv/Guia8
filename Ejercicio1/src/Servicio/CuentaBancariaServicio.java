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

    public CuentaBancaria crearCuenta() {
        CuentaBancaria cuenta = new CuentaBancaria();

        System.out.println("Ingrese el numero de cuenta: ");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del cliente: ");
        cuenta.setDniCliente(leer.nextLong());
        System.out.println("Ingrese su saldo actual: ");
        cuenta.setSaldoActual(leer.nextInt());

        return cuenta;
    }

    public void inGresar(CuentaBancaria cuenta) {
        System.out.println("Indique la cantidad de dinero a ingresar:");
        cuenta.setSaldoActual(cuenta.getSaldoActual() + leer.nextDouble());
    }

    public void reTiro(CuentaBancaria cuenta) {
        System.out.println("Indique la candida de dinero a retirar:");
        double reTiro = leer.nextDouble();
        if (reTiro > cuenta.getSaldoActual())
        {
            System.out.println("No tiene fondo suficiente se retiro " + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        } else
        {
            System.out.println("Se retiro " + "$ " + reTiro);
            cuenta.setSaldoActual(cuenta.getSaldoActual() - reTiro);

        }

    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        double extRa;
        extRa = cuenta.getSaldoActual() * 0.2;

        System.out.println("Su extraccion rapida es de " + "$ " + cuenta.getSaldoActual()*0.2);

        cuenta.setSaldoActual(cuenta.getSaldoActual() - extRa);
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Saldo actual: $" + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("El numero de cuenta es: "+cuenta.getNumeroCuenta());
        System.out.println("El numero asociado a la cuenta es: "+cuenta.getDniCliente());
    }

}
