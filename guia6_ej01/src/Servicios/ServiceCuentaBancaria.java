package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
1) Método para crear cuenta pidiéndole los datos al usuario.
2) Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
3) Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar
la cuenta en 0.
4) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque
más del 20%.
5) Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
6) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
public class ServiceCuentaBancaria {

    private Scanner leer = new Scanner(System.in);
    private CuentaBancaria c1;

    public CuentaBancaria crearCuenta() {

        System.out.println("Ingrese el numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el numero de DNI");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese el saldo de la cuenta");
        double saldoActual = leer.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public double ingresar(CuentaBancaria cb) {
        System.out.println("¿Cuanto dinero desea depositar a la cuenta?");
        double ingreso = leer.nextDouble();
        System.out.println("Ha ingresado $" + ingreso);
        cb.setSaldoActual(ingreso + cb.getSaldoActual());
        return cb.getSaldoActual();
    }

    public double retirar(CuentaBancaria cb) {
        System.out.println("¿Cuanto dinero desea retirar de la cuenta?");
        double retiro = leer.nextDouble();
        do {
            if (retiro > cb.getSaldoActual()) {
                System.out.println("FONDO INSUFICIENTE. Ingrese saldo a retirar:");
                retiro = leer.nextDouble();             
            } else {
                System.out.println("Ha retirado $" + retiro);
            }
        } while (retiro > cb.getSaldoActual());

        cb.setSaldoActual(cb.getSaldoActual()-retiro);
        return cb.getSaldoActual();
    }
    
    public double extraccionRapida(CuentaBancaria cb){
        double extraccion = cb.getSaldoActual()*0.20;
        System.out.println("La extracción rápida del 20% es de $" + extraccion);
                cb.setSaldoActual(cb.getSaldoActual()-extraccion);
        
        return cb.getSaldoActual();
    }
    
    public void consultarSaldo(CuentaBancaria cb) {
        System.out.println("Su saldo disponible es de $" + cb.getSaldoActual());
    }
    
    public void mostrarDatos(CuentaBancaria cb) {
        System.out.println("Los datos de la cuenta son los siguentes:");
        System.out.println("NUMERO DE CUENTA: "+cb.getNumeroCuenta());
        System.out.println("NUMERO DE DNI: "+cb.getDniCliente());
        System.out.println("SALDO: " + cb.getSaldoActual());   
    }

}
