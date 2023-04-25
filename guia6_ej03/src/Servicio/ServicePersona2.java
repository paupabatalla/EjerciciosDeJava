package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/*
1. Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
2. Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y
después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba
que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un
mensaje
3. Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2
en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa que la persona está
por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número
entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un
0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona
tiene sobrepeso, y la función devuelve un 1.
 */
public class ServicePersona2 {

    private Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();

        System.out.println("Ingrese el sexo: H para hombre, M para mujer y O para otro");
        String sexo = leer.next();

        while (!(sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("o"))) {
            System.out.println("INCORRECTO. INGRESE NUEVAMENTE");
            sexo = leer.next();
        }

        System.out.println("Ingrese su peso en kg");
        double peso = leer.nextDouble();
        System.out.println("Ingrese su altura en mts");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public boolean MayorDeEdad(Persona aux) {
       
        if (aux.getEdad() > 17) {
            System.out.println("Es mayor de edad");
            return true; 
        }
        
        System.out.println("Es menor de edad"); 
        return false;
    }

    public int calcularIMC(Persona aux) {
        double formula = aux.getPeso() / Math.pow((aux.getAltura()), 2);
        System.out.println(formula);

        if (formula < 20) {
             System.out.println("SU PESO ESTA POR DEBAJO DEL PESO IDEAL");
            return -1;
        } else if (formula > 20 && formula < 25) {
            System.out.println("SU PESO ES EL IDEAL");
            return 0;          
        } else if (formula > 25) {
            System.out.println("SU PESO ESTA POR ENCIMA DEL PESO IDEAL.");
            return 1;
        }
        return 2;
    }

    public void porcentajeMayor (boolean[] edad){
        int mayor=0;
        int menor=0;
        
        for (int i = 0; i < 4; i++) {
            if (edad[i]) {
                mayor++;
                
            } else{
                menor++;
            }
        }
        
        System.out.println("De las 4 personas son mayor de edad el " + (mayor*100/4) + " % de las personas");
            System.out.println("De las 4 personas son menor de edad el " + (menor*100/4) + " % de las personas");
    }
    
    public void porcentajeIMC (int[] IMC){
        int IMCmayor = 0;
        int IMCmenor = 0;
        int IMCideal = 0;
        
        for (int i = 0; i < 4; i++) {
            switch (IMC[i]) {
                case -1: IMCmenor++;
                    break;
                case 0: IMCideal++;
                    break;
                case 1:IMCmayor++;
                    break;
            }
        }
        
        System.out.println("De las 4 personas estan por debajo del peso ideal el " + (IMCmenor*100/4) + " % de las personas");
            System.out.println("De las 4 personas estan en su peso ideal el " + (IMCideal*100/4) + " % de las personas");
           System.out.println("De las 4 personas estan por sobre su peso ideal el " + (IMCmayor*100/4) + " % de las personas");
    }
    
    
}
