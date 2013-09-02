
package Tarea4a;

public class obrera extends Abeja{
    
    private String sexo;
    private int cicloDesarrollo;
    public obrera(String tipoCelda, String comer, String funciones, String tipotrabajo) {
        super(tipoCelda, comer, funciones, tipotrabajo);
        this.sexo = "Hembra";
        this.cicloDesarrollo = 21;
    }
}
