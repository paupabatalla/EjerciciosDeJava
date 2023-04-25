
package pooej01;
import Entidad.Persona;

public class POOEj01 {

    public static void main(String[] args) {

        //Muestro los datos dados por los primeros atributos
        Persona p1 = new Persona("Paula",23,"Paupa");
     
       //Muestro los datos antes de modificarlos
        System.out.println(p1);
        System.out.println("------------------------------"); 
               
        //Modifico datos con set
        p1.setNombre("Adriana");
        p1.setEdad(28);
        p1.setApodo("Dino");
       
        
        //Realizo un metodo funcional(accion)
        p1.caminar(100,5);
        
        //Opcion1: muestro los datos modificados a traves de get
        System.out.println(p1.getNombre() + " " + p1.getEdad() + " " + p1.getApodo());
        
        System.out.println("-------------------------------");
       
        //Opcion2: Muestro datos automaticos con toString
        System.out.println(p1);
         
        
    }  
}
