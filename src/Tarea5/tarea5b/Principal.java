
package Tarea5.tarea5b;

public class Principal {
    
    
    public static void main(String[] args) {
        Impares();
    }
    
    public static void Impares(){
        
        HiloImpares xhilo = new HiloImpares();

        Thread th = new Thread(xhilo);
        th.start();
        
        
        
    }
    
    
}
