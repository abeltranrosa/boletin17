
package boletin17;
import java.util.ArrayList;


public class NumerosAleatorios {
    int [] Numero = new int[6];
    
    public void cargarArray(){
        for (int i=0;i<Numero.length;i++)
            Numero[i] = (int)Math.floor(Math.random()*50+1);
                
            
    }
    public void visualizarArray(){
        for (int i= Numero.length-1;i>=0;i--)
            System.out.println(Numero[i]+ " ");
    }
    
}
