package main;

//import entidad.Nif;
import entidad.Nif;
import servicio.NifServicio;

/**
 *
 * @author elias
 */
public class main_nif {

    public static void main(String[] args) {
        
        NifServicio nif2 = new NifServicio();

        Nif nif = new Nif();

        nif2.crearNif(nif);
        nif2.mosTrar(nif);

    }

}
