package Entidad;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularAumento() {

        if (edad < 18) {
            System.out.println("ES MENOR DE EDAD.");
        } else if (this.edad > 30) {
            this.salario = this.salario * 0.1;
            System.out.println("El aumento salarial que recien es de " + this.salario + " pesos");
            System.out.println("Su salario junto con el aumento seria " + (this.salario * 1.1) + " pesos");

        } else {
            this.salario = this.salario * 0.05;
            System.out.println("El aumento salarial que recien es de " + this.salario + " pesos");
            System.out.println("Su salario junto con el aumento seria " + (this.salario * 1.1) + " pesos");
        }
    }

}