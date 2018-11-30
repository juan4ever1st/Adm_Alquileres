
package Clases;

import java.util.Scanner;

public class Persona {
    private String nombre;//atributo privado string
    private String apellido;//atributo privado string
    private String dni;//atributo privado string

    Persona() {
    }
    
    //Creamos la operacion pedirDatos para el empleado vendedor
    public void pedirDatos(){
        System.out.println("INGRESE SU NOMBRE: ");
        Scanner nom = new Scanner(System.in);//Usamos la clase Scanner, creamos el objeto nom de tipo scanner
        this.nombre = nom.nextLine();//almacenamos en nombre: el dato recogido por la funcion de Scanner
        System.out.println("INGRESE SU APELLIDO: ");
        Scanner ape = new Scanner(System.in);//Usamos la clase Scanner, creamos el objeto nom de tipo scanner
        this.apellido = nom.nextLine();//almacenamos en nombre: el dato recogido por la funcion de Scanner
        System.out.println("INGRESE NUMERO DE DNI: ");
        Scanner numdni = new Scanner(System.in);
        this.dni = numdni.nextLine();
    }
    
    //Creamos la funcion mostraDatos que imprime las variables globales: nombre y cuil
    public void mostrarDatos(){
        System.out.println("NOMBRE: "+nombre);
        System.out.println("APELLIDO: "+nombre);
        System.out.println("DNI: "+dni);
    }
    // metodo constructor de la clase persona
    public Persona (String nombre, String apellido, String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        //Tambien se lo puede inicilizar con datos fijos
        //this.nombre = "Juan Carlos Olazo"
        //this.cuil = 20-30801932-3
    }
    //Getter, metodo para obtener el nombre de la persona en el objeto persona
    public String getNombre(){
        return nombre;
    }
    //Setter, metodo para asignar nombre persona al objeto persona
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //Getter, metodo para obtener el CUIL de la persona en el objeto persona
    public String getApellido(){
        return apellido;
    }
    //Setter, metodo para obtener asignar el apellido en el objeto persona
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
}
