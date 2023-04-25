package guia6_ej01;

import Entidades.CuentaBancaria;
import Servicios.ServiceCuentaBancaria;
import java.util.Scanner;

/*Consigna:
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con
parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
1) Método para crear cuenta pidiéndole los datos al usuario.
2) Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
3) Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar
la cuenta en 0.
4) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
5) Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
6) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
public class Guia6_ej01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ServiceCuentaBancaria scb = new ServiceCuentaBancaria();

        while (true) {
            System.out.println("NUEVA CUENTA BANCARIA");
            CuentaBancaria cb = scb.crearCuenta();

            System.out.println("1- INGRESAR DINERO");
            System.out.println("2- RETIRAR DINERO");
            System.out.println("3- EXTRACCIÓN RÁPIDA");
            System.out.println("4- CONSULTAR SALDO");
            System.out.println("5- CONSULTAR DATOS");
            System.out.println("6- SALIR");
            int opcion = 0;

            do {
                System.out.println("Elija una opcion");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Su saldo actual es de " + scb.ingresar(cb));
                        break;
                    case 2:
                        System.out.println("Su saldo actual es de $" + scb.retirar(cb));
                        break;
                    case 3:
                        System.out.println("Su saldo actual es de $" + scb.extraccionRapida(cb));
                        break;
                    case 4:
                        scb.consultarSaldo(cb);
                        break;
                    case 5:
                        scb.mostrarDatos(cb);
                        break;
                    default:
                        if (opcion != 6) {
                            System.out.println("OPCION INCORRECTA");

                        }
                }
            } while (opcion != 6);

            if (opcion == 6) {
                System.out.println("DESEA INGRESAR CON OTRA CUENTA? si o no");
                String respuesta = leer.next();

                if (respuesta.equalsIgnoreCase("si")) {
                    continue;
                } else if (respuesta.equalsIgnoreCase("no")) {
                    System.out.println("HA SALIDO DEL SISTEMA");
                    break;
                }

            }

        }
    }

}
