
package Clases;

public class Inquilino extends Persona{
    private int sueldo;
    
    public void pedirSueldo(){
        System.out.print("INGRESE EL SUELDO NETO: $");
    }
    
     //Métodos setter y getter
    public int getSueldo(){
        return sueldo;
    }
    
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    
}
