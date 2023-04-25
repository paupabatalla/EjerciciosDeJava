
package guia5_ex04;
import Entidad.Cuenta;
import java.util.Scanner;
/*Consigna:
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
negativo después de realizar una transacción de retiro.
*/
public class Guia5_ex04 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Cuenta c1 = new Cuenta();
        
        do{
            System.out.println("BIENVENIDO");
        System.out.println("Ingrese el nombre del titular");
        c1.setTitular(leer.next());
        System.out.println("Ingrese el saldo de su cuenta");
        c1.setSaldo(leer.nextInt());
        
        c1.retirarDinero();
        }while(true);
    }

}
