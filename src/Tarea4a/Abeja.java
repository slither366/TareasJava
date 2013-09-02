
package Tarea4a;

public class Abeja implements Tarea4a.Interface.Hymenoptera{
    private String tipoCelda;
    private String comer;
    private String funciones;
    private String tipotrabajo;
    private String caracteristica;

    public Abeja(String tipoCelda, String comer, String funciones, String tipotrabajo) {
        this.tipoCelda = tipoCelda;
        this.comer = "Miel";
        this.funciones = funciones;
        this.tipotrabajo = tipotrabajo;
        this.caracteristica = "Sociales";
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public void setTipotrabajo(String tipotrabajo) {
        this.tipotrabajo = tipotrabajo;
    }

    public String getFunciones() {
        return funciones;
    }

    public String getTipotrabajo() {
        return tipotrabajo;
    }


    public String getTipoCelda() {
        return tipoCelda;
    }

    public String getComer() {
        return comer;
    }

    public void setTipoCelda(String tipoCelda) {
        this.tipoCelda = tipoCelda;
    }

    public void setComer(String comer) {
        this.comer = comer;
    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
