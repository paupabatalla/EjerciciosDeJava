
package guia6_ex01;
import Entidad.Raices;
import Servicio.ServiceRaices;
import java.util.Scanner;
/*Consigna:
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación
de 2º grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. Hay que insertar
estos 3 valores para construir el objeto a través de un método constructor. 
*/

public class Guia6_ex01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("/n");
        
        ServiceRaices sr = new ServiceRaices();
        Raices r = new Raices(1,-5,6);
  
        sr.calcular(r);
      
    }

}
