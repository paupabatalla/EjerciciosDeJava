package guia5_ej2;

import Entidad.Circunferencia;
import java.util.Scanner;

/*Consigna:
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:

Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
public class Guia5_ej2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Circunferencia c1 = new Circunferencia();

        c1.crearCircunferencia();
        c1.area();
        c1.perimetro();

        System.out.println(c1);

    }
}
