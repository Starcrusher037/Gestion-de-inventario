
package logica;

import java.util.concurrent.atomic.AtomicInteger;


public class GeneradorId {
    
    private static AtomicInteger contador = new AtomicInteger(101);
    
    public static int generarId(){
       return contador.getAndIncrement();
    }
}
