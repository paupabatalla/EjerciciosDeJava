
package guia5_ej1;
import java.util.Scanner;
import Entidad.Libro;

/*Consigna:
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un método
para cargar un libro pidiendo los datos al usuario y luego informar mediante
otro método el número de ISBN, el título, el autor del libro y el número de páginas.
*/

public class Guia5_ej1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Libro l1 = new Libro();
      
        System.out.println("Ingrese el autor, titulo, numero de paginas y ISBN del libro");
        l1.ingresarDatos(leer.nextLine(), leer.nextLine(), leer.nextInt(), leer.nextInt());
        
       l1.mostrarDatos();
       
       
        
    }

}
