package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Contratacion {
    
    private ArrayList<Propietario> propietario;
    static ArrayList<Propietario> ListPropietario = new ArrayList<Propietario>();
    static Iterator iterator = ListPropietario.iterator();
    static ArrayList<Inquilino> ListInquilino = new ArrayList<Inquilino>();
    static ArrayList<Propiedad> ListPropiedad = new ArrayList<Propiedad>();
   
    public static void main(String[] args) {
        /*Metodo main declarado en Principal*/

        Persona propietario = new Persona();
        Persona inquilino = new Persona();
        Propietario propietario1 = new Propietario();
        Inquilino inquilino1 = new Inquilino();
        Propiedad propiedad1 = new Propiedad();
        Fecha hoy = new Fecha();

        // MENU DE OPCIONES CON DO
        int opcion;
        do {
            System.out.flush();
            Menu menu1 = new Menu();
            menu1.mostrarMenu();
            System.out.println("INGRESE SU OPCION: ");
            Scanner opc = new Scanner(System.in);
            opcion = opc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("INGRESO DE PROPIETARIOS.");
                    System.out.println("------------------------\n");
                    System.out.print("CUANTOS PROPIETARIOS DESEA DAR DE ALTA? : ");

                    Scanner respuesta = new Scanner(System.in);
                    int cantPr = respuesta.nextInt();


                    System.out.println("INGRESO DE DATOS.\n");
                    for (int i = 0; i < cantPr; i++) {
                        propietario1.pedirDatos();
                        ListPropietario.add(propietario1);

                    }
                    break;

                case 2:

                    System.out.println("INGRESO DE INQUILINOS.");
                    System.out.println("------------------------\n");
                    System.out.print("CUANTOS INQUILINOS DESEA INGRESAR? :");
                    
                    Scanner resp = new Scanner(System.in);
                    int cantInq = resp.nextInt();


                    System.out.println("INGRESO DE DATOS.\n");
                    for (int i = 0; i < cantInq; i++) {
                        inquilino1.pedirDatos();
                        ListInquilino.add(inquilino1);
                    
                        }
                    

                    break;

                case 3:
                    System.out.println("INGRESO DE PROPIEDADES.");
                    System.out.println("------------------------\n");
                    System.out.print("CUANTAS PROPIEDADES DESEA DAR DE ALTA? : ");

                    Scanner respue = new Scanner(System.in);
                    int cantPropie = respue.nextInt();


                    System.out.println("INGRESO DE DATOS.\n");
                    for (int i = 0; i < cantPropie; i++) {
                        propiedad1.pedirDatos();
                        ListPropiedad.add(propiedad1);
                    }

                    break;

                case 4:
                    ArrayList<Propietario> ListPropietario = propietario1.getPropietarios();
                    int i = 0;
                    while(i < ListPropietario.size()){
                        System.out.println(propietario1.getPropietarios());
                        i++;
                    }
                    /*
                    for(int i = 0; i <= tamanio; i++){  
                        System.out.println("Datos: +(ListPropiedad(i)");
                    }
                    for(int i = 0; i <= tamanio; i++){  
                        System.out.println("Datos: +(ListInquilino(i)");
                    }
                    while(iterator.hasNext()){  
                        System.out.println(iterator.next());
                    }
                     */
                    break;

                case 5:

                    System.out.println("PAGOS");
                    break;

                case 6:

                    System.out.println("LISTADO INQUILINOS Y PROPIEDADES");
                    break;
                case 7:

                    System.out.println("LISTADO DE PAGOS POR PROPIEDADES");
                    break;
                default:

                    System.out.println("ERROR, ELIJA UNA OPCION VALIDA...\n\n");
                    break;

            }
        } while (opcion != 8);
    }
}
