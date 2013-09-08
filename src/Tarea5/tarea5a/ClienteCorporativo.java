
package Tarea5.tarea5a;


public class ClienteCorporativo {
    private String contacto;
    private String direccion;
    private String almacen;
    private int calificacion;
    private double credito;

    public ClienteCorporativo(String contacto, String direccion, String almacen, int calificacion, double credito) {
        this.contacto = contacto;
        this.direccion = direccion;
        this.almacen = almacen;
        this.calificacion = calificacion;
        this.credito = credito;
    }

    public String getContacto() {
        return contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getAlmacen() {
        return almacen;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public double getCredito() {
        return credito;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    
    
}
