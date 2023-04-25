
package guia5_ex01;
import Entidades.Cancion;
import java.util.Scanner;
/*Consigna:
Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá definir además dos constructores: uno vacío que inicializa el título 
y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor
de la canción. Se deberán además definir los métodos getters y setters correspondientes.
*/
public class Guia5_ex01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Cancion c1 = new Cancion();
        
        System.out.println("Ingrese el autor");
        c1.autor=leer.nextLine();
        System.out.println("Ingrese la cancion");
        c1.titulo=leer.nextLine();
        
        System.out.println(c1);
    }

}
