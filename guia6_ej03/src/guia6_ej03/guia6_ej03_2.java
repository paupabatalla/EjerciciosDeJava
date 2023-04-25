
package guia6_ej03;
import Entidad.Persona;
import Servicio.ServicePersona2;
import java.util.Scanner;
/*Consigna:
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos
para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por
debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas
variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo
de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje
de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos
adicionales.
*/
public class guia6_ej03_2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("/n");
        
        ServicePersona2 sp2 = new ServicePersona2();
        boolean [] edad = new boolean[4];
        int [] IMC = new int[4];
         
        Persona p1 = sp2.crearPersona(); 
        edad[0]= sp2.MayorDeEdad(p1);
        IMC[0] = sp2.calcularIMC(p1);
        
        Persona p2 = sp2.crearPersona();
        edad[1]= sp2.MayorDeEdad(p2);
        IMC[1] = sp2.calcularIMC(p2);
        
        Persona p3 = sp2.crearPersona();
        edad[2]= sp2.MayorDeEdad(p3);
        IMC[2] = sp2.calcularIMC(p3);      
        
        Persona p4 = sp2.crearPersona();
        edad[3]= sp2.MayorDeEdad(p4);
        IMC[3]= sp2.calcularIMC(p4);
        
        sp2.porcentajeMayor(edad);
        sp2.porcentajeIMC(IMC);
        
    }

}
