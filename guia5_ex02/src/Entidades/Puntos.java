
package Entidades;
import java.util.Scanner;
public class Puntos {
 
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    
    public double raiz;

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Puntos() {
    }
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores de x1 e y1");
        this.x1 = leer.nextDouble();
        this.y1 = leer.nextDouble();
        System.out.println("PRIMER PUNTO= (" + x1 + "," + y1 + ")");
        
        System.out.println("Ingrese los valores de x2 e y2");
        this.x2 = leer.nextDouble();
        this.y2 = leer.nextDouble();
        System.out.println("PRIMER PUNTO= (" + x2 + "," + y2 + ")");
    }
    
    public double distancia () {
        raiz = Math.sqrt ((Math.pow((x2 - x1),2))+Math.pow((x1 - x1),2));  
        return raiz;
    }
    
        

}
