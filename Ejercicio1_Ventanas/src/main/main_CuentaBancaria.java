package main;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author elias
 */
public class main_CuentaBancaria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char respuesta = 'a';
        int op;
        CuentaBancariaServicio c1 = new CuentaBancariaServicio();
        CuentaBancaria cuentaE = c1.crearCuenta();
        do
        {
            System.out.println("Opcion 1: Ingresar dinero");
            System.out.println("Opcion 2: Retirar dinero");
            System.out.println("Opcion 3: Extraccion rapida");
            System.out.println("Opcion 4: Consulta de saldo");
            System.out.println("Opcion 5: Consulta de datos");
            System.out.println("Opcion 6: Salir");

            op = leer.nextInt();
            switch (op)
            {
                case 1:
                    c1.inGresar(cuentaE);
                    break;
                case 2:
                    c1.reTiro(cuentaE);
                    break;
                case 3:
                    c1.extraccionRapida(cuentaE);
                    break;
                case 4:
                    c1.consultarSaldo(cuentaE);
                    break;
                case 5:
                    c1.consultarDatos(cuentaE);
                    break;
                case 6:
                    System.out.println("s para confirmar");
            respuesta = leer.next().charAt(0);
                default:
                    System.out.println("Error, no es ninguna opcion valida.");

            }
            
        } while (!(respuesta == 's'));

    }

}
