package guia6_ej01;

import Entidades.CuentaBancaria;
import Servicios.ServiceCuentaBancaria;

public class guia6_ej01_2 {

    public static void main(String[] args) {

        ServiceCuentaBancaria scb = new ServiceCuentaBancaria();
        
        System.out.println("NUEVA CUENTA BANCARIA");
        CuentaBancaria cb = scb.crearCuenta();

        System.out.println("Su saldo actual es de " + scb.ingresar(cb));
        System.out.println("Su saldo actual es de $" + scb.retirar(cb));
        System.out.println("Su saldo actual es de $" + scb.extraccionRapida(cb));
        scb.consultarSaldo(cb);
        scb.mostrarDatos(cb);

    }

}
