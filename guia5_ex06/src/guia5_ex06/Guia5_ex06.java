
package guia5_ex06;
import Entidad.Rectangulo;
import java.util.Scanner;
/*Consigna:
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método
"calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un
objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el
área del rectángulo.
*/
public class Guia5_ex06 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("/n");
        Rectangulo rectangulo1 = new Rectangulo(4,6);
        
        System.out.println("El lado 1 del rectangulo mide " + rectangulo1.getLado1() + " cm y el lado 2 del rectangulo mide " + rectangulo1.getLado2() + " cm");
        System.out.println("El area del rectangulo es " + rectangulo1.calcularArea() + " cm2");
    }
}
