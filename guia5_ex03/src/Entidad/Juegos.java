package Entidad;

import java.util.Scanner;

/*Consigna:
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores
jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo
jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y
recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos. Registra el número
de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
public class Juegos {

    public int num1;
    public int num2;

    public int contador;
    public int ganador1;
    public int ganador2;

    public Juegos() {
    }

    public void inciarJuego() {
        Scanner leer = new Scanner(System.in);
        this.contador = 0;

        do {
            System.out.println("Ingrese un numero");
            this.num2 = leer.nextInt();
            this.contador++;

            if (this.num2 > this.num1) {
                System.out.println("El numero ingresado es MAS ALTO");
            } else if (this.num2 < this.num1) {
                System.out.println("El numero ingresado es MAS BAJO");
            }

        } while (contador < 3);

        if (this.num2 == this.num1) {
            System.out.println("ACERTASTE");
            ganador2++;
        } else if (contador == 3) {
            System.out.println("PERDISTE! El numero era " + this.num1);
            ganador1++;
        }

    }

    @Override
    public String toString() {
        return "Juegos{" + "El jugador 1 ganó " + ganador1 + " veces y el jugador 2 ganó " + ganador2 + " veces." + '}';
    }

}
