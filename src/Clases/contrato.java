
package Clases;

class contrato { //atributos
    private Inquilino inquilino;
    private Fecha fecha;
    private Propietario propietario;
    private Propiedad propiedad;
    //constructor
    public contrato(Inquilino inquilino, Fecha fecha, Propietario propietario, Propiedad propiedad){
        this.inquilino = inquilino;
        this.fecha = fecha;
        this.propietario = propietario;
        this.propiedad = propiedad;
    }
    //metodo getter para inquilino
    public Inquilino getInquilino(){
        return inquilino;
    }
     public void setInquilino(Inquilino inquilino){
         this.inquilino = inquilino;
     }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }
    
    
}
