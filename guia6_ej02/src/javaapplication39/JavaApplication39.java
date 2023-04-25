
package javaapplication39;
import Entidad.Cafetera;
import Servicios.ServiceCafetera;
import java.util.Scanner;
/*Consigna:
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos
capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual
(la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros
así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:

1. Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
2. Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza
y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café 
“no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si
se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
3. Método vaciarCafetera(): pone la cantidad de café actual en cero. 
4. Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se
añade a la cafetera la cantidad de café indicada.
*/
public class JavaApplication39 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("/n");
        ServiceCafetera sc = new ServiceCafetera();
        Cafetera c = sc.iniciarCafetera();
        
                sc.llenarCafetera(c);
        
        System.out.println("Su taza tiene " + sc.servirTaza(c) + " de cafe");
        sc.vaciarCafetera(c);
           System.out.println("Luego de ingresar la nueva cantidad, su cafetera tiene " + sc.ingresarCafe(c) + " de cafe");
        
  
    }

}
