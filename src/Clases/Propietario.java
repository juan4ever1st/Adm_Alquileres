package Clases;

import java.util.Scanner;

/**
 *
 * @author W7 ULTIMATE
 */
public class Propietario extends Persona {

    public void cargar() {
        Persona propietario = new Persona();
        System.out.println("CUANTOS NUEVOS PROPIETARIOS DESEA DAR DE ALTA? ");

        Scanner respuesta = new Scanner(System.in);
        int cantPr = respuesta.nextInt();

        Propietario array[] = new Propietario[cantPr];

        System.out.println("INGRESE LOS DATOS: \n");
        for (int i = 0; i < cantPr; i++) {
            Propietario prop = new Propietario();
            propietario.pedirDatos();
            array[i] = prop;
        }
    }

}
