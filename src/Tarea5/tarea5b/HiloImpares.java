
package Tarea5.tarea5b;


public class HiloImpares implements Runnable{
    
    @Override
    public void run() {

        int x = 100;
        int x2=0;
        while(x!=0){
            x2 =x%2;
            if(x2 ==1){
                System.out.println(x);
            }
            x -=1;
        }
    }
    
}
