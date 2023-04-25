package guia5_ex03;

import Entidad.Juegos;
import java.util.Scanner;

/*Consigna:
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores
jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo
jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y
recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugcador adivina el número o se queda sin intentos. Registra el número
de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
public class Guia5_ex03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Juegos adivina = new Juegos();
        String respuesta;

        do {
            adivina.num1 = ((int) (Math.random() * 10));
            System.out.println(adivina.num1);
            adivina.inciarJuego();
            System.out.println("Desean seguir jugando? si/no");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println(adivina);
    }

}
