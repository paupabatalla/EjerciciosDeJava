package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class ServicePersona {

    private Scanner leer = new Scanner(System.in).useDelimiter("/n");

    public ServicePersona() {
    }

    public Persona crearPersona(){
        //System.out.println("Ingresa un nombre");
        String nombre = leer.next();
        
         //System.out.println("Ingresa un nombre");
        int edad = leer.nextInt();
        
         //System.out.println("Ingresa un nombre");
        String apodo = leer.next();
        
        return new Persona(nombre,edad,apodo);
        
    }

    
    
    
}
