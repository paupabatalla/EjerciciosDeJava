package guia5_ex05;

import Entidad.Empleado;
import java.util.Scanner;

/*Consigna:
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un
empleado en función de su edad y salario actual. El aumento salarial debe ser del
10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
public class Guia5_ex05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Empleado e1 = new Empleado();
    
        do {
            System.out.println("EMPLEADO/A");
            System.out.println("Ingrese su nombre");
            e1.setNombre(leer.next());

            System.out.println("Ingrese su edad");
            e1.setEdad(leer.nextInt());

            System.out.println("Ingrese su salario");
            e1.setSalario(leer.nextInt());

            e1.calcularAumento();
            
        } while (true);

    }

}
