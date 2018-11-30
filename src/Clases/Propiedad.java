package Clases;

import java.util.Scanner;

public class Propiedad {

    private String direccion;//atributo privado string
    private int cant_hab;//atributo privado string
    private int sup_cub;//atributo privado string
    private int id;//atributo privado id

    Propiedad() {
    }

    //Creamos la operacion pedirDatos
    public void pedirDatos() {
        System.out.println("INGRESE DIRECCION: ");
        Scanner nom = new Scanner(System.in);//Usamos la clase Scanner, creamos el objeto nom de tipo scanner
        this.direccion = nom.nextLine();//almacenamos en nombre: el dato recogido por la funcion de Scanner
        System.out.println("INGRESE CANT DE HABITACIONES: ");
        Scanner ape = new Scanner(System.in);//Usamos la clase Scanner, creamos el objeto nom de tipo scanner
        this.cant_hab = nom.nextInt();//almacenamos en nombre: el dato recogido por la funcion de Scanner
        System.out.println("MTS 3 DE SUP CUBIERTA: ");
        Scanner sup = new Scanner(System.in);
        this.sup_cub = sup.nextInt();
        System.out.println("ID DE LA PROPIEDAD: ");
        Scanner ide = new Scanner(System.in);
        this.id = ide.nextInt();
    }

    //Creamos la funcion mostraDatos que imprime las variables globales: nombre y cuil
    public void mostrarDatos() {
        System.out.print("DIRECCION: " + direccion);
        System.out.print("CANT HABITACIONES: " + cant_hab);
        System.out.print("SUPERFICIE: " + sup_cub);
        System.out.print("ID: " + id);
    }

    //Getter, metodo para obtener 
    public String getDireccion() {
        return direccion;
    }

    //Setter, metodo para asignar 
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Getter, metodo para obtener 
    public int gethabitaciones() {
        return cant_hab;
    }

    //Setter, metodo para asignar 
    public void setHabitaciones(int cant_hab) {
        this.cant_hab = cant_hab;
    }

    public int getSup() {
        return sup_cub;
    }

    public void setSup(int sup_cub) {
        this.sup_cub = sup_cub;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
