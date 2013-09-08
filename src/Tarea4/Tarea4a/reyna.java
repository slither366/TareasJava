
package Tarea4.Tarea4a;

public class reyna extends Abeja{

    private String sexo;
    private int cicloDesarrollo;
    public reyna(String tipoCelda, String comer, String funciones, String tipotrabajo,int cicloDesa) {
        super(tipoCelda, comer, funciones, tipotrabajo);
        this.sexo = "Hembra";
        this.cicloDesarrollo = cicloDesa;
    }


}
