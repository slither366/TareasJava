
package Tarea4.Tarea4b;

public class Util {

    public static void main(String[] args) throws FueraDeRangoExcepcion{
        estaEnRango(5, 5, 16);
    }
    
    public static void estaEnRango(int valor, int desde, int hasta) throws FueraDeRangoExcepcion {
        
        if(valor>=desde && valor<=hasta){
            System.out.println("!Esta dentro del Rango!");
        }else{
            throw new FueraDeRangoExcepcion(valor);
        }
    }
    
}
