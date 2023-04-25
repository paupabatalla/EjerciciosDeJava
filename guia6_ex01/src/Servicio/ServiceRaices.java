package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/*
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
1. Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene
la siguiente fórmula: (b^2)-4*a*c
2. Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto
ocurra, el discriminante debe ser mayor o igual que 0.
3. Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto
ocurra, el discriminante debe ser igual que 0.
4. Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
soluciones.
5. Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el
caso en que se tenga una única solución posible.
6. Método calcular(): esté  método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla
las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), 
según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.

Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
public class ServiceRaices {

    private Scanner leer = new Scanner(System.in);

    public double getDiscriminante(Raices r) {

        double formula = (Math.pow(r.b, 2)) - (4 * r.a * r.c);
        return formula;
    }

    public boolean tieneRaices(Raices r) {
        return getDiscriminante(r) >= 0;
    }

    public boolean tieneRaiz(Raices r) {
        return getDiscriminante(r) == 0;
    }

    public void obtenerRaices(Raices r) {
        if (tieneRaices(r)) {
            double s1 = (-r.b + Math.sqrt(getDiscriminante(r))) / (2 * r.a);
            double s2 = (-r.b - Math.sqrt(getDiscriminante(r))) / (2 * r.a);

            System.out.println("Solución 1= " + s1);
            System.out.println("Solución 2= " + s2);

        }
    }

    public void obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            double s1 = -r.b / (2 * r.a);
            System.out.println("La única solución es " + s1);
        }

    }

    public void calcular(Raices r) {

        if (tieneRaices(r)) {
            System.out.println("TIENE 2 SOLUCIONES:");
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            System.out.println("TIENE UNA SOLUCIÓN: ");
            obtenerRaiz(r);
        } else {
            System.out.println("NO TIENE SOLUCIÓN");
        }

    }
}
