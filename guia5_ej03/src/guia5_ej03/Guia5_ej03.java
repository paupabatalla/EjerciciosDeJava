package guia5_ej03;

import Entidad.Operacion;
import java.util.Scanner;

/*Consigna:
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
1. Método constructor con todos los atributos pasados por parámetro.
2. Método constructor sin los atributos pasados por parámetro.
3. Métodos get y set.
4. Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los
atributos del objeto.
5 Método sumar(): calcular la suma de los números y devolver el resultado al main.
6. Método restar(): calcular la resta de los números y devolver el resultado al main
7. Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
8. Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una
división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al
usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
public class Guia5_ej03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Operacion o1 = new Operacion();

        o1.crearOperacion();
        o1.sumar();
        o1.restar();
        o1.multiplicar();
        o1.dividir();
        
        System.out.println(o1);

    }

}
