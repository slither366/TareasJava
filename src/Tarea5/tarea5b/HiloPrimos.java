package Tarea5.tarea5b;

public class HiloPrimos implements Runnable {

    @Override
    public void run() {
        int contador=0;
        for(int x=1;x<=500;x++){
            
            for(int y=2;y<y/2;y++){
                if(x%y==0){
                    contador +=contador;
                }
            }
 
        }
    }
}
