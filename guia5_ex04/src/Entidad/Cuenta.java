package Entidad;

import java.util.Scanner;

public class Cuenta {

    private int saldo;
    private String titular;

    public Cuenta() {
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirarDinero() {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuánto dinero de su cuenta desea retirar?");
        int retirar = leer.nextInt();

        do {
            if (retirar > this.saldo) {
                System.out.println("EL SALDO QUE DESEA RETIRAR ES MAYOR. INGRESE UN SALDO MENOR AL QUE TIENE");
                retirar = leer.nextInt();
            }
        } while (retirar > this.saldo);
       
        this.saldo -= retirar;
        System.out.println("HA RETIRADO EL DINERO. Su saldo actual es de " + this.saldo + " pesos");
    }

}
