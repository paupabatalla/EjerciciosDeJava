package Entidad;

import java.util.Scanner;

public class Circunferencia {
    private double radio;
    public double peri;
    public double ar; 
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
      
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
         this.radio = leer.nextDouble();
    }
    
    public double perimetro() {
       peri = 2 * Math.PI * this.radio;
        return peri;
    }
    
    public double area() {
       ar= Math.PI * (this.radio * this.radio);
        return ar;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio= " + radio + ", perimetro= " + peri + ", area= " + ar + '}';
    }
    
    
}
