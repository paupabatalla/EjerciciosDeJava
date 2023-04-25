package Entidad;

import java.util.Scanner;

public class Operacion {
    
    private int num1;
    private int num2;
 
    public int suma;
    public double resta;
    public double multi;
    public double divi;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 valores para realizar las operaciones");
        this.num1 = leer.nextInt();
        this.num2 = leer.nextInt();

    }
    
    public int sumar() {
        suma = this.num1 + this.num2;
        return suma;
    }
   
    public double restar() {
        resta = this.num1 - this.num2;
        return resta;
    }
    
    public double multiplicar() {  
        if (this.num1 == 0 || this.num2 == 0) {
            multi = 0;
            System.out.println("ERROR");
        } else {
            multi = this.num1 * this.num2;
        }
        
        return multi;
    }
   
    public double dividir() {
       if (this.num1 == 0 || this.num2 == 0) {
            divi = 0;
            System.out.println("ERROR");
        } else {
            divi = this.num1 / this.num2;
        }
       
        return divi;
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + ", suma=" + suma + ", resta=" + resta + ", multi=" + multi + ", divi=" + divi + '}';
    }
    
    
}
