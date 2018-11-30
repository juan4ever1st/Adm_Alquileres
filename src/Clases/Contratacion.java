
package Clases;

import java.util.Scanner;

public class Contratacion {
    public static void main(String[] args) { /*Metodo main declarado en Principal*/
      //Instanciamos nuevos objetos de la clases persona, articulo y venta
        Persona propietario = new Persona();
        Persona inquilino = new Persona();
        Fecha hoy = new Fecha();
        

        // MENU DE OPCIONES CON DO
        int opcion;
        do{
            System.out.flush();
            Menu menu1 = new Menu();
            menu1.mostrarMenu();
            System.out.println("INGRESE SU OPCION: ");
            Scanner opc = new Scanner(System.in);
            opcion = opc.nextInt();
            
            switch (opcion){
                case 1:
                {
                    propietario.pedirDatos();
                    break;
                }
                case 2:
                {
                    inquilino.pedirDatos();
                    break;
                }
                case 3:
                {
                    propiedades.pedirDatos();
                    break;
                }
                case 4:
                {
                                       
                    System.out.println("INGRESAR NUEVO CONTRATO: ");
                    
                    Scanner respuesta = new Scanner(System.in);
                    int cantArt = respuesta.nextInt();
                    
                    Articulo array[] = new Articulo[cantArt];
                        
                    System.out.println("INGRESE LOS ARTICULOS: \n");
                    for(int i = 0; i < cantArt; i++){  
                        Articulo art = new Articulo();
                        art.pedirArt();
                        array[i] = art;
                    }
                    
                    System.out.println("****************************************************************************");
                    System.out.println("\nVENDEDOR: ");
                    vendedor.mostrarDatos(); // Llamamamos a la funcion MostrarDatos disponible de la clase persona
                    System.out.println("\nDATOS CLIENTE:");
                    cliente.mostrarDatos();
                    hoy.mostrarFecha();
                    System.out.println("****************************************************************************");
                    System.out.println("                                                                            ");
                    System.out.println("Cod_Art__________Cantidad__________Descripción__________PrecioUnitario");
                    for(int i = 0; i<cantArt; i++){
                        System.out.println(array[i].getCodigo()+"          "+array[i].getCantidad()+"          "+array[i].getDescripcion()+"               "+array[i].getPrecio());
                        venta1.calcularSubtotal(array[i].getCantidad(), array[i].getPrecio());
                    }
                    venta1.mostrarFactura();
                    System.out.println("*****************************************************************************\n\n");
                    break;
                }
                case 5:
                {
                    System.out.println("PAGOS");
                    break;
                }
                case 6:
                {
                    System.out.println("LISTADO INQUILINOS Y PROPIEDADES");
                }
                case 7:
                {
                    System.out.println("LISTADO DE PAGOS POR PROPIEDADES");
                }
                default:
                {
                    System.out.println("ERROR, ELIJA UNA OPCION VALIDA...\n\n");
                    break;
                }
            }
        }while(opcion != 7);
    }
}