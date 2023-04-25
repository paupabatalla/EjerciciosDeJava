
package guia6_ex02;
import Entidad.NIF;
import Servicio.ServiceNIF;
import java.util.Scanner;
/*Consigna:
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente
letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra (String o char) que
le corresponde. En NIFService se dispondrá de los siguientes métodos:
*/

public class Guia6_ex02 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("/n");
        ServiceNIF snif = new ServiceNIF();
        NIF nif = new NIF();
        
        snif.crearNIF(nif);
        snif.mostrarNIF(nif);
        
    }

}
