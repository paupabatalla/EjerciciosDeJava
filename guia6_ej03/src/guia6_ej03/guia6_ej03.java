package guia6_ej03;

import Entidad.Persona;
import Servicio.ServicePersona;
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
public class guia6_ej03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("/n");

        ServicePersona sp = new ServicePersona();
        boolean[] edad = new boolean[4];
        int[] IMC = new int[4];

        System.out.println("--------------");
        System.out.println("PRIMERA PESONA");
        System.out.println("--------------");
        Persona p1 = sp.crearPersona();
        edad[0] = sp.MayorDeEdad(p1);
        IMC[0] = sp.calcularIMC(p1);

        System.out.println("---------------");
        System.out.println("SEGUNDA PERSONA");
        System.out.println("---------------");
        Persona p2 = sp.crearPersona();
        edad[1] = sp.MayorDeEdad(p2);
        IMC[1] = sp.calcularIMC(p2);

        System.out.println("---------------");
        System.out.println("TERCERA PERSONA");
        System.out.println("---------------");
        Persona p3 = sp.crearPersona();
        edad[2] = sp.MayorDeEdad(p3);
        IMC[2] = sp.calcularIMC(p3);

        System.out.println("--------------");
        System.out.println("CUARTA PERSONA");
        System.out.println("--------------");
        Persona p4 = sp.crearPersona();
        edad[3] = sp.MayorDeEdad(p4);
        IMC[3] = sp.calcularIMC(p4);

        System.out.println("--------------------");
        System.out.println("PORCENTAJE DE EDADES");
        System.out.println("--------------------");
        sp.porcentajeMayor(edad);

        System.out.println("-----------------");
        System.out.println("PORCENTAJE DE IMC");
        System.out.println("-----------------");
        sp.porcentajeIMC(IMC);

    }

}
