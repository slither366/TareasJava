package Tarea4b;

public class FueraDeRangoExcepcion extends Exception{
    
        public FueraDeRangoExcepcion(int valor) {
            super("El Numero "+ valor +": Esta fuera de Rango");
        }
}
