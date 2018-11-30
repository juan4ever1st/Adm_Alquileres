package Clases;

import java.util.Scanner;

public class Contratacion {
    Propietario array[] = new Propietario[100];
    Inquilino arreglo[] = new Inquilino[100];
    Propiedad vector[] = new Propiedad[100];
    public static void main(String[] args) {
        /*Metodo main declarado en Principal*/

        Persona propietario = new Persona();
        Persona inquilino = new Persona();
        Propietario propietario1 = new Propietario();
        Propiedad propie = new Propiedad();
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

                    Propietario array[] = new Propietario[cantPr];

                    System.out.println("INGRESO DE DATOS.\n");
                    for (int i = 0; i < cantPr; i++) {
                        Propietario prop = new Propietario();
                        prop.pedirDatos();
                        array[i] = prop;
                    }
                    break;

                case 2:

                    System.out.println("INGRESO DE INQUILINOS.");
                    System.out.println("------------------------\n");
                    System.out.print("CUANTOS INQUILINOS DESEA INGRESAR? :");
                    Scanner resp = new Scanner(System.in);
                    int cantInq;
                    cantInq = resp.nextInt();

                    if (cantInq > 10) {
                        System.out.println("\n-----------------------------------------------------------------");
                        System.out.println("NO HAY SUFICIENTES PROPIEDADES.\n POR FAVOR INGRESE AL MENOS UNA.");
                        System.out.println("-----------------------------------------------------------------\n");
                    } else {
                        Inquilino arreglo[] = new Inquilino[cantInq];

                        System.out.println("INGRESO DE DATOS \n");
                        for (int i = 0; i < cantInq; i++) {
                            Inquilino inq = new Inquilino();
                            inq.pedirDatos();
                            arreglo[i] = inq;
                        }
                    }

                    break;

                case 3:
                    System.out.println("INGRESO DE PROPIEDADES.");
                    System.out.println("------------------------\n");
                    System.out.print("CUANTAS PROPIEDADES DESEA DAR DE ALTA? : ");

                    Scanner respue = new Scanner(System.in);
                    int cantPropie = respue.nextInt();

                    Propiedad vector[] = new Propiedad[cantPropie];

                    System.out.println("INGRESO DE DATOS.\n");
                    for (int i = 0; i < cantPropie; i++) {
                        Propiedad propied = new Propiedad();
                        propied.pedirDatos();
                        vector[i] = propied;
                    }

                    break;

                case 4:
                    System.out.print("Propietario: ");
                    /*                   
                    System.out.println("ALTA NUEVO CONTRATO: ");
                    
                    contrato array[] = new contrato[1];
                        
                    System.out.println("INGRESE LOS ARTICULOS: \n");
                    for(int i = 0; i < cantArt; i++){  
                        Articulo art = new Articulo();
                        art.pedirArt();
                        array[i] = art;
                    }
                    
                     */
                    break;

                case 5:

                    System.out.println("PAGOS");
                    break;

                case 6:

                    System.out.println("LISTADO INQUILINOS Y PROPIEDADES");

                case 7:

                    System.out.println("LISTADO DE PAGOS POR PROPIEDADES");

                default:

                    System.out.println("ERROR, ELIJA UNA OPCION VALIDA...\n\n");
                    break;

            }
        } while (opcion != 8);
    }
}
