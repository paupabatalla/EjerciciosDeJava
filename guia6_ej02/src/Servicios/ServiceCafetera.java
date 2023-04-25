package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;
/*
1. Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
2. Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza
y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café 
“no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si
se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
3. Método vaciarCafetera(): pone la cantidad de café actual en cero. 
4. Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se
añade a la cafetera la cantidad de café indicada.
 */
public class ServiceCafetera {

    private Scanner leer = new Scanner(System.in);

    public Cafetera iniciarCafetera(){
        
        System.out.println("INGRESE LA CAPACIDAD MAXIMA");
        int cantidadMaxima = leer.nextInt();
        System.out.println("CUAL ES LA CANTIDAD ACTUAL?");
        int cantidadActual = leer.nextInt();
        
         return new Cafetera(cantidadMaxima, cantidadActual);

    }
        
        
        public void llenarCafetera(Cafetera c) {

        System.out.println("Llenando cafetera");
        int cantidadActual = c.getCantidadMaxima();
        System.out.println(" CAFETERA LLENA");
     
    }

    public int servirTaza(Cafetera c) {
        System.out.println("Ingrese el tamaño de una taza");
        int taza = leer.nextInt();

        if (taza > c.getCantidadActual()) {
            taza = c.getCantidadActual();
            System.out.println("No se pudo llenar la taza.");

        } else {
            System.out.println("Llenando taza...");
            c.setCantidadActual(c.getCantidadActual() - taza);
        }
        
        return taza;

    }
    
    public void vaciarCafetera(Cafetera c){
       c.setCantidadActual(0);      
        System.out.println("Vaciando cafetera... SU CAFETERA ESTA VACIA.");  
    }
    
    public int ingresarCafe(Cafetera c){
        System.out.println("Su cafetera esta vacia, ingrese nueva cantidad de Café");
        int cafe = leer.nextInt();
        
        if (cafe > c.getCantidadMaxima()) {
            System.out.println("SOBREPASA LA CAPACIDAD MAXIMA DE LA CAFETERA");
            
        } else {
              c.setCantidadActual(cafe);    
        }
      
        return c.getCantidadActual();
    }
    

}
