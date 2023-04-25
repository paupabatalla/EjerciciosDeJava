package Entidad;

import java.util.Scanner;

public class Rectangulo {

    public int base;
    public int altura;
    public int perimetro;
    public double area;

    public Rectangulo() {
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        this.altura = leer.nextInt();

    }

    public int calcularPerimetro() {
        this.perimetro = (this.base * 2) + (this.altura * 2);
        return perimetro;

    }

    public double calcularArea() {
        this.area = this.base * this.altura;
        return area;
    }

    public void mostrarRectangulo() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
            if (i == 0 || i==this.altura-1 || j == 0 || j == this.base-1) {
                    System.out.print("* ");
                } else if (j!=0 || j<this.base-1) {
                    System.out.print("  ");
                }
            }
            System.out.println("");     
        }
    }
    
    @Override
    public String toString() {
        return "Rectangulo{" + "La base es de " + base + " cm y la altura es de " + altura + " cm, siendo el perimetro de " + perimetro + "cm y el area de " + area + " cm2" + '}';
    }

}
