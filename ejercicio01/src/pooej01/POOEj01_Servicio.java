
package pooej01;
import Entidad.Persona;
import Servicio.ServicePersona;
import java.util.Scanner;

public class POOEj01_Servicio {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("/n");
         
        //Crear servicios
        ServicePersona sp = new ServicePersona();
        
        //Llamar al servicio en la creacion de la clase
        Persona p1 = sp.crearPersona();
        
        //Mostrar el servicio pasado a la clase
        System.out.println(p1.toString());
        
        
    }

}
